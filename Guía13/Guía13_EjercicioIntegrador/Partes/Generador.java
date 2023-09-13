package Partes;

public class Generador extends Dispositivo{

    int cargaMaxima = 100;

    int cargaActual = 100;

    public Generador() {
    }

    public Generador(int consumoEnergetico, boolean funcional, boolean destruido, int cargaMaxima, int cargaActual) {
        super(consumoEnergetico, funcional, destruido);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public String toString() {
        return "Generador [cargaActual=" + cargaActual + "]";
    }
    
}