package Entidades;

public class Libro {

    private String titulo;

    private Autor autor;

    private String categoria;

    private int anioPublicado;

    private int ISBN;

    public Libro() {
    }

    public Libro(String titulo, Autor autor, String categoria, int anioPublicado, int iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anioPublicado = anioPublicado;
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public void setAnioPublicado(int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", anioPublicado="
                + anioPublicado + ", ISBN=" + ISBN + "]";
    }
    
}