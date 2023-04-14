/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
 * 
    * * * *
    *     *
    *     *
    * * * *

 */

package Java.Guía3;

import java.util.Scanner;

public class Guía3_Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de caracteres para cada lado del cuadrado");

        int num = leer.nextInt();

        String letra = "* ";

        String espacio = "  ";

        for (int i = 1; i <= num; i++){

            if (i == 1 || i == num){

                System.out.println(letra.repeat(num));

            }else {

                System.out.println(letra + espacio.repeat(num-2) + letra);
            }

        }

        leer.close();

        }
    
    }
    

