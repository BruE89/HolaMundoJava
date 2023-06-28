package src;

import java.util.ArrayList;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Electrodomestico> listaElectro = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora();
    
        Lavadora lavadora2 = new Lavadora();

        Televisor televisor1 = new Televisor();

        Televisor televisor2 = new Televisor();

        lavadora1.crearLavadora();

        lavadora2.crearLavadora();

        televisor1.crearTelevisor();

        televisor2.crearTelevisor();

        listaElectro.add(lavadora1);
        listaElectro.add(lavadora2);
        listaElectro.add(televisor1);
        listaElectro.add(televisor2);

        int cuenta = 0;

        for (Electrodomestico electrodomestico : listaElectro) {

            electrodomestico.precioFinal();

            System.out.println(electrodomestico.getPrecio());

            cuenta += electrodomestico.getPrecio();
            
        }

        System.out.println("Cuenta: " + cuenta);

    }

}