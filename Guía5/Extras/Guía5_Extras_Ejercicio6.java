/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
 * a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
 * Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
 * Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
 * Finalmente imprima por pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */

package Java.Guía5.Extras;

import java.util.Scanner;

public class Guía5_Extras_Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Character [][] matriz = new Character[20][20];

        matriz = inicializarMatriz(matriz);

        matriz = ingresarPalabras(matriz,leer);

        matriz = rellenarMatriz(matriz);

        mostrarMatriz(matriz);

    }

    public static Character[][] ingresarPalabras(Character[][] a, Scanner leer) {

        System.out.println("Por favor ingrese 5 palabras, mínimo 3 caracteres y máximo 5:");

        for (int i = 0; i < 5; i++) {

            System.out.println("Palabra número " + (i+1));

            String palabra = leer.nextLine();

            while (palabra.length() < 3 || palabra.length() > 5) {
    
                System.out.println("ERROR. La palabra ingresada debe tener minimo 3 caracteres y máximo 5, intente nuevamente");
    
                palabra = leer.nextLine();
                
            }

            int num1 = 0;

            int num2 = 0;

            do {

                num1 = (int) (Math.random() * 20);

                num2 = (int) (Math.random() * 16);
                
            } while (a[num1][num2] != '-' || a[num1][num2+1] != '-' || a[num1][num2+2] != '-' || a[num1][num2+3] != '-' || a[num1][num2+4] != '-');

            System.out.println("FILA " + num1);

            System.out.println("COLUMNA " + num2);

            System.out.println("");

            for (int j = 0; j < palabra.length(); j++) {
    
                Character letra = palabra.charAt(j);
    
                a[num1][(num2 + j)] = letra;
                
            }
            
        }

        return a;
        
    }

    public static void mostrarMatriz(Character[][] b) {

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                System.out.print("[" + b[i][j] + "]");
                
            }

            System.out.println("");
            
        }
        
    }

    public static Character[][] inicializarMatriz(Character[][] c) {

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[0].length; j++) {

                c[i][j] = '-';
                
            }
            
        }

        return c;
        
    }

    public static Character[][] rellenarMatriz(Character[][] d) {

        for (int i = 0; i < d.length; i++) {

            for (int j = 0; j < d[0].length; j++) {

                if (d[i][j] == '-'){

                    char num = Character.forDigit((int) (Math.random() * 10),11);

                    d[i][j] = (char) num;

                }
                
            }
            
        }

        return d;
        
    }
    
}
