/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. 
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
 * el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, 
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */


package Java.Guía3;

import java.util.Scanner;

public class Guía3_Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una palabra que no supere los 5 caracteres: ");

        int contadorCorrectas = 0;

        int contadorIncorrectas = 0;

        String frase = "";

        while (!frase.equalsIgnoreCase("&&&&&")){

            frase = leer.next();

            int longitud = frase.length();

            String primeraLetra = frase.substring(0,1);

            String ultimaLetra = frase.substring(longitud-1);

            if (longitud <= 5 && primeraLetra.equalsIgnoreCase("x") && ultimaLetra.equalsIgnoreCase("o")) {

                System.out.println("Secuencia Correcta");
                contadorCorrectas++;
            
            }else if (frase.equalsIgnoreCase("&&&&&")){

                System.out.println("Secuencia de salida detectada, saliendo del programa...");

            }else {
    
                System.out.println("Secuencia Incorrecta");
                contadorIncorrectas++;
            }
        }

        System.out.println("");
        System.out.println("Lecturas Correctas: " + contadorCorrectas);
        System.out.println("Lecturas Incorrectas: " + contadorIncorrectas);
        
    leer.close();
        }
    }