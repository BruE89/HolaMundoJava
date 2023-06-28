package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Entidades.Pelicula;

public class PeliculaService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    /*public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p2.getDuracion().compareTo(p1.getDuracion());

        }

    };
    */
    public void crearListaPeliculas(){

        String respuesta;

        do {
            
            Pelicula pelicula = new Pelicula();

            System.out.println("Ingrese el nombre de la película:");
    
            pelicula.setTitulo(leer.nextLine());
    
            System.out.println("Ingrese el nombre del director:");
    
            pelicula.setDirector(leer.nextLine());
    
            System.out.println("Ingrese la duración de la película en horas:");
    
            pelicula.setDuracion(leer.nextDouble());
    
            listaPeliculas.add(pelicula);
    
            System.out.println("Desea agregar otra película? S/N");

            leer.nextLine();

            respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarPeliculas(){

        System.out.println("Las películas guardadas en la lista son:");

        for (Pelicula pelicula : listaPeliculas) {

            System.out.println(pelicula.getTitulo());
            
        }

    }

    public void peliculasLargas(){

        System.out.println("Las películas con duración mayor a 1 hora son:");

        for (Pelicula pelicula : listaPeliculas) {

            if (pelicula.getDuracion() > 1) {

                System.out.println(pelicula.getTitulo());
                
            }
            
        }

    }

    public void ordenarPeliculasDescendente(){

        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());

        System.out.println("Películas ordenadas de mayor duración a menor:");

        for (Pelicula pelicula : listaPeliculas) {

            System.out.println(pelicula.getTitulo());
            
        }

    }

    public void ordenarPeliculasAscendente(){

        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion));

        System.out.println("Películas ordenadas de menor duración a mayor");

        for (Pelicula pelicula : listaPeliculas) {
            
            System.out.println(pelicula.getTitulo());

        }

    }
    
}