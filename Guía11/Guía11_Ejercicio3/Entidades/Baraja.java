package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    Scanner leer = new Scanner(System.in);

    private ArrayList<Carta> cartas;

    private ArrayList<Carta> descartadas;

    public Baraja() {

        cartas = new ArrayList<>();

        descartadas = new ArrayList<>();

        for (int i = 0; i < 40; i++) {

            Carta carta = new Carta();

            cartas.add(carta);
            
        }

    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void barajar(){

        System.out.println("Mezclando la baraja...");

        Collections.shuffle(cartas);

    }

    public void siguienteCarta(){

        System.out.println("Se saca una carta:");

        System.out.println(cartas.get(0).toString());

        descartadas.add(cartas.get(0));

        cartas.remove(0);



    }

    public int cartasDisponibles(){

        System.out.println("Cartas disponibles: " + cartas.size());

        return cartas.size();

    }

    public void darCartas(){

        System.out.println("Indique el número de cartas que desea recibir");

        int numeroPedido = leer.nextInt();

        leer.nextLine();

        if (cartasDisponibles() >= numeroPedido) {

            for (int i = 0; i < numeroPedido; i++) {

                siguienteCarta();
                
            }
            
        }else {

            System.out.println("No hay cartas suficientes para repartir");

        }

    }

    public void cartasMonton(){

        System.out.println("Cartas descartadas:");

        for (Carta carta : descartadas) {

            System.out.println(carta.toString());
            
        }

    }

    public void mostrarBaraja(){

        System.out.println("Cartas en el mazo:");

        for (Carta carta : cartas) {

            System.out.println(carta.toString());
            
        }

    }

    @Override
    public String toString() {
        return "Baraja [cartas=" + cartas + "]";
    }
    
}