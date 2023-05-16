package src;

import src.Servicios.ParDeNumerosService;

public class App {
    public static void main(String[] args) throws Exception {

        ParDeNumerosService par = new ParDeNumerosService();

        par.mostrarValores();

        System.out.println("Valor mayor: " + par.devolverMayor());

        par.calcularPotencia();

        par.calculaRaiz();

    }

}