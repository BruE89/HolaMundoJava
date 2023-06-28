package Servicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesService {

    HashSet<String> setPaises = new HashSet<>();

    Scanner leer = new Scanner(System.in);

    public void crearConjuntoPaises(){

        String respuesta;

        do {

            System.out.println("Ingrese un país");

            setPaises.add(leer.nextLine());
    
            System.out.println("Desea seguir añadiendo países? S/N");
    
            respuesta = leer.nextLine();
            
        }while (!respuesta.equals("n"));

    }

    public void mostrarPaises(){

        for (String string : setPaises) {

            System.out.print(string + " ");
            
        }

        System.out.println("");

    }

    public void ordenarAlfa(){

        TreeSet<String> ordenado = new TreeSet<>(setPaises);

        System.out.println(ordenado);

    }

    public void buscarPais(){

        System.out.println("Ingrese un pais para buscar en la lista");

        String paisAbuscar = leer.nextLine();

        boolean encontrado = false;

        Iterator<String> it = setPaises.iterator();

        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase(paisAbuscar)) {

                it.remove();

                encontrado = true;
                
            }
            
        }

        if (encontrado == false) {

            System.out.println("El país no se encuentra en la lista");
            
        }

    }
    
}