/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
 * Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
 * Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
 * Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */



package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero: ");

        float num = leer.nextInt();

        int contador = 0;

        while (num >= 1){

            num = num / 10;
            contador++;

        }

        System.out.println("La cantidad de dígitos es de: " + contador);

        leer.close();

    }
    
}
