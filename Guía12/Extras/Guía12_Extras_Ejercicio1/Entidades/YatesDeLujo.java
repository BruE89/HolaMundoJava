package Entidades;

import java.time.LocalDate;

public class YatesDeLujo extends Barco{

    private int potencia;

    private int camarotes;

    public YatesDeLujo() {
    }

    public YatesDeLujo(String matricula, int eslora, LocalDate anioFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public YatesDeLujo(int potencia, int camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public int calcularModulo(){

        int modulo = super.calcularModulo() + this.potencia + this.camarotes;

        return modulo;

    }

}