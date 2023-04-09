/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo,
 * sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */



package Java.Guía4;

import java.util.Scanner;

public class Guía4_Ejercicio4 {

    public static void main(String[] args) {
        
        System.out.println(primo());

    }
    
    public static boolean primo() {

        Scanner leer = new Scanner(System.in);

        int contador = 0;

        System.out.println("Por favor ingrese un número entero");

        int num = leer.nextInt();

        leer.close();

        for (int i = 1; i <= num; i++) {

            if (num%i == 0){

                contador++;
            }
            
        }

        if (contador == 2){

            return true;

        }else {

            return false;

        }
        
    }
}
