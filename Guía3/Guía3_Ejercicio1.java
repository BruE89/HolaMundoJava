/*
 * Crear un programa que dado un número determine si es par o impar.
 */

package Java.Guía3;

import java.util.Scanner;

public class Guía3_Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número para determinar si es par o impar: ");

        int num = leer.nextInt();

        if (num == 0){

            System.out.println("El número no puede ser cero");

        }else if (num % 2 == 0){

            System.out.println("El número es par");

        }else {

            System.out.println("El número es impar");
        }

        leer.close();

        }
    }
