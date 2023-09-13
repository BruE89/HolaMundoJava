package src;

import Servicios.JuegoService;

public class App {
    public static void main(String[] args) throws Exception {

        JuegoService j = new JuegoService();

        j.generarNuevoNumeroSecreto();

        j.intentarAdivinar();

    }

}