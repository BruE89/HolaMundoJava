package Entidades;

public class Circulo implements calculosFormas{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea(){

        double area = PI * Math.pow(this.radio, 2);

        return area;

    }

    @Override
    public double calcularPerimetro(){

        double diametro = this.radio * 2;

        double perimetro = PI * diametro;

        return perimetro;

    }
    
}
