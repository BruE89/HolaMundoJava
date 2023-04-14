/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 * el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 */

package Java.Guía2;

import java.util.Scanner;
import java.lang.Math;

public class Guía2_Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un número para ver el Doble, el Triple y la raíz cuadrada: ");

        int num = leer.nextInt();

        int doble = num * 2;

        int triple = num * 3;

        double raiz = Math.sqrt(num);

        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);
        System.out.println("La raíz cuadrada es " + raiz);

        leer.close();

    }
    
}
