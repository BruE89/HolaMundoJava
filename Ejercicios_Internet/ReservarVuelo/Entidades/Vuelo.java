package Entidades;

public class Vuelo {

    private String numeroVuelo;

    private String origen;
    
    private String destino;

    private int capacidad;

    private int asientosReservados;

    public Vuelo() {
    }

    public Vuelo(String numeroVuelo, String origen, String destino, int capacidad, int asientosReservados) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.asientosReservados = asientosReservados;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    @Override
    public String toString() {
        return "Vuelo [numeroVuelo=" + numeroVuelo + ", origen=" + origen + ", destino=" + destino + ", capacidad="
                + capacidad + ", asientosReservados=" + asientosReservados + "]";
    }

}