package src;

import Entidades.Baraja;

public class App {
    public static void main(String[] args) throws Exception {

        Baraja mazo = new Baraja();

        mazo.cartasDisponibles();

        mazo.mostrarBaraja();

        mazo.barajar();

        mazo.siguienteCarta();
        
        mazo.cartasDisponibles();

        mazo.darCartas();

        mazo.cartasDisponibles();

        mazo.cartasMonton();

        mazo.mostrarBaraja();

    }

}