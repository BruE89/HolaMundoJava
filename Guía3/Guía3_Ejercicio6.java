/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
 * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
 * caso contrario se vuelve a mostrar el menú.
 */


package Java.Guía3;

import java.io.IOException;
import java.util.Scanner;

public class Guía3_Ejercicio6 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner leer = new Scanner(System.in);

        int opcion;

        System.out.println("Por favor ingrese 2 números enteros positivos: ");

        int num1 = leer.nextInt();

        int num2 = leer.nextInt();

        int resultado;

        boolean salir = false;

        do {
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("");
        System.out.println("Elija una opción");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                break;
            
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                break;

            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                break;

            case 5:
                System.out.println("¿Está seguro que desea salir del programa? (S/N)");

                String respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("s")){

                    System.out.println("Adiós!");
                    salir = true;
                    break;

                }else {

                    System.out.println("Volviendo al MENU principal...");
                    System.out.println("");
                }

                break;

            default:
                System.out.println("La opción ingresada no es válida");
                System.out.println("Presione cualquier tecla para volver al MENU principal");
                System.in.read();
                break;
        }

        }while (salir == false);

    leer.close();
    }
}
