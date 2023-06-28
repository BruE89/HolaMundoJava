package Entidades;

public class Alumno {

    private String nombre, apellido;

    private int numero, edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int numero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.edad = edad;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", edad=" + edad + "]";
    }
    
}