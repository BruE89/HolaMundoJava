package src;

import src.Entidades.Persona;
import src.PersonaService.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {

        PersonaService ps = new PersonaService();

        Persona persona1 = ps.crearPersona();

        ps.menorQue(persona1, 32);

        ps.mostrarPersona();

        System.out.println(persona1);

    }

}