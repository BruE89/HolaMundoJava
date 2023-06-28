package Entidades;

import java.util.Scanner;

public class Profesores extends Persona{

    protected String departamento;

    Scanner leer = new Scanner(System.in);

    public Profesores() {
    }

    public Profesores(String departamento) {
        this.departamento = departamento;
    }

    public Profesores(String nombre, String apellido, int numeroID, String estadoCivil, String departamento) {
        super(nombre, apellido, numeroID, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores [departamento=" + departamento + "]";
    }

    //--------------------------------------------------------------------------

    public void cambioDepartamento(){

        System.out.println("Ingrese nuevo departamento para el profesor " + this.getNombre());

        String nuevoDepartamento = leer.nextLine();

        this.departamento = nuevoDepartamento;

    }
    
}
