package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        Rectangulo miRectangulo = new Rectangulo();

        System.out.println("Ingrese las dimensiones del rectangulo");

        System.out.print("Base: ");
        int base = leer.nextInt();

        System.out.print("Altura: ");
        int altura = leer.nextInt();

        System.out.println("");

        miRectangulo.crearRectangulo(base,altura);

        System.out.println("La superficie del rectángulo es: " + miRectangulo.superficie());

        System.out.println("");

        System.out.println("El perímetro del rectángulo es: " + miRectangulo.perimetro());

        System.out.println("");

        System.out.println("El rectángulo quedaría de la siguiente manera:");

        System.out.println("");

        miRectangulo.dibujarRectangulo();

        leer.close();

    }

}