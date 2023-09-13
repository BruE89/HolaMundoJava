import java.util.Scanner;

public class FabricanteDaoExt extends DAO{

    public void ingresarFabricante() throws Exception {

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre del nuevo fabricante");

        Fabricante nuevoFabricante = new Fabricante();

        nuevoFabricante.setNombre(leer.nextLine());

        nuevoFabricante.setCodigo(obtenerUltimoCodigoFabricante() + 1);

        String sql = "INSERT INTO fabricante (codigo,nombre) VALUES (" + nuevoFabricante.getCodigo() + ", '" + nuevoFabricante.getNombre() + "');";

        insertarModificarEliminar(sql);

    }

    private int obtenerUltimoCodigoFabricante() throws Exception{

        String sql = "SELECT max(codigo) FROM fabricante;";

        try {

            consultarBase(sql);

            resultado.next();

            return resultado.getInt(1);

        } catch (Exception e) {

            desconectarBase();

            throw e;

        }finally {

            desconectarBase();

        }

    }

    
}
