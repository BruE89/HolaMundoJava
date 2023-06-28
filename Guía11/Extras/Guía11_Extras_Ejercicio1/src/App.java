package src;

import java.util.ArrayList;
import Entidades.Perro;
import Entidades.Persona;
import Servicios.Adopcion;

public class App {
    public static void main(String[] args) throws Exception {

        Adopcion adopcion = new Adopcion();

        Persona persona1 = new Persona("Bruno", "Rodríguez", 33, 35123456);
        Persona persona2 = new Persona("Facundo", "Rodríguez", 30, 38111111);
        Persona persona3 = new Persona("Guido", "Soler", 31, 34222222);

        Perro perro1 = new Perro("Maya", "Pastor de Brie", "Grande", 5);
        Perro perro2 = new Perro("Tico", "Rottweiler", "Enorme", 2);
        Perro perro3 = new Perro("Coco", "Beagle", "Chico", 3);
        
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        ArrayList<Perro> listaPerros = new ArrayList<>();

        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);

        adopcion.inicio(listaPersonas, listaPerros);

        adopcion.mostrar(listaPersonas);

    }

}