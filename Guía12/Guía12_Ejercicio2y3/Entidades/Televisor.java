package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;

    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int precio, String color, char consumo, int peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {

        Scanner leer = new Scanner(System.in);

        super.crearElectrodomestico();

        System.out.println("Ingrese la resolución en pulgadas");

        this.resolucion = leer.nextInt();

        leer.nextLine();

        System.out.println("ingrese si el televisor tiene sintonizador o no (S/N)");

        char respuesta = leer.next().charAt(0);

        respuesta = Character.toUpperCase(respuesta);

        if (respuesta == 'S') {

            this.sintonizador = true;

        }else {

            this.sintonizador = false;

        }

    }

    public void precioFinal() {

        super.precioFinal();

        if (resolucion > 40) {

            this.precio += this.precio * 0.3;

        }

        if (sintonizador == true ) {

            this.precio += 500;
            
        }

    }

    @Override
    public String toString() {
        return "Televisor [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
    }

}