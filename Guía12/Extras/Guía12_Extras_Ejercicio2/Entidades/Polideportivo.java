package Entidades;

public final class Polideportivo extends Edificio {

    private String nombre;

    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    //------------------------------------------------------------------------

    @Override
    public double calcularSuperficie(){

        return super.largo * super.ancho;

    }

    @Override
    public double calcularVolumen(){

        return calcularSuperficie() * super.alto;

    }

    public boolean techadoYabierto(){

        boolean aux = false;

        if (this.tipoInstalacion.equalsIgnoreCase("techado")) {

            System.out.println("El edificio es techado");

            aux = true;
            
        }else if (this.tipoInstalacion.equalsIgnoreCase("abierto")) {

            System.out.println("El edificio es abierto");
            
        }

        return aux;

    }
    
}
