package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){

        Scanner leer = new Scanner(System.in);

        super.crearElectrodomestico();

        System.out.println("Por favor ingrese la carga de la lavadora en litros");

        this.carga = leer.nextInt();

        leer.nextLine();

    }

    public void precioFinal(){

        super.precioFinal();

        if (this.peso > 30) {

            this.precio += 500;
            
        }

    }
    
}