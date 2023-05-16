package src.Servicios;

import java.util.Scanner;

import src.Entidades.Curso;

public class CursoServicio {

    Curso curso1 = new Curso();

    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(){

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre de un alumno");

            curso1.getAlumnos()[i] = leer.nextLine();
            
        }

    }

    public void crearCurso(){

        System.out.println("Ingrese el nombre del curso:");

        curso1.setNombreCurso(leer.nextLine());

        System.out.println("Ingrese la cantidad de horas por dia:");

        curso1.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese la cantidad de dias por semana:");

        curso1.setCantidadDiasPorSemana(leer.nextInt());

        leer.nextLine();

        System.out.println("Ingrese el turno:");

        curso1.setTurno(leer.nextLine());

        System.out.println("Ingrese el precio por hora:");

        curso1.setPrecioPorHora(leer.nextInt());

        leer.nextLine();

        cargarAlumnos();



    }

    public int calcularGananciaSemanal(){

        int resultado = curso1.getCantidadHorasPorDia() * curso1.getPrecioPorHora() * curso1.getCantidadDiasPorSemana() * 5;

        return resultado;

    }
    
}