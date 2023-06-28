package Entidades;

public class Camping extends Extrahoteleros{

    protected int maximoCarpas;

    protected int cantidadbanios;

    protected boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metrosCuadrados, int maximoCarpas, int cantidadbanios, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.maximoCarpas = maximoCarpas;
        this.cantidadbanios = cantidadbanios;
        this.restaurante = restaurante;
    }

    public int getMaximoCarpas() {
        return maximoCarpas;
    }

    public void setMaximoCarpas(int maximoCarpas) {
        this.maximoCarpas = maximoCarpas;
    }

    public int getCantidadbanios() {
        return cantidadbanios;
    }

    public void setCantidadbanios(int cantidadbanios) {
        this.cantidadbanios = cantidadbanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Camping [maximoCarpas=" + maximoCarpas + ", cantidadbanios=" + cantidadbanios + ", restaurante="
                + restaurante + "]";
    }

    

}