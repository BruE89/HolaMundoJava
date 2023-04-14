/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */


package Java.Guía3;

import java.util.Scanner;

public class Guía3_Ejercicio5 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor seleccione el límite: ");

        int limite = leer.nextInt();

        int suma = 0;

        int contador = 0;

        System.out.println("Ahora ingrese números que se irán sumando hasta superar el límite ingresado: ");

        while (suma < limite) {

            contador++;
            
            System.out.println("Ingrese un numero (" + contador + ")" );

            int num = leer.nextInt();

            suma = suma + num;

        }

        System.out.println("Límite alcanzado, la sumatoria total es de: " + suma);

        leer.close();
    }

}
