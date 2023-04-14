/*
 * Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
 * la cantidad de números pares y la cantidad de números impares. 
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
 * Nota: recordar el uso de la sentencia break.
 */


package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int cantidadPar = 0;

        int cantidadImpar = 0;

        int cantidadTotal = 0;

        while (true){

            System.out.println("Ingrese un número entero: ");

            int num = leer.nextInt();

            if(num <= 0){

                System.out.println("Los números negativos y el cero no se sumarán");
                continue;

            }

            if (num % 5 == 0){

                System.out.println("Múltiplo de 5 detectado. Programa terminado.");
                break;

            }else if (num % 2 == 0){

                cantidadPar++;
                cantidadTotal++;

            }else {

                cantidadImpar++;
                cantidadTotal++;

            }
        }

        System.out.println("La cantidad total de números es: " + cantidadTotal);
        System.out.println("La cantidad de números pares es: " + cantidadPar);
        System.out.println("La cantidad de números impares es: " + cantidadImpar);

        leer.close();
    }
    
}


