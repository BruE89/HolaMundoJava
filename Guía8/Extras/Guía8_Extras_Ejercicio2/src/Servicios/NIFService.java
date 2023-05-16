package src.Servicios;

import java.util.Scanner;

import src.Entidades.NIF;

public class NIFService {

    Scanner leer = new Scanner(System.in);

    char[] array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public char crearNif(NIF p){

        System.out.println("Por favor ingrese su DNI: ");

        int dni = leer.nextInt();

        p.setDNI(dni);

        int resto = dni%23;

        char letra = array[resto];

        p.setNIF(letra);

        return letra;

    }

    public void mostrar(NIF p){

        System.out.println(p.getDNI() + "" + p.getNIF());

    }
    
}
