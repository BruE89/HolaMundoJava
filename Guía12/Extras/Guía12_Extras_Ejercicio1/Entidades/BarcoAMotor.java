package Entidades;

import java.time.LocalDate;

public class BarcoAMotor extends Barco {

    private int potencia;

    public BarcoAMotor(String matricula, int eslora, LocalDate anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public BarcoAMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoAMotor() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int calcularModulo(){

        int modulo = super.calcularModulo() + this.potencia;

        return modulo;

    }

}