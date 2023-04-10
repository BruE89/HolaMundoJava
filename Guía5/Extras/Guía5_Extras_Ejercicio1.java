/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
 * con los valores ingresados por el usuario.
 */


package Java.Guía5.Extras;

import java.util.Scanner;

public class Guía5_Extras_Ejercicio1 {

    public static void main(String[] args) {

        int[] arregloMain = crearArreglo();

        sumarArreglo(arregloMain);
        
    }

    public static int[] crearArreglo() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del arreglo");

        int n = leer.nextInt();

        int valor;

        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Ingrese el valor " + i + " del arreglo");

            valor = leer.nextInt();

            arreglo[i] = valor;
            
        }

        leer.close();

        return arreglo;
        
    }

    public static void sumarArreglo(int[] a) {

        int suma = 0;

        for (int i = 0; i < a.length; i++) {

            suma = suma + a[i];
            
        }

        System.out.println("La suma de los valores del arreglo es de: " + suma);
        
    }
    
}
