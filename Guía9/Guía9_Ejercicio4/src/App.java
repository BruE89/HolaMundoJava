package src;

import src.Servicios.FechaService;

public class App {
    public static void main(String[] args) throws Exception {
        
        FechaService fs = new FechaService();

        fs.diferencia(fs.fechaNacimiento(), fs.fechaActual());

    }

}