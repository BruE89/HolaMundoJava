/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */


package Java.Guía5.Extras;

import java.util.Scanner;

public class Guía5_Extras_Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de filas de la matriz");

        int n = leer.nextInt();

        System.out.println("Ahora ingrese la cantidad de columnas");

        int m = leer.nextInt();
        
        int[][] matriz = new int[n][m];

        matriz = llenarMatriz(matriz);

        mostrarMatriz(matriz);

        System.out.println("");

        sumarElementos(matriz);

        leer.close();

    }

    public static int[][] llenarMatriz(int[][] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                a[i][j] = (int) (Math.random() * 10);
                
            }
            
        }

        return a;

    }

    public static void mostrarMatriz(int[][] b) {

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                System.out.print("[" + b[i][j] + "]");
                
            }

            System.out.println("");
            
        }
        
    }

    public static void sumarElementos(int[][] c) {

        int suma = 0;

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[0].length; j++) {

                suma = suma + c[i][j];
                
            }
            
        }

        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
        
    }
    
}
