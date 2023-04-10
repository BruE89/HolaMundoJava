/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos 
 * para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
 * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * 
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * 
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
 * Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
 * teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */


package Java.Guía5.Extras;

import java.util.Scanner;

public class Guía5_Extras_Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        calcularAlumnos(leer);

    }

    public static void calcularAlumnos(Scanner leer) {

        int[] arreglo = new int[10];

        double practico1 = 0;
        double practico2 = 0;

        double integrador1 = 0;
        double integrador2 = 0;

        int aprobados = 0;
        int desaprobados = 0;

        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma = 0;

            System.out.println("Por favor ingrese las notas a continuación para el alumno " + (i+1));

            System.out.println("");
    
            System.out.println("Primer Trabajo Práctico Evaluativo (10%)");
            practico1 = leer.nextInt();
    
            System.out.println("Segundo trabajo práctico evaluativo (15%)");
            practico2 = leer.nextInt();
    
            System.out.println("Primer Integrador (25%)");
            integrador1 = leer.nextInt();
    
            System.out.println("Segundo integrador (50%)");
            integrador2 = leer.nextInt();

            suma = (practico1 * 0.1) + (practico2 * 0.15) + (integrador1 * 0.25) + (integrador2 * 0.5);

            if (suma >= 7){

                aprobados++;

            }else if (suma < 7){

                desaprobados++;
            }
            
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos desaprobados: " + desaprobados);

    }

}
