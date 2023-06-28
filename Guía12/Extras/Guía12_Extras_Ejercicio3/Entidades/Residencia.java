package Entidades;

public class Residencia extends Extrahoteleros{

    protected int cantidadHabitaciones;

    protected boolean descuentoGremios;

    protected boolean campoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metrosCuadrados, int cantidadHabitaciones, boolean descuenteGremios, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuenteGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuenteGremios) {
        this.descuentoGremios = descuenteGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia [cantidadHabitaciones=" + cantidadHabitaciones + ", descuenteGremios=" + descuentoGremios
                + ", campoDeportivo=" + campoDeportivo + "]";
    }      

    
    
}