package Entidades;

public class Extrahoteleros extends Alojamiento {

    protected boolean privado;

    protected int metrosCuadrados;

    public Extrahoteleros(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "Extrahoteleros [privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + "]";
    }

    
    
}