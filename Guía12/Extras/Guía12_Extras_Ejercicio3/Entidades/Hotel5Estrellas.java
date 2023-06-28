package Entidades;

public class Hotel5Estrellas extends Hotel4Estrellas {

    protected int cantidadSalones;

    protected int cantidadSuites;

    protected int cantidadLimosinas;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int numeroCamas, int pisos, int precioHabitacion, String gimnasio, String nombreRestaurante,
            int capacidadRestaurante, int cantidadSalones, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, pisos, precioHabitacion,
                gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        this.precioHabitacion = determinarPrecio();
    }

    @Override
    public int determinarPrecio() {

        int precio = 50 + (1 * numeroCamas) + (valoraAgregadoRestaurante()) + (valoraAgregadoGim()) + (valorAgregadoLimosinas());

        this.precioHabitacion = precio;

        return precio;

    }

    public int valorAgregadoLimosinas() {

        int resultado = 0;

        resultado = 15 * cantidadLimosinas;

        return resultado;

    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5Estrellas [cantidadSalones=" + cantidadSalones + ", cantidadSuites=" + cantidadSuites
                + ", cantidadLimosinas=" + cantidadLimosinas + "]";
    }

    

}
