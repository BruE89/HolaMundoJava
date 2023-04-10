/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 */

package Java.Guía5;

public class Guía5_Ejercicio1 {

    public static void main(String[] args) {

        int[] arreglo = new int[100];

        llenarArreglo(arreglo);

        mostrarArreglo(arreglo);

    }

    public static int[] llenarArreglo(int[] A) {

        for (int i = 0; i < 100; i++) {

            A[i] = i+1;
            
        }
        
        return A;

    }

    public static void mostrarArreglo(int [] B) {

        for (int i = 99; i >= 0; i--) {

            System.out.println("[" + B[i] + "]");
    
        }
        
    }
    
}
