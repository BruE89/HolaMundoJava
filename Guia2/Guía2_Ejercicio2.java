/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */

package Java.Guia2;

import java.util.Scanner;

public class Guía2_Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa tu nombre: ");

        String nombre = leer.nextLine();

        System.out.println("Bienvenido: " + nombre + "!!");

        leer.close();
        
    }
        
}
