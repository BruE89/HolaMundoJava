package src.PersonaService;

import java.util.Date;
import java.util.Scanner;

import src.Entidades.Persona;

public class PersonaService {

    Persona p = new Persona();

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Por favor ingrese su nombre:");

        p.setNombre(leer.nextLine());

        System.out.println("Ahora ingrese su fecha de nacimiento:");

        System.out.print("Día: ");

        int dia = leer.nextInt();

        System.out.print("Mes: ");

        int mes = leer.nextInt();

        System.out.print("Año: ");

        int anio = leer.nextInt();

        Date fecha = new Date((anio - 1900), (mes - 1) , dia);

        p.setFechaNacimiento(fecha);

        return p;

    }

    public int calcularEdad(){

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();

        return edad;

    }

    public boolean menorQue(Persona p, int edad){

        if (calcularEdad() < edad) {

            System.out.println("La persona es menor que la edad ingresada");

            return true;
            
        }else {

            System.out.println("La persona es mayor que la edad ingresada");

            return false;

        }

    }

    public void mostrarPersona(){

        System.out.println("Nombre: " + p.getNombre());

        System.out.println("Edad: " + calcularEdad());

        System.out.println("Fecha de nacimiento: " + p.getFechaNacimiento());

    }
    
}