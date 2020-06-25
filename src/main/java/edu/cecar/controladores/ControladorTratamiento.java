/**
 *
 * Clase: ControladorTratamiento
 *
 * @version: 0.1
 *
 * @Fecha de creación: 16/06/2020
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
import edu.cecar.modelo.Tratamiento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorTratamiento {

    public void guardar(Tratamiento tratamiento) throws Exception {

        PreparedStatement gestionarTratamiento
                = SentenciaPreparada.getGestionarTratamiento();
        gestionarTratamiento.setInt(1, 0);
        gestionarTratamiento.setInt(2, tratamiento.getIdTratamiento());
        gestionarTratamiento.setString(3, tratamiento.getNombre());
        gestionarTratamiento.setInt(4, tratamiento.getPrecio());

        gestionarTratamiento.execute();

    }

    public Tratamiento consultar(String identificador) throws Exception {

        Tratamiento tratamiento = null;

        PreparedStatement consultarTratamiento
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from tratamientos "
                        + "where idTratamiento_pr = ?");
        consultarTratamiento.setString(1, identificador);

        ResultSet resultSet = consultarTratamiento.executeQuery();

        if (resultSet.next()) {

            tratamiento = new Tratamiento(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3));
        }

        return tratamiento;

    }
    
    public Tratamiento consultarTodos(String identificador) throws Exception {

        Tratamiento tratamiento = null;

        PreparedStatement consultarTratamiento
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from tratamientos "
                        + "where idTratamiento_pr = ?");
        consultarTratamiento.setString(1, identificador);

        ResultSet resultSet = consultarTratamiento.executeQuery();

        if (resultSet.next()) {

            tratamiento = new Tratamiento(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3));
        }

        return tratamiento;

    }
}
