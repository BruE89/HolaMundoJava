import java.util.Scanner;

public class TiendaService {

    Scanner leer = new Scanner(System.in);

    FabricanteDaoExt f = new FabricanteDaoExt();

    ProductoDaoExt p = new ProductoDaoExt();

    public void menu() throws Exception{

        boolean salir = false;

        while (salir == false) {

            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Bienvenido al menu de la Tienda!");
            System.out.println(" ");
            System.out.println("Seleccione la opcíon que desea realizar");
            System.out.println("");
            System.out.println("1. Listar el nombre de todos los productos");
            System.out.println("2. Listar los nombres y los precios de todos los productos");
            System.out.println("3. Listar productos en un rango de precios seleccionado");
            System.out.println("4. Buscar y listar los productos portátiles");
            System.out.println("5. Listar el nombre y precio del producto más barato");
            System.out.println("6. Ingresar un nuevo producto");
            System.out.println("7. Ingresar un nuevo fabricante");
            System.out.println("8. Editar un producto");
            System.out.println("9. Salir");
            System.out.println(" ");

            String eleccion = leer.next();

            String opcion = eleccion.toLowerCase();

            switch (opcion) {

                case "1":

                    try {
                        p.consultarNombreProducto();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "2":

                    try {
                        p.consultarNombreYprecio();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "3":

                    System.out.println("Seleccione el precio mínimo");

                    int min = leer.nextInt();

                    System.out.println("Seleccion el precio máximo");

                    int max = leer.nextInt();

                    try {
                        p.consultarProductoPorRango(min,max);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    
                    break;

                case "4":

                    try {
                        p.consultarPortatiles();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "5":

                    try {
                        p.consultarProductoMasBarato();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "6":

                    try {
                        p.ingresarProducto();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "7":

                    try {
                        f.ingresarFabricante();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "8":

                    try {
                        p.editarProducto();
                    } catch (Exception e) {
                        e.getMessage();
                    }

                    break;

                case "9":

                    System.out.println("Saliendo del programa...");

                    salir = true;

                    break;

                default:

                    break;
            }

            System.out.println("");
            System.out.println("Presione ENTER para volver al menu principal...");

            leer.nextLine();
            leer.nextLine();

            System.out.flush();

        }

    }
    
}
