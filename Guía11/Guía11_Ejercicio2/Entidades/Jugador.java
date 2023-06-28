package Entidades;

public class Jugador {

    private int id;

    private boolean mojado;

    private String nombre;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.mojado = false;
        this.nombre = "Jugador" + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/////////////////////////////////////////////////////////////////////////////////////

    public boolean disparo(RevolverDeAgua r){

        if (r.disparar()) {

            this.setMojado(true);
            
        }else {

            r.siguienteChorro(r);

        }

        return mojado;

    }

    @Override
    public String toString() {
        return "Jugador [id=" + id + ", mojado=" + mojado + ", nombre=" + nombre + "]";
    }
    
}