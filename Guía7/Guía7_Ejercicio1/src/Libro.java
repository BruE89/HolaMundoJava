package src;

import java.util.Scanner;

public class Libro {

    public int isbn;

    public String titulo;

    public String autor;

    public int paginas;

    public Libro(){

    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void pedirDatos(){

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el título del libro");

        this.titulo = leer.nextLine();

        System.out.println("A continuación ingrese el ISBN");

        this.isbn = leer.nextInt();

        System.out.println("Ahora ingrese el autor");

        this.autor = leer.next();

        System.out.println("Finalmente, ingrese el número de páginas");

        this.paginas = leer.nextInt();

        leer.close();

    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }

    
    
}
