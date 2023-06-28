package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Perro;
import Entidades.Persona;

public class Adopcion {

    Scanner leer = new Scanner(System.in);

    public void inicio(ArrayList<Persona> listaPersonas, ArrayList<Perro> listaPerros){

        for (Persona persona : listaPersonas) {

            System.out.println(persona.getNombre() + ", a continuación se mostrará la lista de perros:");

            for (Perro perro : listaPerros) {

                System.out.println(perro.toString());
                
            }

            System.out.println("Escriba el nombre del perro que desea adoptar:");

            String eleccion = leer.nextLine();

            for (Perro perro : listaPerros) {

                if (perro.getNombre().equalsIgnoreCase(eleccion)) {

                    persona.setPerro(perro);

                    listaPerros.remove(perro);

                    break;
                    
                }
                
            }

        }

    }

    public void mostrar(ArrayList<Persona> listaPersonas){

        for (Persona persona : listaPersonas) {

            System.out.println(persona.toString());
            
        }

    }
    
}