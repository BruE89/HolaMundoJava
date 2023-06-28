package src;

import Servicios.HotelesService;

public class App {
    public static void main(String[] args) throws Exception {

        HotelesService hs = new HotelesService();

        hs.crearListaHoteles();
        hs.crearListas();

        hs.mostrarTodos();
        hs.mostrarHotelesPorPrecio();
        hs.mostrarCampingsConRestaurante();
        hs.mostrarResidenciasConDescuente();

    }

}