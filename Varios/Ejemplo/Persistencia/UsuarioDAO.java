package Persistencia;

import Dominio.Usuario.Usuario;

public class UsuarioDAO extends DAO{

    public void guardarUsuario(Usuario usuario) throws Exception{

        try {
            
            if (usuario == null) {

                throw new Exception("Debe indicar un usuario");
                
            }

            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                + "VALUES ('" + usuario.getCorreoElectronico() + "', '" + usuario.getClave() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    public void modificarUsuario(Usuario usuario) throws Exception {

        try {
            
            if (usuario == null) {

                throw new Exception("Usuario no valido");
                
            }

            String sql = "UPDATE Usuario SET"
                + " clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "' ;";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    public void eliminarUsuario(String correoElectronico) throws Exception {

        try {
            
            String sql = "DELETE * FROM Usuario WHERE correoElectronico = '" + correoElectronico + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception{

        try {

            String sql = "SELECT * FROM usuario "
                + "WHERE correoElectronico = '" + correoElectronico + "';";

            consultarBase(sql);

            Usuario usuario = null;

            while (resultado.next()) {

                usuario = new Usuario();

                usuario.setId(resultado.getInt(1));

                usuario.setCorreoElectronico(resultado.getString(2));

                usuario.setClave(resultado.getString(3));
                
            }

            desconectarBase();

            return usuario;
            
        } catch (Exception e) {

            desconectarBase();

            throw e;

        }finally {

            desconectarBase();

        }



    }

}