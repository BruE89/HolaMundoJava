package Entidades;

import java.util.Random;

public class RevolverDeAgua {

    private int posicionActual, posicionAgua;

    Random random = new Random();

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

/////////////////////////////////////////////////////////////////////////////////////

    public void llenarRevolver(){

        this.setPosicionActual(random.nextInt(6)+1);
        
        this.setPosicionAgua(random.nextInt(6)+1);

    }
 
    public boolean disparar(){

        boolean mojado = false;

        if (this.getPosicionActual() == this.getPosicionAgua()) {

            mojado = true;

        }

        return mojado;

    }

    public void siguienteChorro(RevolverDeAgua r){

        r.setPosicionActual(random.nextInt(6)+1);

    }

    @Override
    public String toString() {
        return "RevolverDeAgua [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
    }

}