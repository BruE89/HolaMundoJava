package src;

import src.Entidades.NIF;
import src.Servicios.NIFService;

public class App {
    public static void main(String[] args) throws Exception {

        NIFService ns = new NIFService();

        NIF persona1 = new NIF();

        ns.crearNif(persona1);

        ns.mostrar(persona1);

    }
}
