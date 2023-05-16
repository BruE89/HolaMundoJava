package src;

import src.Servicios.ArregloService;

public class App {
    public static void main(String[] args) throws Exception {

        ArregloService as = new ArregloService();

        double[] arregloA = new double[50];

        double[] arregloB = new double[20];

        System.out.println("INICIALIZAR A");
        as.inicializarA(arregloA);
        System.out.println("");

        System.out.println("MOSTRAR A");
        as.mostrar(arregloA);
        System.out.println("");

        System.out.println("ORDENAR A");
        as.ordenar(arregloA);
        System.out.println("");

        System.out.println("INICIALIZAR B");
        as.inicializarB(arregloA, arregloB);
        System.out.println("");

        System.out.println("MOSTRAR A");
        as.mostrar(arregloA);
        System.out.println("");

        System.out.println("MOSTRAR B");
        as.mostrar(arregloB);

    }
}
