/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */

 
package Java.Guía5.Extras;

import java.util.Scanner;

public class Guía5_Extras_Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] arreglo1 = crearArreglo(leer);

        int[] arreglo2 = crearArreglo(leer);

        compararArreglos(arreglo1, arreglo2);

        leer.close();

    }

    public static int[] crearArreglo(Scanner leer) {

        System.out.println("Ingrese el tamaño que desea para el arreglo");

        int n = leer.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("A continuación, ingrese valores hasta llenar el arreglo");

            arreglo[i] = leer.nextInt();
            
        }

        return arreglo;
        
    }

    public static void compararArreglos(int[] a , int[] b) {

        boolean resultado = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == b[i]){

                continue;

            }else{

                resultado = false;

                break;

            }
            
        }

        if (resultado == true) {

            System.out.println("Los arreglos son iguales");
        }else {

            System.out.println("Los arreglos NO son iguales");
        }
        
    }
    
}
