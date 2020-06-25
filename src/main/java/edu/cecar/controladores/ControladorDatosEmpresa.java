/**
 *
 * Clase: ControladorDatosEmpresa
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
import edu.cecar.modelo.DatosEmpresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorDatosEmpresa {

    public DatosEmpresa consultar(String identificador) throws Exception {

        DatosEmpresa datosEmpresa = null;

        PreparedStatement consultarDatos
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from empresa_datos "
                        + "where id_datoss = ?");
        consultarDatos.setString(1, identificador);

        ResultSet resultSet = consultarDatos.executeQuery();

        if (resultSet.next()) {

            datosEmpresa = new DatosEmpresa(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4));
        }

        return datosEmpresa;

    }
}
