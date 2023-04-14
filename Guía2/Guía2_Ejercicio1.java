/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */

package Java.Guía2;

import java.util.Scanner;

public class Guía2_Ejercicio1 {

    public static void main (String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un número: ");

        int num1 = leer.nextInt();

        System.out.println("Por favor ingrese un segundo número: ");

        int num2 = leer.nextInt();

        int resultado = num1 + num2;

        System.out.println("La suma de ambos números es: " + resultado);

        leer.close();
    }
    
}
