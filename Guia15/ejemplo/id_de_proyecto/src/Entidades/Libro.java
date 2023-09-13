package main.src.main.resources.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    private Long isbn;
    private String titulo;
    private int anio;
    private int ejemplares;
    private int emeplaresPrestados;
    private int ejemplaresRestantes;
    private boolean alta;
    private Autor autor;
    private Editorial editorial;

    /*------------------------------------------------------------*/

    public Libro() {
    }

    public Libro(Long isbn, String titulo, int anio, int ejemplares, int emeplaresPrestados, int ejemplaresRestantes,
            boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.emeplaresPrestados = emeplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEmeplaresPrestados() {
        return emeplaresPrestados;
    }

    public void setEmeplaresPrestados(int emeplaresPrestados) {
        this.emeplaresPrestados = emeplaresPrestados;
    }

    public int getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(int ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares
                + ", emeplaresPrestados=" + emeplaresPrestados + ", ejemplaresRestantes=" + ejemplaresRestantes
                + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + "]";
    }

    
}
