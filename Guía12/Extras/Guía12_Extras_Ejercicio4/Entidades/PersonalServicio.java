package Entidades;

import java.util.Scanner;

public class PersonalServicio extends Persona{

    protected String seccionAsignada;

    Scanner leer = new Scanner(System.in);

    public PersonalServicio() {
    }

    public PersonalServicio(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public PersonalServicio(String nombre, String apellido, int numeroID, String estadoCivil, String seccionAsignada) {
        super(nombre, apellido, numeroID, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalServicio [seccionAsignada=" + seccionAsignada + "]";
    }

    //----------------------------------------------------------------------

    public void cambioSeccion(){

        System.out.println("Ingrese nueva sección para el empleado " + this.getNombre());

        String nuevaSeccion = leer.nextLine();

        this.seccionAsignada = nuevaSeccion;

    }
    
}
