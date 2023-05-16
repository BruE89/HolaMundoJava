package src.Entidades;

import java.util.Scanner;

public class AdivinarMes {

    Scanner leer = new Scanner(System.in);

    private String[] arreglo = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    private String mesSecreto = arreglo[9];

    public void iniciarJuego(){

        while (true) {

            System.out.println("Intente adivinar el mes secreto!");

            String intento = leer.nextLine();

            if (intento.equalsIgnoreCase(mesSecreto)) {

                System.out.println("Adivinaste! bravo!");

                break;
                
            }else {

                System.out.println("Fallaste!");

            }
            
        }

    }

}
