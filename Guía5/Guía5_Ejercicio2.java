/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */


package Java.Guía5;

import java.util.Scanner;

public class Guía5_Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del arreglo");

        int n = leer.nextInt();
        
        int[] arreglo = new int[n];

        llenarAleatorio(arreglo);

        System.out.println("A continuación, ingrese el número que desea buscar (del 1 al 100)");

        int num_usuario = leer.nextInt();

        buscarNumero(num_usuario, arreglo);

        leer.close();

    }

    public static void llenarAleatorio(int[] a) {

        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * 101);
            
        }
        
    }

    public static void buscarNumero(int a , int[] b) {

        int contador = 0;

        for (int i = 0; i < b.length; i++) {

            if ( b[i] == a ) {

                contador++;

                System.out.println("Su número se encuentró en la posición " + i);

            }
            
        }

        if (contador > 0){

            System.out.println("El número fue localizado un total de " + contador + " veces.");

        }else {

            System.out.println("El número no se encuentra dentro del arrelgo");
        }
        
    }
    
}
