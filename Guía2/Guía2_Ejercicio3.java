/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

package Java.Guía2;

import java.util.Scanner;

public class Guía2_Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase para verla en mayúsculas y minúsculas: ");

        String frase = leer.nextLine();

        System.out.println(frase.toLowerCase());

        System.out.println(frase.toUpperCase());

        leer.close();
    }

}
