package src.Entidades;

import java.util.Arrays;

public class Ahorcado {

    private String[] palabraOculta;

    private int cantidadLetrasEncontradas;

    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraOculta, int cantidadLetrasEncontradas, int jugadasMaximas) {
        this.palabraOculta = palabraOculta;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(String[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado [palabraOculta=" + Arrays.toString(palabraOculta) + ", cantidadLetrasEncontradas="
                + cantidadLetrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + "]";
    }

}