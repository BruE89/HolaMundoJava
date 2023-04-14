/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */


package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero del 1 al 10 para ver su equivalente en romano: ");

        int num = leer.nextInt();

        switch (num) {
            case 1:
                
                System.out.println("I");

                break;
            
            case 2:
                
                System.out.println("II");

                break;

            case 3:

                System.out.println("III");
                
                break;
            
            case 4:

                System.out.println("IV");
                
                break;

            case 5:

                System.out.println("V");
                
                break;

            case 6:

                System.out.println("VI");
                
                break;
            
            case 7:
                
                System.out.println("VII");

                break;

            case 8:

                System.out.println("VIII");
                
                break;
            
            case 9:
                
                System.out.println("IX");

                break;

            case 10:
                
                System.out.println("X");

                break;
            default:

                System.out.println("Solo se permiten números del 1 al 10");
                break;
        }
        leer.close();
    }
    
}
