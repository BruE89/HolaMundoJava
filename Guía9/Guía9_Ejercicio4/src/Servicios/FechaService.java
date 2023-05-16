package src.Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento(){

        System.out.println("Por favor ingrese día de nacimiento:");

        int dia = leer.nextInt();

        System.out.println("A continuación ingrese el mes:");

        int mes = leer.nextInt();

        System.out.println("Finalmente ingrese el año:");

        int anio = leer.nextInt();

        Date fecha = new Date((anio - 1900) , (mes - 1) , dia);

        return fecha;

    }

    public Date fechaActual() {

        return new Date();

    }

    public void diferencia(Date fecha, Date fechaActual) {

        int diferencia = fechaActual.getYear() - fecha.getYear();

        System.out.println("La diferencia en años entre la fecha ingresada y la actualidad es de: " + diferencia);

    }
    
}