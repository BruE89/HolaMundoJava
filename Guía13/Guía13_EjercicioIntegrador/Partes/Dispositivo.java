package Partes;

public class Dispositivo {

    int consumoEnergetico = 1;

    boolean funcional = true;

    boolean destruido = false;

    public Dispositivo() {
    }

    public Dispositivo(int consumoEnergetico, boolean funcional, boolean destruido) {
        this.consumoEnergetico = consumoEnergetico;
        this.funcional = funcional;
        this.destruido = destruido;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    @Override
    public String toString() {
        return "Dispositivo [consumoEnergetico=" + consumoEnergetico + ", funcional=" + funcional + "]";
    }

}