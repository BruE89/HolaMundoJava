/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */



package Java.Guía5;

import java.util.concurrent.ThreadLocalRandom;

public class Guía5_Ejercicio4 {

    public static void main(String[] args) {
        
        int[][] matriz = prepararMatriz();

        System.out.println("Matriz Normal");

        mostrarMatriz(matriz);

        System.out.println("");
        System.out.println("");

        System.out.println("Matriz Traspuesta");

        traspuesta(matriz);

    }
    

    public static int[][] prepararMatriz() {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);

                matriz[i][j] = randomNum;
                
            }
            
        }

        return matriz;
        
    }

    public static void mostrarMatriz(int[][] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.println("");

            for (int j = 0; j < a.length; j++) {

                System.out.print("[" + a[i][j] + "]");
                
            }
            
        }
        
    }

    public static void traspuesta(int[][] b) {

        for (int i = 0; i < b.length; i++) {

            System.out.println("");

            for (int j = 0; j < b.length; j++) {

                System.out.print("[" + b[j][i] + "]");
                
            }
            
        }
        
    }
}
