package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Carta {

    Random random = new Random();

    private String palo;

    private int numero;

    private ArrayList <String> paloOpciones = new ArrayList<>(Arrays.asList("Oros", "Copas", "Espadas", "Bastos"));

    private ArrayList <Integer> numeroOpciones = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,10,11,12));

    public Carta() {

        this.setPalo(paloOpciones.get(random.nextInt(4)));
        this.setNumero(numeroOpciones.get(random.nextInt(10)));

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta [palo=" + palo + ", numero=" + numero + "]";
    }

}