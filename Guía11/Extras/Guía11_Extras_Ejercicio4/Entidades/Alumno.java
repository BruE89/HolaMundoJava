package Entidades;

import java.util.HashSet;

public class Alumno {

    private String nombreCompleto;

    private int DNI, cantidadVotos;

    private HashSet<Alumno> votos;

    public HashSet<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(HashSet<Alumno> votos) {
        this.votos = votos;
    }

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dNI, int cantidadVotos, HashSet<Alumno> votos) {
        this.nombreCompleto = nombreCompleto;
        DNI = dNI;
        this.cantidadVotos = cantidadVotos;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno [nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantidadVotos=" + cantidadVotos + "]";
    }
   
}