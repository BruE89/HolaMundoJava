/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */


package Java.Guía3.Extras;

import java.util.Scanner;

public class Guía3_Extras_Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una cantidad de minutos: ");

        int minutos = leer.nextInt();

        int dias = minutos / 1440;

        int horas = (minutos % 1440) / 60;

        System.out.println("Los minutos ingresados equivalen a " + dias + " días y " + horas + " horas.");

        leer.close();

    }
}