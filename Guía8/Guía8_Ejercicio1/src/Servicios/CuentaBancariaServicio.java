package src.Servicios;

import java.util.Scanner;

import src.Entidades.CuentaBancaria;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearCuenta(CuentaBancaria cb){

        System.out.println("Por favor ingrese su número de cuenta : ");

        cb.setNumeroCuenta(leer.nextInt());

        System.out.println("A continuación, ingrese su DNI: ");

        cb.setDniCliente(leer.nextInt());

        System.out.println("Finalmente, ingrese su saldo actual: ");

        cb.setSaldoActual(leer.nextInt());

    }

    public void ingresar(CuentaBancaria cb){

        System.out.println("Por favor indique cantidad de dinero a ingresar en la cuenta: ");

        int ingreso = leer.nextInt();

        int actual = cb.getSaldoActual();

        int total = actual + ingreso;

        System.out.println("Su saldo actual ahora es de: " + (total));

        cb.setSaldoActual(total);

    }

    public void retirar(CuentaBancaria cb){

        System.out.println("Por favor indique cuánto dinero desea retirar: ");

        int retiro = leer.nextInt();

        int actual = cb.getSaldoActual();

        if (actual >= retiro){

            int total = actual - retiro;

            System.out.println("Operación exitosa, su saldo ahora es de : " + total);

            cb.setSaldoActual(total);

        }else {

            System.out.println("Error. Dinero insuficiente, se retirará sólo: " + actual);

            int total = 0;

            cb.setSaldoActual(total);

        }

    }

    public void extraccionRapida(CuentaBancaria cb){

        System.out.println("Seleccione el monto para la extracción rápida: ");

        int retiro = leer.nextInt();

        int actual = cb.getSaldoActual();

        if (retiro > (actual*0.2)){

            System.out.println("Error, la extracción rápida solo le permite retirar hasta un 20%");

        }else {

            actual -= retiro;

            System.out.println("Operación exitosa, su saldo actual es de " + actual);

            cb.setSaldoActual(actual);

        }

    }

    public void consultarSaldo(CuentaBancaria cb){

        int actual = cb.getSaldoActual();

        System.out.println("Su saldo es de: " + actual);

    }

    public void consultarDatos(CuentaBancaria cb){

        int numero = cb.getNumeroCuenta();

        int dni = cb.getDniCliente();

        int saldo = cb.getSaldoActual();

        System.out.println("Número de cuenta: " + numero);
        System.out.println("DNI: " + dni);
        System.out.println("Su saldo actual es de: " + saldo);

    }
    
}
