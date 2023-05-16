package src.Servicios;

import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] arreglo){

        Arrays.setAll(arreglo, i -> Math.round((Math.random() * 100.0)) / 10.0);

    }

    public void mostrar(double[] arreglo){

        System.out.println(Arrays.toString(arreglo));

    }

    public void ordenar(double[] arreglo){

        Arrays.sort(arreglo);

    }

    public double[] inicializarB(double[] arregloA, double[] arregloB){

        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        Arrays.fill(arregloB, 10, 20, 0.5);

        return arregloB;

    }

}