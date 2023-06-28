package Entidades;

import java.time.LocalDate;

public class Barco {

    public String matricula;

    public int eslora;

    public LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public int calcularModulo(){

        int modulo = this.eslora * 10;

        return modulo;

    }

}