/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
 * multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben 
 * devolver sus resultados para imprimirlos en el main. 
 */

package Java.Guía4;

import java.io.IOException;
import java.util.Scanner;

public class Guía4_Ejercicio1 {

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor empiece ingresando dos números enteros: ");

        System.out.println("Número 1:");
        int num1 = leer.nextInt();

        System.out.println("Número 2:");
        int num2 = leer.nextInt();

        int opcion;

        do {

            menu();
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("El resultado es: " + suma(num1,num2));
                    System.out.println("Presione cualquier tecla para volver al MENU principal");
                    System.in.read();
                    break;

                case 2:
                    System.out.println("El resultado es: " + resta(num1,num2));
                    System.out.println("Presione cualquier tecla para volver al MENU principal");
                    System.in.read();
                    break;

                case 3:
                    System.out.println("El resultado es: " + multi(num1,num2));
                    System.out.println("Presione cualquier tecla para volver al MENU principal");
                    System.in.read();
                    break;

                case 4:
                    System.out.println("El resultado es: " + dividir(num1,num2));
                    System.out.println("Presione cualquier tecla para volver al MENU principal");
                    System.in.read();
                    break;

                case 5:

                    break;

                default:

                System.out.println("La opción seleccionada no existe, intente otra vez.");
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                    break;
            }

        } while (opcion != 5);
        
        System.out.println("Programa terminado. Adiós!");

        leer.close();

    }
    
    public static void menu() {

        System.out.println("A continuación, elija qué operación realizar:");
        System.out.println("");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
    }

    public static int suma(int a, int b) {
        
        int resultado = a + b;

        return resultado;

    }

    public static int resta(int a , int b) {

        int resultado = a - b;

        return resultado;
        
    }

    public static int multi(int a , int b) {

        int resultado = a * b;

        return resultado;
        
    }

    public static float dividir(float a , float b) {

        float resultado = a / b;

        return resultado;
        
    }

}
