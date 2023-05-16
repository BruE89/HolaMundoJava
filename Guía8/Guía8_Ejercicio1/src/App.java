package src;

import src.Entidades.CuentaBancaria;
import src.Servicios.CuentaBancariaServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        CuentaBancaria micuenta = new CuentaBancaria();

        cbs.crearCuenta(micuenta);

        System.out.println("");

        cbs.ingresar(micuenta);

        System.out.println("");

        cbs.retirar(micuenta);

        System.out.println("");

        cbs.extraccionRapida(micuenta);

        System.out.println("");

        cbs.consultarSaldo(micuenta);

        System.out.println("");

        cbs.consultarDatos(micuenta);

    }
}
