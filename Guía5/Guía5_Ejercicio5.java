/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */



package Java.Guía5;

import java.util.concurrent.ThreadLocalRandom;

public class Guía5_Ejercicio5 {

    public static void main(String[] args) {
        
        int[][] matriz = prepararMatriz();

        mostrarMatriz(matriz);

        System.out.println("");

        int[][] matrizTraspuesta = trasponerMatriz(matriz);

        mostrarMatriz(matrizTraspuesta);

        comprobarAntisimetrica(matriz, matrizTraspuesta);



    }

    public static int[][] prepararMatriz() {

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);

                matriz[i][j] = randomNum;
                
            }
            
        }

        return matriz;
        
    }

    public static int[][] trasponerMatriz(int[][] a) {

        int[][] temp = new int[3][3]; 

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                temp[j][i] = a[i][j];
                
            }
            
        }

        return temp;
        
    }

    public static void mostrarMatriz(int[][] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.println("");

            for (int j = 0; j < a.length; j++) {

                System.out.print("[" + a[i][j] + "]");
                
            }
            
        }
        
    }

    public static void comprobarAntisimetrica(int[][] a , int[][] at) {

        boolean traspuesta = true;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i][j] == 0 && at[i][j] == 0) {

                    continue;
                    
                }else if (a[i][j] == -at[i][j]){

                    continue;

                }else {

                    traspuesta = false;
                    break;
                }
                
            }
            
        }

        System.out.println("");
        System.out.println("");

        if (traspuesta == true) {

            System.out.println("La matriz es antisimérica");

        }else {

            System.out.println("La matriz NO es antisimétrica");
        }
        
    }
    
}
