package src.Servicios;

import java.util.Scanner;

import src.Entidades.Cafetera;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafetera){

        System.out.println("Llenando cafetera...");

        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());

        System.out.println("La cafetera ahora tiene " + cafetera.getCantidadActual() + " ml");

    }

    public void servirTaza(Cafetera cafetera , int taza){

        if (cafetera.getCantidadActual() >= taza){

            System.out.println("La taza de " + taza + " ml se llenó sin problemas");

            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);

            System.out.println("Quedan " + cafetera.getCantidadActual() + " ml");

        }else {

            System.out.println("El café no alcanza para llenar la taza de " + taza + " ml, se virtió solamente " + cafetera.getCantidadActual() + " ml");

            cafetera.setCantidadActual(0);

            System.out.println("Quedan " + cafetera.getCantidadActual() + " ml");

        }

    }

    public void vaciarCafetera(Cafetera cafetera){

        System.out.println("Vaciando cafetera...");

        cafetera.setCantidadActual(0);

        System.out.println("Quedan " + cafetera.getCantidadActual() + " ml");

    }

    public void agregarCafe(Cafetera cafetera , int cafeAgregado){

        System.out.println("Agregando " + cafeAgregado + " ml de cafe...");

        cafetera.setCantidadActual(cafetera.getCantidadActual() + cafeAgregado);

        System.out.println("Quedan " + cafetera.getCantidadActual() + " ml");

    }
    
}
