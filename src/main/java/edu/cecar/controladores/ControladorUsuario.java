/**
 *
 * Clase: ControladorUsuario
 *
 * @version: 0.1
 *
 * @Fecha de creación: 13/06/2020
 *
 * Fecha de Modificación:
 *
 * @author migue 1102838994
 *
 * Copyrigth: CECAR
 *
 */
package edu.cecar.controladores;

import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.componentes.baseDatos.SentenciaPreparada;
import edu.cecar.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Con está clase se gestionaran los usuarios getGestionarUsuario()
 *
 */
public class ControladorUsuario {

    public void guardar(Usuario usuario) throws Exception {

        PreparedStatement gestionarUsuario
                = SentenciaPreparada.getGestionarUsuario();
        gestionarUsuario.setInt(1, 0);
        gestionarUsuario.setInt(2, usuario.getIdentificacionUsuario());
        gestionarUsuario.setString(3, usuario.getTipoIdentificacion());
        gestionarUsuario.setString(4, usuario.getNombres());
        gestionarUsuario.setString(5, usuario.getApellidos());
        gestionarUsuario.setString(6, usuario.getDireccion());
        gestionarUsuario.setString(7, usuario.getTelefono());
        gestionarUsuario.setString(8, usuario.getContrasena());
        gestionarUsuario.setInt(9, usuario.getTipoUsuario());
        gestionarUsuario.setString(10, usuario.getEstado());

        gestionarUsuario.execute();

    }

    public Usuario consultar(String identificador) throws Exception {

        Usuario usuario = null;

        PreparedStatement consultarUsuario
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from usuarios "
                        + "where idusuario = ?");
        consultarUsuario.setString(1, identificador);

        ResultSet resultSet = consultarUsuario.executeQuery();

        if (resultSet.next()) {

            usuario = new Usuario(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getInt(8),
                    resultSet.getString(9));

        }

        return usuario;

    }

}
