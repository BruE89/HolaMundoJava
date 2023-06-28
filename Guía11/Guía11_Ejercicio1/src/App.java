package src;

import Entidades.Perro;
import Entidades.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Ricardo", "DeLaSerna", 50, 25123123);

        Persona persona2 = new Persona("Facundo", "Lol", 30, 35123123);

        Perro perro1 = new Perro("Maya", "Pastor", 5, "Grande");

        Perro perro2 = new Perro("Tico", "Rottweiler", 2, "Enorme");

        persona1.setPerro(perro1);

        persona2.setPerro(perro2);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}