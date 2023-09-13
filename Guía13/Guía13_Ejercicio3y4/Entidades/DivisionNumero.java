package Entidades;

import java.util.Scanner;

public class DivisionNumero {

    public void convertirYdividir(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");

        String num1 = leer.nextLine();

        System.out.println("Ingrese el segundo número");

        String num2 = leer.nextLine();

        int num1Convertido = Integer.parseInt(num1);

        int num2Convertido = Integer.parseInt(num2);

        System.out.println(num1Convertido / num2Convertido);

        leer.close();

    }
    
}