package src;

import src.Entidades.Raices;
import src.Servicios.RaicesServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        RaicesServicio rs = new RaicesServicio();

        Raices miRaiz = new Raices(1, -5, 6);

        rs.getDiscriminante(miRaiz);

        rs.tieneRaices(miRaiz);

        rs.tieneRaiz(miRaiz);

        rs.obtenerRaices(miRaiz);

        rs.obtenerRaiz(miRaiz);

        rs.calcular(miRaiz);

    }

}