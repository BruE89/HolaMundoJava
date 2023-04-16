package src;

public class App {
    public static void main(String[] args) throws Exception {

        Puntos misPuntos = new Puntos();

        misPuntos.crearPuntos();

        System.out.println("La distancia entre ambos puntos es " + misPuntos.distancia());
        
    }
}