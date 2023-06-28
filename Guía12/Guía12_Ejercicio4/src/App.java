package src;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Circulo circulo = new Circulo(10);

        Rectangulo rectangulo = new Rectangulo(5, 3);

        System.out.println(circulo.calcularArea());

        System.out.println(circulo.calcularPerimetro());

        System.out.println(rectangulo.calcularArea());

        System.out.println(rectangulo.calcularPerimetro());

    }

}