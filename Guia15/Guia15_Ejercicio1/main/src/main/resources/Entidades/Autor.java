package main.src.main.resources.Entidades;

public class Autor {

    private int id;
    private String nombre;
    private Boolean alta;

    /*------------------------------------------------------ */

    public Autor() {
    }
    public Autor(int id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getAlta() {
        return alta;
    }
    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor [id=" + id + ", nombre=" + nombre + ", alta=" + alta + "]";
    }
    
}
