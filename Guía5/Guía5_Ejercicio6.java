/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
 * sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
 * y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
 * es decir, están entre el 1 y el 9.
 */



package Java.Guía5;

import java.util.Scanner;

public class Guía5_Ejercicio6 {

    public static void main(String[] args) {

        int [][] matriz = armarYllenar();

        comprobarMagico(matriz);
        
    }

    public static int[][] armarYllenar() {

        Scanner leer = new Scanner(System.in);

        int [][] a = new int[3][3];

        int contador = 0;

        System.out.println("A continuación, ingrese los 9 números para la matriz de 3x3:");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                contador++;

                System.out.println("Ingrese el número " + contador );

                int n = leer.nextInt();

                while (n < 1 || n > 9) {

                    System.out.println("El número debe estar entre 1 y 9");

                    n = leer.nextInt();
                    
                }

                a[i][j] = n;
                
            }
            
        }

        leer.close();

        return a;
        
    }

    public static void comprobarMagico(int[][] a) {

        int[] sumaFilas = new int[3];

        int[] sumaColumnas = new int[3];

        int sumaDiagonal1 = 0;

        int sumaDiagonal2 = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sumaFilas[i] += a[i][j];
                sumaColumnas[j] += a[i][j];

                if (i == j) {

                    sumaDiagonal1 += a[i][j];

                }

                if (i + j == 2) {

                    sumaDiagonal2 += a[i][j];

                }
            }
        }
        
        if (sumaFilas[0] == sumaFilas[1] && sumaFilas[0] == sumaFilas[2] && sumaFilas[0] == sumaColumnas[0]){

            if (sumaColumnas[0] == sumaColumnas[1] && sumaColumnas[0] == sumaColumnas[2]){

                if (sumaDiagonal1 == sumaFilas[0] && sumaDiagonal1 == sumaDiagonal2){

                    System.out.println("El cuadrado es mágico");

                }else{

                    System.out.println("El cuadrado NO es mágico");
                }

            }else{

                System.out.println("El cuadrado NO es mágico");
            }
        }else {

            System.out.println("El cuadrado NO es mágico");
        }

    }
    
}
