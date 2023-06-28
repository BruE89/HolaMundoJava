package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        Funciones f = new Funciones();

        ArrayList<String> arrayPerros = f.pedirRazas();

        boolean aux = false;

        System.out.println("Ingrese un perro para buscar en la lista");

        String perroBuscar = leer.nextLine();

        Iterator iterator = arrayPerros.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals(perroBuscar)) {

                System.out.println("Se eliminó '" + perroBuscar + "' de la lista");

                iterator.remove();

                System.out.println(arrayPerros);

                aux = true;
                
            }
        }

        if (aux == false) {

            System.out.println("El perro no se encontró en la lista");

            System.out.println(arrayPerros);
            
        }

        leer.close();

    }

}