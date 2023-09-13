package Servicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoService {

    Scanner leer = new Scanner(System.in);

    Random r = new Random();

    int numSecreto = 0;

    int intento = 0;

    int intentosHechos = 0;

    //------------------------------------------------------------------------------------------------------

    public void generarNuevoNumeroSecreto(){

        numSecreto = r.nextInt(500) + 1;

    }

    //------------------------------------------------------------------------------------------------------

    public void comprobarNumero() throws InputMismatchException{

        while (true) {

            if (intento == numSecreto) {

                System.out.println("Felicitaciones! Adivinaste!");

                System.out.println("Te tomó " + intentosHechos + " intentos adivinar el número secreto");

                break;

            }

            System.out.println("Incorrecto! intente nuevamente...");

            if (intento > numSecreto) {

                System.out.println("Pista: tu número es demasiado alto");

            } else if (intento < numSecreto) {

                System.out.println("Pista: tu número es demasiado bajo");

            }

            intento = leer.nextInt();

            leer.nextLine();

            intentosHechos++;

        }

    }

    public void intentarAdivinar(){

        while (intento != numSecreto) {

            try {

                System.out.println("Intente adivinar el número secreto: (del 1 al 500)");

                System.out.println(numSecreto);

                intento = leer.nextInt();

                leer.nextLine();

                intentosHechos++;

                comprobarNumero();


            } catch (InputMismatchException e) {

                System.out.println("Error, el valor introducido debe ser un número entero");

                System.out.println("El intento quedará contabilizado como penalización");

                intentosHechos++;

                leer.nextLine();

            } catch (Exception e) {

                System.out.println("Error desconocido. Terminando programa");

            }

        }

    }

}