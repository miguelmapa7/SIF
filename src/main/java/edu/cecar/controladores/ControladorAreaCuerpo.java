/**
 *
 * Clase: ControladorAreaCuerpo
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
import edu.cecar.modelo.AreaCuerpo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorAreaCuerpo {

    public void guardar(AreaCuerpo areaCuerpo) throws Exception {

        PreparedStatement gestionarArea
                = SentenciaPreparada.getGestionarAreaCuerpo();
        gestionarArea.setInt(1, 0);
        gestionarArea.setInt(2, areaCuerpo.getIdareaCuerpo());
        gestionarArea.setString(3, areaCuerpo.getDescripcion());
        gestionarArea.setString(4, areaCuerpo.getLado());

        gestionarArea.execute();

    }

    public AreaCuerpo consultar(String identificador) throws Exception {

        AreaCuerpo areaCuerpo = null;

        PreparedStatement consultarArea
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from area_cuerpo "
                        + "where idareaCuerpo = ?");
        consultarArea.setString(1, identificador);

        ResultSet resultSet = consultarArea.executeQuery();

        if (resultSet.next()) {

            areaCuerpo = new AreaCuerpo(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3));
        }

        return areaCuerpo;

    }

}
