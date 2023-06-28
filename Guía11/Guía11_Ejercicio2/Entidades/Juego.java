package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;

    private RevolverDeAgua revolver;

    Scanner leer = new Scanner(System.in);


    public Juego() {

        this.revolver = new RevolverDeAgua();
        this.jugadores = new ArrayList<>();

    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

/////////////////////////////////////////////////////////////////////////////////////

    public void llenarJuego(){

        System.out.println("Bienvenido a la ruleta rusa");

        System.out.println("Indique cantidad de jugadores:");

        int cantidadJugadores = leer.nextInt();

        leer.nextLine();

        for (int i = 0; i < cantidadJugadores -1 ; i++) {

            Jugador jugador = new Jugador(i + 1);

            jugadores.add(jugador);
            
        }

        revolver.llenarRevolver();

    }

    public void ronda(){

        boolean jugando = true;

        while (jugando) {

            for (Jugador jugador : jugadores) {

                System.out.println("Sale un balazo");

                System.out.println("Posición del revolver: " + revolver.getPosicionActual());
                System.out.println("Posición de la bala: " + revolver.getPosicionAgua());

                if (jugador.disparo(revolver)) {

                    System.out.println(jugador.getNombre() + " se cagó matando");

                    jugando = false;

                    break;
                   
                } else{

                    System.out.println(jugador.getNombre() + " safó");
                    System.out.println("");

                }
                
            }
            
        }

    }

    @Override
    public String toString() {
        return "Juego [jugadores=" + jugadores + ", revolver=" + revolver + "]";
    }
    
}