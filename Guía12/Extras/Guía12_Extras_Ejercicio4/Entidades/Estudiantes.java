package Entidades;

import java.util.Scanner;

public class Estudiantes extends Persona{

    protected String curso;

    Scanner leer = new Scanner(System.in);

    public Estudiantes() {
    }

    public Estudiantes(String curso) {
        this.curso = curso;
    }

    public Estudiantes(String nombre, String apellido, int numeroID, String estadoCivil, String curso) {
        super(nombre, apellido, numeroID, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiantes [curso=" + curso + "]";
    }

    //--------------------------------------------------------------------------------

    public void cambioCurso(){

        System.out.println("Ingrese nuevo curso para el estudiante " + this.getNombre());

        String nuevoCurso = leer.nextLine();

        this.curso = nuevoCurso;

    }
    
}
