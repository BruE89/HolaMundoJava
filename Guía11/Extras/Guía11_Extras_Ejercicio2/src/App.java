package src;

import java.util.ArrayList;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;

public class App {
    public static void main(String[] args) throws Exception {

        Pelicula pelicula = new Pelicula("Titanic", "James Cameron", 4, 18);

        Cine cine = new Cine(pelicula, 150);

        Espectador espectador1 = new Espectador("Alejandro", 28, 100);
        Espectador espectador2 = new Espectador("Bruno", 33, 250);
        Espectador espectador3 = new Espectador("Carlos", 12, 500);
        Espectador espectador4 = new Espectador("Diego", 16, 10);
        Espectador espectador5 = new Espectador("Euclides", 50, 200);

        ArrayList<Espectador> listaEspectadores = new ArrayList<>();

        listaEspectadores.add(espectador1);
        listaEspectadores.add(espectador2);
        listaEspectadores.add(espectador3);
        listaEspectadores.add(espectador4);
        listaEspectadores.add(espectador5);

        cine.mostrarSala();

        System.out.println("");

        cine.llenarSala(listaEspectadores);

        cine.mostrarSala();

    }

}