package Servicios;

import java.util.ArrayList;
import java.util.Collections;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Entidades.Residencia;
import src.HotelComparator;

public class HotelesService {

    ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();

    ArrayList<Hoteles> listaHoteles = new ArrayList<>();

    ArrayList<Camping> listaCampings = new ArrayList<>();

    ArrayList<Residencia> listaResidencias = new ArrayList<>();

    public void crearListaHoteles(){

        Hoteles hotel1 = new Hotel4Estrellas("Hotel Primero", "Calle hotel primero", "Ciudad1", "Alberto", 30, 60, 2, 0, "A", "Restaurante Primo", 50);

        Hoteles hotel2 = new Hotel5Estrellas("Hotel Segundo", "Calle hotel segundo", "Ciudad2", "Bernardo", 50, 75, 10, 0, "B", "Restaurante Secondo", 120, 3, 25, 10);

        Camping camping1 = new Camping("Camping Primero", "Calle camping primero", "Ciudad3", "Carlos", true, 1000, 20, 5, false);

        Camping camping2 = new Camping("Camping Segundo", "Calle camping segundo", "Ciudad4", "Darío", false, 2500, 100, 10, true);

        Residencia residencia1 = new Residencia("Residencia 1", "Calle residencia primera", "Ciudad5", "Esteban", true, 50, 10, false, true);

        Residencia residencia2 = new Residencia("Residencia 2", "Calle residencia segunda", "ciudad6", "Fernando", false, 65, 15, true, false);

        listaAlojamientos.add(hotel1);
        listaAlojamientos.add(hotel2);
        listaAlojamientos.add(camping1);
        listaAlojamientos.add(camping2);
        listaAlojamientos.add(residencia1);
        listaAlojamientos.add(residencia2);

    }

    public void crearListas(){

        for (Alojamiento alojamiento : listaAlojamientos) {

            if (alojamiento instanceof Hoteles) {

                listaHoteles.add((Hoteles) alojamiento);
                    
            }else if (alojamiento instanceof Camping) {

                listaCampings.add((Camping) alojamiento);
                
            }else if (alojamiento instanceof Residencia) {

                listaResidencias.add((Residencia) alojamiento);
                
            }
        }

        System.out.println("");

    }

    public void mostrarTodos(){

        System.out.println("Lista de todos los alojamientos:");

        for (Alojamiento alojamiento : listaAlojamientos) {

            System.out.println(alojamiento.toString());
            
        }

        System.out.println("");

    }

    public void mostrarHotelesPorPrecio(){

        Collections.sort(listaHoteles, new HotelComparator().reversed());

        System.out.println("Hoteles del mas caro al mas barato");

        for (Hoteles hotel : listaHoteles) {

            System.out.println(hotel.toString());
            
        }

        System.out.println("");

    }

    public void mostrarCampingsConRestaurante(){

        System.out.println("Campings con restaurante");

        for (Camping camping : listaCampings) {

            if (camping.isRestaurante()) {

                System.out.println(camping.toString());
                
            }
            
        }

        System.out.println("");

    }

    public void mostrarResidenciasConDescuente(){

        System.out.println("Residencias con descuento a gremios:");

        for (Residencia residencia : listaResidencias) {

            if (residencia.isDescuentoGremios()) {

                System.out.println(residencia.toString());
                
            }
            
        }

        System.out.println("");

    }


    
}