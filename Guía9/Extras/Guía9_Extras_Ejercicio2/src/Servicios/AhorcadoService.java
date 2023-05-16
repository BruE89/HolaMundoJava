package src.Servicios;

import java.util.Scanner;

import src.Entidades.Ahorcado;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    Ahorcado a = new Ahorcado();

    int encontradas = 0;

    public void crearJuego(){

        System.out.println("Ingrese la palabra oculta");

        String palabra = leer.nextLine();

        int longitudPalabra = palabra.length();

        String[] array = new String[longitudPalabra];

        for (int i = 0; i < longitudPalabra; i++) {

            array[i] = palabra.substring(i, i + 1);
            
        }

        a.setPalabraOculta(array);

        System.out.println("Ahora ingrese la cantidad de jugadas máximas permitidas");

        a.setJugadasMaximas(leer.nextInt());
        
        leer.nextLine();

    }

    public void longitud(){

        System.out.println("La palabra tiene " + a.getPalabraOculta().length + " letras");

    }

    public boolean buscar(String letra){

        boolean aux = false;

        for (int i = 0; i <  a.getPalabraOculta().length; i++) {

            if (a.getPalabraOculta()[i].equalsIgnoreCase(letra)) {
    
                aux = true;
                
            }
            
        }

        return aux;

    }

    public boolean encontradas(String letra){

        boolean aux = false;

        if (buscar(letra) == true) {

            System.out.println("La letra pertenece a la palabra");

            aux = true;

            a.setJugadasMaximas(a.getJugadasMaximas() - 1);

            encontradas++;
            
        }else {

            System.out.println("La letra NO pertenece a la palabra");

            a.setJugadasMaximas(a.getJugadasMaximas() - 1);

        }

        a.setCantidadLetrasEncontradas(encontradas);

        System.out.println("Letras encontradas / faltantes: " + a.getCantidadLetrasEncontradas() + "/" + (a.getPalabraOculta().length - a.getCantidadLetrasEncontradas()) );

        return aux;

    }

    public void intentos(){

        System.out.println("intentos restantes: " + a.getJugadasMaximas());

    }

    public void juego(){

        crearJuego();

        while (true) {

            System.out.println("Ingrese una letra:");

            String letra = leer.nextLine();

            longitud();

            buscar(letra);

            encontradas(letra);

            intentos();

            System.out.println("---------------------------------------");

            if (a.getJugadasMaximas() == 0) {

                System.out.println("Te quedaste sin intentos! GAME OVER");

                break;
                
            }
            
        }

    }
    
}