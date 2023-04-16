package src;

import java.util.Scanner;

public class Puntos {

    private double x1, y1, x2, y2;

    public void crearPuntos(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar coordenadas del primer punto");
        System.out.print("x1: ");
        x1 = leer.nextDouble();
        System.out.print("y1: ");
        y1 = leer.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        System.out.print("x2: ");
        x2 = leer.nextDouble();
        System.out.print("y2: ");
        y2 = leer.nextDouble();

        leer.close();

    }

    public double distancia(){

        double distancia;

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distancia;

    }
    
}
