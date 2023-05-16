package src;

import java.util.Scanner;

public class Juego {

    public void iniciar_juego(){

        Scanner leer = new Scanner(System.in);

        boolean salir = false;

        int chances = 3;

        int intentos = 0;

        System.out.println("Jugador 1, por favor ingrese el número a adivinar");

        int numero = leer.nextInt();

        while (salir == false && chances != 0) {

            System.out.print("Jugador 2, intenta adivinar: ");
    
            int intento = leer.nextInt();

            chances--;
            intentos++;

            if (intento == numero){

                System.out.println("Adivinaste! Felicitaciones!");
                System.out.println("El número era: " + numero);
                System.out.println("Utilizaste " + intentos + " intentos");
                salir = true;


            }else if (chances == 0){

                System.out.println("Perdiste! Te quedaste sin intentos!");

            }else if(intento > numero){

                System.out.println("Intenta con un número mas bajo...");

            }else if (intento < numero){

                System.out.println("Intenta con un número mas alto...");

            }

            System.out.println("");
     
        }

        leer.close();

    }
    
}
