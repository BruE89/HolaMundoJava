package Entidades;

import java.util.Scanner;

public class Persona {

    protected String nombre;

    protected String apellido;

    protected int numeroID;

    protected String estadoCivil;

    Scanner leer = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String nombre, String apellido, int numeroID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroID = numeroID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", numeroID=" + numeroID + ", estadoCivil="
                + estadoCivil + "]";
    }

    //------------------------------------------------------------------------------------

    public void cambioEstadoCivil(){

        System.out.println("Ingrese el nuevo estado civil de la persona " + this.nombre);

        String nuevoEstado = leer.nextLine();

        this.estadoCivil = nuevoEstado;

    }
    
}