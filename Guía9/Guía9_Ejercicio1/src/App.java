package src;

import src.Servicios.CadenaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        CadenaServicio cs = new CadenaServicio();

        cs.mostrarVocales();

        cs.invertirFrase();

        cs.vecesRepetido("a");

        cs.compararLongitud("casa");

        cs.unirFrases("hola");

        cs.reemplazar("x");

        System.out.println(cs.contiene("a"));

    }
}
