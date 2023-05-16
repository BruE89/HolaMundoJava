package src;

import src.Entidades.Cafetera;
import src.Servicios.CafeteraServicio;

public class App {
    public static void main(String[] args) throws Exception {

        CafeteraServicio cfs = new CafeteraServicio();
        
        Cafetera cafetera1 = new Cafetera();

        cfs.llenarCafetera(cafetera1);

        System.out.println("");

        cfs.servirTaza(cafetera1 , 2000);

        System.out.println("");

        cfs.vaciarCafetera(cafetera1);

        System.out.println("");

        cfs.agregarCafe(cafetera1 , 100);

        System.out.println("");

    }
}
