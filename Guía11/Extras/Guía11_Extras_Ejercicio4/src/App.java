package src;

import Servicios.Simulador;

public class App {
    public static void main(String[] args) throws Exception {

        Simulador s = new Simulador();

        s.crearAlumnos();

        s.crearDNI();

        s.votacion();

        s.mostrarAlumnos();

        System.out.println("");

        s.recuento();

        System.out.println("");

        s.revelarVotos();

        s.facilitadores();
        
    }

}