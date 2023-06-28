package Entidades;

import java.time.LocalDate;

public class Velero extends Barco{

    private int mastiles;

    public Velero() {
    }

    public Velero(String matricula, int eslora, LocalDate anioFabricacion, int mastiles) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int calcularModulo(){

        int modulo = super.calcularModulo() + this.mastiles;

        return modulo;

    }
    
}