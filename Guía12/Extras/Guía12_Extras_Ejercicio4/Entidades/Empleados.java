package Entidades;

import java.util.Scanner;

public class Empleados extends Persona{

    protected int anioIncorporacion;

    protected int numeroDespacho;

    Scanner leer = new Scanner(System.in);

    public Empleados() {
    }

    public Empleados(int anioIncorporacion, int numeroDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public Empleados(String nombre, String apellido, int numeroID, String estadoCivil, int anioIncorporacion,
            int numeroDespacho) {
        super(nombre, apellido, numeroID, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados [anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho + "]";
    }

    //--------------------------------------------------------------------------

    public void cambioDespacho(){

        System.out.println("Ingrese el nuevo despacho para el empleado " + this.getNombre());

        int nuevoDespacho = leer.nextInt();

        leer.nextLine();

        this.numeroDespacho = nuevoDespacho;

    }
    
}