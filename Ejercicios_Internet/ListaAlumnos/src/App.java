package src;

import Servicios.AlumnoService;

public class App {
    public static void main(String[] args) throws Exception {

        AlumnoService as = new AlumnoService();

        as.agregarAlumno();

        as.agregarAlumno();

        as.mostrarAlumnos();

        as.buscarAlumno();

        as.eliminarAlumno();

        as.mostrarAlumnos();

    }

}