package src;

import java.util.ArrayList;

import Entidades.Empleados;
import Entidades.Estudiantes;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesores;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Empleados empleado = new Empleados("Alberto", "Arandel", 123, "Casado", 1990, 321);

        Estudiantes estudiante = new Estudiantes("Bernardo", "Benedetto", 234, "Soltero", "2A");

        Profesores profesor = new Profesores("Carlos", "Cervantes", 345,"Casado", "Historia");

        PersonalServicio personal = new PersonalServicio("Darío", "Ditrovich", 456, "Soltero", "Secretario");

        listaPersonas.add(empleado);
        listaPersonas.add(estudiante);
        listaPersonas.add(profesor);
        listaPersonas.add(personal);

        empleado.cambioEstadoCivil();
        empleado.cambioDespacho();

        estudiante.cambioCurso();

        profesor.cambioDepartamento();
        
        personal.cambioSeccion();

        for (Persona persona : listaPersonas) {

            System.out.println(persona.toString());
            
        }

    }

}