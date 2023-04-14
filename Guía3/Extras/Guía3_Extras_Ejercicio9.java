/*
 * Simular la división usando solamente restas. 
 * Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, 
 * y el número de restas realizadas es el cociente.
 *  Por ejemplo: 50 / 13:
 * 50 – 13 = 37     una resta realizada
 * 37 – 13 = 24     dos restas realizadas
 * 24 – 13 = 11     tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */



package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese dos números mayores que 1 (el primero debe ser mas grande que el segundo) ");

        int num1 = leer.nextInt();

        int num2 = leer.nextInt();

        int contador = 0;

        int resto;

        while (num1 >= num2){
            
            resto = num1 - num2;

            contador++;

            System.out.println(num1 + " - " + num2 + " = " + resto + " -> " + contador + " restas hechas" );

            num1 = resto;

        }

        System.out.println("El residuo es: " + num1);
        System.out.println("El cociente es: " + contador);

        leer.close();

    }
    
}
