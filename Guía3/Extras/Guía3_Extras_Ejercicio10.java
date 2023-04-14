/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. 
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */


package Java.Guía3.Extras;

import java.util.Scanner;
import java.lang.Math;

public class Guía3_Extras_Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("A continuación, se generará un número multiplicando dos números aleatorios, su objetivo es tratar de adivinar dicho número");

        int num1 = (int) ((Math.random() * (11 - 1)) + 1);

        int num2 = (int) ((Math.random() * (11 - 1)) + 1);
    
        int total = num1 * num2;

        System.out.println("El número ya está listo, comience con su primer intento: ");

        int intento = leer.nextInt();

        while (intento != total){

            System.out.println("Fallaste! intenta de nuevo!");

            intento = leer.nextInt();

        }

        System.out.println("Adivinaste! el número era: " + total);

        leer.close();
    }
    
}
