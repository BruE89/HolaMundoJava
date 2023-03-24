package Java.Guia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese grados centígrados para su conversion a Fahrenheit: ");

        int temp = leer.nextInt();

        int Fahrenheit = 32 + (9 * temp / 5);

        System.out.println("En Fahrenheit serían " + Fahrenheit + " grados");

        leer.close();

    }
    
}
