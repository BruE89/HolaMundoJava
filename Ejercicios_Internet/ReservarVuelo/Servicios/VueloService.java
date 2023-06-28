package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Vuelo;

public class VueloService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Vuelo> listaVuelos = new ArrayList<>();

    public void agregarVuelo(){

        Vuelo vuelo = new Vuelo();

        System.out.println("Ingrese el número de vuelo");

        vuelo.setNumeroVuelo(leer.nextLine());

        System.out.println("Ingrese el origen del vuelo");

        vuelo.setOrigen(leer.nextLine());

        System.out.println("Ingrese el destino");

        vuelo.setDestino(leer.nextLine());

        System.out.println("Ingrese la capacidad total de pasajeros");

        vuelo.setCapacidad(leer.nextInt());

        leer.nextLine();

        System.out.println("Ingrese el número de asientos reservados");

        vuelo.setAsientosReservados(leer.nextInt());

        leer.nextLine();

        listaVuelos.add(vuelo);

    }

    public void reservarAsiento(){

        boolean aux = false;

        System.out.println("Ingrese el numero de vuelo en el que quiere reservar su lugar");

        String numeroReserva = leer.nextLine();

        for (Vuelo vuelo : listaVuelos) {

            if (vuelo.getNumeroVuelo().equals(numeroReserva)) {

                aux = true;

                if (vuelo.getAsientosReservados() == vuelo.getCapacidad()) {

                    System.out.println("Error, el vuelo seleccionado esta lleno");
                    
                }else {
    
                    System.out.println("Su vuelo ha sido reservado correctamente");
    
                    vuelo.setAsientosReservados(vuelo.getAsientosReservados() + 1);
    
                }
                
                
            }
            
        }

        if (aux == false) {

            System.out.println("Error, el codigo ingresado no pertenece a ningún vuelo");
            
        }

    }

    public void mostrarDetallesVuelo(){

        boolean aux = false;

        System.out.println("Ingrese el número de vuelo que desea ver en detalle");

        String seleccion = leer.nextLine();

        for (Vuelo vuelo : listaVuelos) {

            if (vuelo.getNumeroVuelo().equals(seleccion)) {

                aux = true;

                System.out.println("Imprimiendo detalles del vuelo seleccionado...");

                System.out.println(vuelo.toString());
                
            }
            
        }

        if (aux == false) {

            System.out.println("El codigo ingresado no pertenece a ningún vuelo");
            
        }

    }

    public void mostrarTodosVuelos(){

        System.out.println("Mostrando la información de TODOS los vuelos");

        for (Vuelo vuelo : listaVuelos) {

            System.out.println(vuelo.toString());
            
        }

    }

    public void menu(){

        System.out.println("Bienvenido a Aerolíneas CUCK");
        System.out.println("Seleccione una opción");
        System.out.println("");
        System.out.println("1. Reservar Asiento");
        System.out.println("2. Mostrar detalles de un vuelo");
        System.out.println("3. Mostrar detalles de todos los vuelos");
        System.out.println("4. Salir.");

        String seleccion = leer.nextLine();

        switch (seleccion) {
            case "1":

                reservarAsiento();
                
                break;

            case "2":

                mostrarDetallesVuelo();

                break;

            case "3":

                mostrarTodosVuelos();

                break;

            case "4":

                System.out.println("Saliendo del programa...");

                break;
        
            default:
                break;
        }

    }

}