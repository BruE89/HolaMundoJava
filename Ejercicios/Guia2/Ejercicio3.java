package Java.Ejercicios.Guia2;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase para verla en mayusculas y minusculas: ");

        String frase = leer.nextLine();

        System.out.println(frase.toLowerCase());

        System.out.println(frase.toUpperCase());

        leer.close();
    }

}
