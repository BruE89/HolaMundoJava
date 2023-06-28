package Entidades;

public class Hotel4Estrellas extends Hoteles {

    protected String gimnasio;

    protected String nombreRestaurante;

    protected int capacidadRestaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int numeroCamas, int pisos, int precioHabitacion, String gimnasio, String nombreRestaurante,
            int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, pisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitacion = determinarPrecio();
    }

    

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }



    public enum tiposGim {

        A,B;

    }

    @Override
    public int determinarPrecio(){

        int precio = 50 + (1 * numeroCamas) + (valoraAgregadoRestaurante()) + (valoraAgregadoGim());

        this.precioHabitacion = precio;

        return precio;

    }

    public int valoraAgregadoRestaurante(){

        int resultado = 0;

        if (capacidadRestaurante < 30) {

            resultado = 10;
            
        }else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {

            resultado = 30;
            
        }else if (capacidadRestaurante > 50) {

            resultado = 50;
            
        }

        return resultado;

    }

    public int valoraAgregadoGim(){

        int resultado = 0;

        if (tiposGim.valueOf(gimnasio) == tiposGim.A) {

            resultado = 50;
            
        }else {

            resultado = 30;

        }

        return resultado;

    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4Estrellas [gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante
                + ", capacidadRestaurante=" + capacidadRestaurante + "]";
    }

    
    
}