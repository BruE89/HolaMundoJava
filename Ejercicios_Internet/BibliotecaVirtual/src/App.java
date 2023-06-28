package src;

import Servicios.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca b = new Biblioteca();

        b.agregarLibro();
        b.agregarLibro();
        b.agregarLibro();

        b.obtenerLibrosPorCategoria("Ajedrez");
        b.obtenerLibrosPorAutor("Arthur");
        b.obtenerCantidadLibros();

    }

}