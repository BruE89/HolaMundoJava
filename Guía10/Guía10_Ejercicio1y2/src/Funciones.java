package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {

    Scanner leer = new Scanner(System.in);

    public ArrayList <String> pedirRazas(){

        ArrayList<String> arrayRazas = new ArrayList<>();

        while (true) {

            System.out.println("Ingrese una raza de perro");

            String raza = leer.nextLine();

            arrayRazas.add(raza);

            System.out.println("Desea continuar? S/N");

            String respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase("S")) {

                continue;
                
            }else{

                break;

            }
            
        }

        for (String string : arrayRazas) {

            System.out.println(string);
            
        }

        return arrayRazas;

    }
    
}
