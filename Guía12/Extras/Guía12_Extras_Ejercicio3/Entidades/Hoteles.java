package Entidades;

public abstract class Hoteles extends Alojamiento {

    protected int cantidadHabitaciones;

    protected int numeroCamas;

    protected int pisos;

    protected int precioHabitacion;

    public Hoteles(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int numeroCamas, int pisos, int precioHabitacion) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.pisos = pisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    protected abstract int determinarPrecio();

    @Override
    public String toString() {
        return super.toString() + "Hoteles [cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", pisos="
                + pisos + ", precioHabitacion=" + precioHabitacion + "]";
    }

    
    
}