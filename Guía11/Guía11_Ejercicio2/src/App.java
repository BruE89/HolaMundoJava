package src;

import Entidades.Juego;

public class App {
    public static void main(String[] args) throws Exception {

        Juego ruletaRusa = new Juego();

        ruletaRusa.llenarJuego();

        ruletaRusa.ronda();

    }

}