/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

package Java.Guía2;

import java.util.Scanner;

public class Guía2_Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese grados centígrados para su conversión a Fahrenheit: ");

        int temp = leer.nextInt();

        int Fahrenheit = 32 + (9 * temp / 5);

        System.out.println("En Fahrenheit serían " + Fahrenheit + " grados");

        leer.close();

    }
    
}
