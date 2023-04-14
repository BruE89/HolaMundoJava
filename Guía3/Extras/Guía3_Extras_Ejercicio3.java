/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */


package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una letra: ");

        String letra = leer.nextLine();

        if (letra.equalsIgnoreCase("A") 
        || letra.equalsIgnoreCase("E") 
        || letra.equalsIgnoreCase("I")
        || letra.equalsIgnoreCase("O") 
        || letra.equalsIgnoreCase("U")){

            System.out.println("La letra ingresada es una vocal");

        }else {

            System.out.println("La letra ingresada NO es una vocal");
        }
    
    leer.close();

    }
    
}
