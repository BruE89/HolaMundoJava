package Entidades;

public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;

    private int personasPorOficina;

    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroOficinas, int personasPorOficina,
            int pisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    //--------------------------------------------------------------------------------------

    @Override
    public double calcularSuperficie(){

        return super.largo * super.ancho;

    }

    @Override
    public double calcularVolumen(){

        return calcularSuperficie() * super.alto;

    }

    public void cantPersonas(){

        System.out.println("Por piso, entran " + ((numeroOficinas / pisos) * personasPorOficina) + " personas");

        System.out.println("En todo el edificio, entran " + (personasPorOficina * numeroOficinas));

    }
    
}
