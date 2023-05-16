package src;

import java.util.Scanner;

public class Cuenta {

    private int saldo;

    private String titular;

    public void retirarDinero(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular");

        titular = leer.nextLine();

        System.out.println("Por favor ingrese su saldo inicial");

        saldo = leer.nextInt();

        System.out.print("Bienvenido " + titular + "! Seleccione el monto que desea retirar: ");

        int extraccion = leer.nextInt();

        if (extraccion > saldo){

            System.out.println("Error. Saldo insuficiente");

        }else {

            saldo = saldo - extraccion;

            System.out.print("Operación exitosa, saldo restante: $" + saldo);

        }

        leer.close();

    }
    
}
