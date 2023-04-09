/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
 * este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * 
 * El cambio de divisas es:
 * 
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */



package Java.Guía4;

import java.util.Scanner;

public class Guía4_Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de Euros a convertir:");
        int euros = leer.nextInt();

        System.out.println("Ahora ingrese a qué moneda desea convertirlos:");
        System.out.println(("dolar, yen, euro"));
        String monedaDestino = leer.next();

        convertir(euros,monedaDestino);

        leer.close();

    }

    public static void convertir(double cantidad, String moneda) {

        boolean error = false;

        switch (moneda) {

            case "dolar":

                cantidad = cantidad * 1.28611;
                
                break;

            case "yen":

                cantidad = cantidad * 129.852;
                
                break;

            case "euro":

                cantidad = cantidad * 0.86;
                
                break;
        
            default:
                System.out.println("Error, valor mal ingresado");
                error = true;
                break;
        }

        if (error == false){
            System.out.println("En " + moneda + " la conversión quedaría en " + cantidad);
        }
        
    }
    
}
