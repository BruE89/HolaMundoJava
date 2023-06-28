package src;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Alumno;
import Servicios.AlumnoService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        AlumnoService as = new AlumnoService();

        ArrayList<Alumno> arrayAlumnos = new ArrayList<>();

        boolean encontrado = false;

        arrayAlumnos = as.crearAlumno();

        System.out.println("Ingrese el nombre del alumno para calcular promedio");

        String buscar = leer.nextLine();

        for (Alumno alumno : arrayAlumnos) {

            if (alumno.getNombre().equalsIgnoreCase(buscar)) {

                as.notaFInal(buscar);

                encontrado = true;
                
            }

        }

        if (encontrado == false) {

            System.out.println("El alumno no se encuentra registrado");
            
        }

        leer.close();

    }

}