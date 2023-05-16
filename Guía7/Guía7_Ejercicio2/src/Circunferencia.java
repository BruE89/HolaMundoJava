package src;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio){

        this.radio = radio;

    }

    public double getRadio(){

        return radio;

    }

    public void setRadio(double radio){

        this.radio = radio;

    }

    public void crearCircunferencia(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el radio:");

        radio = leer.nextDouble();

        leer.close();

    }

    public void area(){

        double area = Math.PI * (radio*radio);

        System.out.println("El área de la circunferencia es: " + area);

    }

    public void perimetro(){

        double perimetro = 2 * Math.PI * radio;

        System.out.println("El perímetro de la circunferencia es: " + perimetro);

    }

}