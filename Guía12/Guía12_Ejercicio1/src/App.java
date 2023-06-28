package src;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class App {
    public static void main(String[] args) throws Exception {

        Animal perro1 = new Perro("Stich", "Carne", 15, "doberman");

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");

        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");

        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();

    }

}