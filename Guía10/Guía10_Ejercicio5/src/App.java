package src;

import Servicios.PaisesService;

public class App {
    public static void main(String[] args) throws Exception {

        PaisesService ps = new PaisesService();

        ps.crearConjuntoPaises();

        ps.mostrarPaises();

        ps.ordenarAlfa();

        ps.buscarPais();
        
        ps.mostrarPaises();

    }

}