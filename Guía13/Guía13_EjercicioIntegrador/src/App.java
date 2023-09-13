package src;

import Entidad_Principal.Armadura;

public class App {
    public static void main(String[] args) throws Exception {

        Armadura MARK1 = new Armadura();

        MARK1.crearArmadura();
        MARK1.estadoBateria();


        MARK1.caminar(10);
        MARK1.estadoBateria();


        MARK1.volar(10);        
        MARK1.estadoBateria();


        MARK1.dispararGuantes(10);

        MARK1.estadoBateria();

        MARK1.mostrarEstadoGeneral();

    }

}