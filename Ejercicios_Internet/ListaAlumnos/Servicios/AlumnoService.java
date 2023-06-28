package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entidades.Alumno;

public class AlumnoService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Alumno> listaPrincipal = new ArrayList<>();

    public void agregarAlumno(){

        Alumno alumno = new Alumno();

        System.out.println("Ingrese nombre del alumno");

        alumno.setNombre(leer.nextLine());

        System.out.println("Ingrese apellido del alumno");

        alumno.setApellido(leer.nextLine());

        System.out.println("Ingrese numero de estudiante");

        alumno.setNumero(leer.nextInt());

        leer.nextLine();

        System.out.println("Ingrese edad del alumno");

        alumno.setEdad(leer.nextInt());

        leer.nextLine();

        listaPrincipal.add(alumno);

    }

    public void buscarAlumno(){

        boolean aux = false;

        System.out.println("Ingrese el nombre para buscar en la lista de alumnos");

        String buscar = leer.nextLine();

        for (Alumno alumno : listaPrincipal) {

            if (alumno.getNombre().equalsIgnoreCase(buscar)) {

                System.out.println("Alumno encontrado, mostrando datos...");

                System.out.println("Apellido: " + alumno.getApellido());

                System.out.println("Número de estudiante: " + alumno.getNumero());

                System.out.println("Edad del alumno: " + alumno.getEdad());

                aux = true;
                
            }
            
        }

        if (aux == false) {

            System.out.println("Error, el alumno no se encuentra en la lista, intente con otro nombre");
            
        }

    }

    public void eliminarAlumno(){

        boolean aux = false;

        Iterator<Alumno> it = listaPrincipal.iterator();

        System.out.println("Ingrese el nombre de un alumno para eliminar de la lista");

        String eliminar = leer.nextLine();

        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(eliminar)) {

                it.remove();

                aux = true;
                
            }
            
        }

        if (aux == false) {

            System.out.println("Error, el alumno no se encuentra en la lista");
            
        }

    }

    public void mostrarAlumnos(){

        System.out.println("Mostrando alumnos:");

        for (Alumno alumno : listaPrincipal) {

            System.out.println(alumno.toString());
            
        }

    }
    
}