/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
 * de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando
 * personas y frenar cuando el usuario ingrese la palabra “No”.
 */


package Java.Guía4;

import java.util.Scanner;

public class Guía4_Ejercicio2 {

    public static void main(String[] args) {

        datos();

    }
    
    public static void datos() {

        Scanner leer = new Scanner(System.in);

        String respuesta;


        do {

            System.out.println("Ingrese datos personales");

            System.out.println("Nombre:");
            String nombre = leer.next();

            System.out.println("Edad:");
            int edad = leer.nextInt();

            String mayorOno;

            if (edad >= 18){

                mayorOno = "mayor";

            }else {

                mayorOno = "menor";
            }

            System.out.println(nombre + ", de " + edad + " años, es " + mayorOno + " de edad.");
            System.out.println("Desea seguir ingresando datos? (Si/No)");
            respuesta = leer.next();
            
        } while (!respuesta.equalsIgnoreCase("no"));

        System.out.println("Programa terminado.");

        leer.close();

    }
}
