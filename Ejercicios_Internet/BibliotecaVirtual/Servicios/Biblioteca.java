package Servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import Entidades.Autor;
import Entidades.Libro;

public class Biblioteca {

    Scanner leer = new Scanner(System.in);

    private ArrayList<Libro> listaLibros;

    private HashSet<String> listaCategorias;

    private HashMap<Autor, Libro> librosPorAutor;

    private Libro libro;

    private Autor autor;

    public Biblioteca() {

        this.listaLibros = new ArrayList<>();
        this.listaCategorias = new HashSet<>();
        this.librosPorAutor = new HashMap<>();

    }

    public void agregarLibro(){

        libro = new Libro();
        autor = new Autor();

        System.out.println("Agregando libro...");
        System.out.println("Ingrese el título:");

        libro.setTitulo(leer.nextLine());

        System.out.println("Ingrese la categoría:");

        libro.setCategoria(leer.nextLine());

        System.out.println("Ingrese el año de publicación:");

        libro.setAnioPublicado(leer.nextInt());

        System.out.println("Ingrese el ISBN:");

        libro.setISBN(leer.nextInt());

        leer.nextLine();

        System.out.println("A continuación, ingrese los datos del autor del libro");

        System.out.println("Ingrese nombre del autor:");

        autor.setNombre(leer.nextLine());

        System.out.println("Ingrese el apellido del autor:");

        autor.setApellido(leer.nextLine());

        System.out.println("Ingrese la edad del autor");

        autor.setEdad(leer.nextInt());

        leer.nextLine();

        System.out.println("Ingrese la nacionalidad del autor:");

        autor.setNacionalidad(leer.nextLine());

        libro.setAutor(autor);

        listaLibros.add(libro);

        listaCategorias.add(libro.getCategoria());

        librosPorAutor.put(autor, libro);

    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public void obtenerLibrosPorCategoria(String categoria){

        ArrayList<String> resultado = new ArrayList<>();

        for (Libro elemento : listaLibros) {

            if (elemento.getCategoria().equalsIgnoreCase(categoria)) {

                resultado.add(elemento.getTitulo());
                
            }
            
        }

        System.out.println("Estos son los libros que coinciden con la categoría seleccionada:");

        System.out.println(resultado);

    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public void obtenerLibrosPorAutor(String autor){

        ArrayList<String> resultado = new ArrayList<>();

        for (Libro libro : listaLibros) {

            if (libro.getAutor().getNombre().equalsIgnoreCase(autor)) {

                resultado.add(libro.getTitulo());
                
            }
            
        }

        System.out.println("Estos son los libros que coinciden con el autor seleccionado:");

        System.out.println(resultado);

    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public void obtenerCantidadLibros(){

        int contador = 0;

        for (Libro libro : listaLibros) {

            contador++;
            
        }

        System.out.println("La cantidad total de libros en la biblioteca es de: " + contador);

    }

}