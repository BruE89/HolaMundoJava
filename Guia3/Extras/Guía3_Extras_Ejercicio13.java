/*
 * Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
 * Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
 * 1
 * 12
 * 123
 */


package Java.Guia3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un número para la escalera: ");

        int n = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
                
            }

            System.out.println("");
            
        }

        leer.close();

    }
}
