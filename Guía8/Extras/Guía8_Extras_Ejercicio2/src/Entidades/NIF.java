package src.Entidades;

public class NIF {

    private int DNI;

    private char NIF;

    public NIF() {
    }

    public NIF(int dNI, char nIF) {
        DNI = dNI;
        NIF = nIF;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char nIF) {
        NIF = nIF;
    }
    
}
