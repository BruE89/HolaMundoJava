/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
 * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */



package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor especifique la cantidad total de números a ingresar: ");

        int n = leer.nextInt();

        int contador = 0;

        int max = 0;
        int min = 999999999;
        int suma = 0;
        float promedio;

        System.out.println("A continuación, ingrese los números uno a uno: ");

        while (contador < n){

            int num = leer.nextInt();

            suma = suma + num;

            contador++;

            if (num > max){

                max = num;

            }

            if (num < min){

                min = num;

            }
        }

        promedio = suma / n;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        leer.close();

    }
}
