import java.util.Scanner;

public final class ProductoDaoExt extends DAO{

    public void consultarNombreProducto() throws Exception{

        String sql = "SELECT nombre FROM Producto;";

        try {

            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1));

            }

        } catch (Exception e) {

            throw e;

        }finally {

            desconectarBase();

        }



    }
    
    public void consultarNombreYprecio() throws Exception {

        String sql = "SELECT nombre, precio FROM producto;";

        try {

            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1) + " | $" + resultado.getDouble(2) );
                
            }

        } catch (Exception e) {

            throw e;

        }finally {

            desconectarBase();

        }

    }

    public void consultarProductoPorRango(int num1, int num2) throws Exception {

        String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN " + num1 + " AND " + num2;

        try {
            
            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1) + " | $" + resultado.getDouble(2));
                
            }

        } catch (Exception e) {

            throw e;        
        
        } finally {

            desconectarBase();

        }
    }

    public void consultarPortatiles() throws Exception{

        String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%portatil%'";

        try {
            
            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1) + " | $" + resultado.getDouble(2));
                
            }

        } catch (Exception e) {

            throw e;

        }finally {

            desconectarBase();

        }

    }

    public void consultarProductoMasBarato() throws Exception {

        String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1";

        try {
            
            consultarBase(sql);

            while (resultado.next()) {

                System.out.println(resultado.getString(1) + " | $" + resultado.getDouble(2));
                
            }

        } catch (Exception e) {

            desconectarBase();

            throw e;

        }finally {

            desconectarBase();

        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public void ingresarProducto() throws Exception {

        Scanner leer = new Scanner(System.in);

        try {
            
            System.out.println("Por favor ingrese el nombre del producto");

            String nombre = leer.nextLine();

            System.out.println("A continuación, ingrese el precio del producto");

            double precio = leer.nextDouble();

            System.out.println("Finalmente, ingrese el codigo del fabricante");

            int codigoFabricante = leer.nextInt();

            leer.nextLine();

            int codigoProducto = (obtenerUltimoCodigoProducto() + 1);

            Producto nuevoProducto = new Producto();

            nuevoProducto.setCodigo(codigoProducto);
            nuevoProducto.setNombre(nombre);
            nuevoProducto.setPrecio(precio);

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES (" 
                + nuevoProducto.getCodigo() + ", '" + nuevoProducto.getNombre() + "', " +  nuevoProducto.getPrecio() + ", " + codigoFabricante + ");";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    private int obtenerUltimoCodigoProducto() throws Exception{

        String sql = "SELECT MAX(codigo) FROM producto;";

        try {

            consultarBase(sql);

            resultado.next();

            return resultado.getInt(1);

        } catch (Exception e) {

            throw e;

        }finally {

            desconectarBase();

        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public void editarProducto() throws Exception{  // estoy terminando este metodo, creo que esta listo, falta probarlo y ver si anda, despues hay q ver los videos para ver donde ubicar cada metodo y asi usar todas las clases disponibles

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre del producto que desea editar");

        String productoAbuscar = leer.nextLine();

        String sql = "SELECT * FROM producto WHERE nombre LIKE '" + productoAbuscar + "';";

        try {

            consultarBase(sql);

            if (resultado != null) {

                System.out.println("Ingrese el nuevo nombre del producto");

                String nuevoNombre = leer.nextLine();

                System.out.println("Ingrese el nuevo precio del producto");

                int nuevoPrecio = leer.nextInt();

                String sql2 = "UPDATE producto SET nombre = '" 
                    + nuevoNombre + "' , precio = " + nuevoPrecio + " WHERE nombre = '" + productoAbuscar + "';";

                insertarModificarEliminar(sql2);
                
            } else {

                throw new Exception("El producto no existe");

            }

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();

        }

        

    }

}
