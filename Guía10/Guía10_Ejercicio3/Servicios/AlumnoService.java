package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Alumno;

public class AlumnoService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Alumno> arrayAlumnos = new ArrayList<>();

    public ArrayList<Alumno> crearAlumno(){

        while (true) {

            Alumno alumno = new Alumno();

            System.out.println("Ingrese el nombre del alumno:");
    
            alumno.setNombre(leer.nextLine());
    
            System.out.println("A continuación, ingrese las notas una por una");
    
            System.out.println("Nota 1:");
    
            int nota1 = leer.nextInt();
    
            System.out.println("Nota 2:");
    
            int nota2 = leer.nextInt();
    
            System.out.println("Nota 3:");
    
            int nota3 = leer.nextInt();

            ArrayList<Integer> arrayNotas = new ArrayList<>();
    
            arrayNotas.add(nota1);
            arrayNotas.add(nota2);
            arrayNotas.add(nota3);
    
            alumno.setNotas(arrayNotas);

            arrayAlumnos.add(alumno);

            leer.nextLine();

            System.out.println("Desea ingresar otro alumno? S/N");

            String respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {

                System.out.println("Cerrando programa...");

                break;
                
            }
            
        }

        return arrayAlumnos;

    }

    public void notaFInal(String nombre){

        int suma = 0;

        for (Alumno alumno : arrayAlumnos) {

            if (alumno.getNombre().equalsIgnoreCase(nombre)) {

                ArrayList<Integer> notas = alumno.getNotas();

                for (Integer nota : notas) {

                    suma += nota;
                    
                }
                
            }

        }

        System.out.println("El promedio del alumno " + nombre + " es: " + (suma / 3));

    }
    
}