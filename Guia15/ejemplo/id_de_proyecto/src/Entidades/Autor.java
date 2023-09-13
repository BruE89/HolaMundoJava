package main.src.main.resources.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Autor {

    @Id

    @Column(name = "id")
    private int id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "alta")
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
