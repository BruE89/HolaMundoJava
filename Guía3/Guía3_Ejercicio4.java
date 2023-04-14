/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */


package Java.Guía3;

import java.util.Scanner;

public class Guía3_Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una frase o palabra: ");

        String frase = leer.nextLine();

        String letra = frase.substring(0,1);

        if (letra.equalsIgnoreCase("a")){

            System.out.println("Correcto");

        }else {

            System.out.println("Incorrecto");
        }
        leer.close();
    }
}
