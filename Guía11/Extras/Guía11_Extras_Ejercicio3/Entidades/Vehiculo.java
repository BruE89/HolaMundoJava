package Entidades;

public class Vehiculo {

    private String marca, modelo, color, tipo, chasis, numeroMotor;

    private int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String tipo, String chasis, String numeroMotor,
            int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.chasis = chasis;
        this.numeroMotor = numeroMotor;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", chasis="
                + chasis + ", numeroMotor=" + numeroMotor + ", anio=" + anio + "]";
    }
    
}