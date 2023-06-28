package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio;

    protected String color;

    protected char consumo;

    protected int peso;

    Scanner leer = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //------------------------------------------------------------------------------------

    public enum letrasConsumo{

        A,B,C,D,E,F;

    }

    private char comprobarConsumoEnergetico(char letra){

        letra = Character.toUpperCase(letra);

        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {

            return 'F';
            
        }else {

            return letra;

        }

    }

    private String comprobarColor(String color){

        color = color.toLowerCase();

        if (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")) {

            return "Blanco";
            
        }else {

            return color;

        }

    }

    public void crearElectrodomestico(){

        System.out.println("Por favor ingrese el color del electrodoméstico:");

        this.color = comprobarColor(leer.nextLine());

        System.out.println("Ingrese el consumo electrico (Opciones: A | B | C | D | E | F )");

        this.consumo = comprobarConsumoEnergetico(leer.next().charAt(0));

        System.out.println("Ingrese el peso del electrodoméstico");

        this.peso = leer.nextInt();

        leer.nextLine();

        this.precio = 1000;

    }

    public void precioFinal(){

        char letra = this.consumo;

        int peso = this.peso;

        switch (letra) {

            case 'A':

                this.precio += 1000;
                
                break;

            case 'B':

                this.precio += 800;

                break;

            case 'C':

                this.precio += 600;

                break;

            case 'D':

                this.precio += 500;

                break;

            case 'E':

                this.precio += 300;

                break;

            case 'F':

                this.precio += 100;

                break;

            default:
                break;
        }

        if (peso >= 1 && peso <= 19) {

            this.precio += 100;
            
        }else if (peso >= 20 && peso <= 49) {

            this.precio += 500;
            
        }else if (peso >= 50 && peso <= 79) {

            this.precio += 800;
            
        }else if (peso >= 80) {

            this.precio += 1000;
            
        }

    }
    
}