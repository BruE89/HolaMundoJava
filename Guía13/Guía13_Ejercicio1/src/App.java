package src;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        PersonaServicio ps = new PersonaServicio();

        Persona persona = null;

        try {

            ps.esMayorDeEdad(persona);
            
        } catch (NullPointerException e) {

            System.out.println("No se puede inicializar una Persona como 'null' ");
            
        } catch (Exception e) {

            System.out.println("Error de programa");

        }

    }

}