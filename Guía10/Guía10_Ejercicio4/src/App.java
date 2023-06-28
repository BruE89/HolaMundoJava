package src;

import Servicios.PeliculaService;

public class App {
    public static void main(String[] args) throws Exception {

        PeliculaService ps = new PeliculaService();

        ps.crearListaPeliculas();

        ps.mostrarPeliculas();

        ps.peliculasLargas();

        ps.ordenarPeliculasDescendente();

        ps.ordenarPeliculasAscendente();

    }
}
