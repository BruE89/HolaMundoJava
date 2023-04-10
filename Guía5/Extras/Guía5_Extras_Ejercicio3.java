/*
 * Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.
 */


package Java.Guía5.Extras;

public class Guía5_Extras_Ejercicio3 {

    public static void main(String[] args) {

        int[] arreglo = new int[3];

        arreglo = llenarAleatorio(arreglo);

        mostrarArreglo(arreglo);

    }

    public static int[] llenarAleatorio(int[] a) {

        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * 11);
            
        }

        return a;
        
    }

    public static void mostrarArreglo(int[] b) {

        for (int i = 0; i < b.length; i++) {

            System.out.print("[" + b[i] + "]");
            
        }
        
    }
    
}
