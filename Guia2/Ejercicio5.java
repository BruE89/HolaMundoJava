package Java.Guia2;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero para ver el Doble, el Triple y la raiz cuadrada: ");

        int num = leer.nextInt();

        int doble = num * 2;

        int triple = num * 3;

        float raiz = (float) Math.sqrt(num);

        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);
        System.out.println("La raíz cuadrada es " + raiz);

        leer.close();

    }
    
}
