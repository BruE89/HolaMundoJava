package src;

import java.util.ArrayList;

import Entidades.ClaseArray;

public class App {
    public static void main(String[] args) throws Exception {

        ClaseArray c = new ClaseArray();

        ArrayList<Integer> lista = c.crearLista();

        try {

            lista.get(10);
            
        } catch (IndexOutOfBoundsException e) {

            System.out.println("El índice indicado esta fuera del rango de la lista");

        }

    }
}
