/**
 *
 * Clase: ContraladorSesion
 *
 * @version: 0.1
 *
 * @Fecha de creación: 17/06/2020
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
import edu.cecar.modelo.Sesion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ContraladorSesion {

    public void guardar(Sesion sesion) throws Exception {

        PreparedStatement gestionarSesion
                = SentenciaPreparada.getGestionarSesion();
        gestionarSesion.setInt(1, 0);
        gestionarSesion.setInt(2, sesion.getIdSesion());
        gestionarSesion.setString(3, sesion.getFecha());
        gestionarSesion.setInt(4, sesion.getIdDiagnostico());
        gestionarSesion.setString(5, sesion.getPeso());
        gestionarSesion.setString(6, sesion.getPresion());
        gestionarSesion.setString(7, sesion.getTemperatura());
        gestionarSesion.setString(8, sesion.getNivelDolor());
        gestionarSesion.setString(9, sesion.getResultado());

        gestionarSesion.execute();

    }

    public Sesion consultar(String identificador) throws Exception {

        Sesion sesion = null;

        PreparedStatement consultarSesion
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from sesiones "
                        + "where idSesion = ?");
        consultarSesion.setString(1, identificador);

        ResultSet resultSet = consultarSesion.executeQuery();

        if (resultSet.next()) {

            sesion = new Sesion(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8));
        }

        return sesion;

    }
}
