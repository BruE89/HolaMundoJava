/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
 * Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar
 * la media de edad de los hijos de todas las familias.
 */

package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese cantidad de familias: ");

        int familias = leer.nextInt();

        System.out.println("Se han ingresado datos para " + familias + " familias");

        int hijos = 0;

        int edades = 0;

        for (int i = 1; i <= familias; i++) {

            System.out.println("Por favor ingrese cantidad de hijos para la familia " + i);

            hijos = hijos + leer.nextInt();
            
        }

        System.out.println("A continuación, ingrese las edades para cada uno de los " + hijos + " hijos");

        for (int x = 1; x <= hijos; x++) {

            edades = edades + leer.nextInt();
            
        }

        int promedio = edades / hijos;

        System.out.println("La edad promedio de los " + hijos + " hijos, en las " + familias + " familias es de: " + promedio + " años");

        leer.close();

    }
}
