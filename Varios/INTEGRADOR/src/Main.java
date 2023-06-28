package src;

import Entidades.Estudiante;
import Servicios.EstudiantesService;

public class Main {
    public static void main(String[] args) throws Exception {

        EstudiantesService es = new EstudiantesService();
        
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Alejandro", 8.5);
        estudiantes[1] = new Estudiante("Bruno", 7.2);
        estudiantes[2] = new Estudiante("Casca", 6.8);
        estudiantes[3] = new Estudiante("Diego", 9.0);
        estudiantes[4] = new Estudiante("Esteban", 5.5);
        estudiantes[5] = new Estudiante("Francisco", 7.8);
        estudiantes[6] = new Estudiante("Guido", 8.9);
        estudiantes[7] = new Estudiante("Hector", 6.5);

        System.out.print("El promedio de la clase es de: ");
        System.out.printf("%.2f", es.calcularPromedio(estudiantes));
        System.out.println("");

        String[] alumnosEncimaPromedio = es.sobresalientes(estudiantes, es.calcularPromedio(estudiantes));

        System.out.println("Los alumnos con nota superior al promedio fueron:");

        es.mostrarArray(alumnosEncimaPromedio);

    }

}