package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlmacenService {

    Scanner leer = new Scanner(System.in);

    HashMap<String, Integer> productos = new HashMap<>();
    
    public void menu(){

        while (true) {

            System.out.println("Bienvenido al Almacén de José!");
            System.out.println("");
            System.out.println("Elija una de las siguientes opciones según el número:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Todos Los Productos");
            System.out.println("5. Salir");

            String respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase("5")) {

                System.out.println("Saliendo del programa");

                break;
                
            }

            switch (respuesta) {

                case "1":

                    agregarProducto();
                    
                    break;

                case "2":

                    modificarPrecio();

                    break;

                case "3":

                    eliminarProducto();

                    break;

                case "4":

                    mostrarProductos();

                    break;
            
                default:

                    break;

            }

            System.out.println("Presiona ENTER para volver al menú principal");

            leer.nextLine();
            
        }

    }

    public void agregarProducto(){

        System.out.println("Ingrese el nombre del producto a agregar");

        String producto = leer.nextLine();

        System.out.println("Ahora ingrese el precio");

        int precio = leer.nextInt();

        leer.nextLine();

        productos.put(producto, precio);

    }

    public void modificarPrecio(){

        System.out.println("Ingrese el nombre del producto al que desea modificarle el precio");

        String productoModificar = leer.nextLine();

        if (!productos.containsKey(productoModificar)) {

            System.out.println("Error. el producto no se encuentra en la lista");
            
        }else {

            System.out.println("Ahora ingrese el nuevo precio");

            int nuevoPrecio = leer.nextInt();

            leer.nextLine();
    
            productos.replace(productoModificar, nuevoPrecio);

        }

    }

    public void eliminarProducto(){

        System.out.println("Seleccione un producto a eliminar");

        String eliminar = leer.nextLine();

        if (!productos.containsKey(eliminar)) {

            System.out.println("Error. No se puede eliminar producto. El producto no existe");
            
        }else{

            productos.remove(eliminar);

        }

    }

    public void mostrarProductos(){

        System.out.println("Mostrando todos los productos...");

        for (Map.Entry<String, Integer> elemento : productos.entrySet()) {
            
            System.out.println(elemento.getKey() + ": " + elemento.getValue());

        }

    }
    
}