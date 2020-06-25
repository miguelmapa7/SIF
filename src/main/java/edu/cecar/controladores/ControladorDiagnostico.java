/**
 *
 * Clase: ControladorDiagnostico
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
import edu.cecar.modelo.Diagnostico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorDiagnostico {

    public void guardar(Diagnostico diagnostico) throws Exception {

        PreparedStatement gestionarDiagnostico
                = SentenciaPreparada.getGestionarDiagnostico();
        gestionarDiagnostico.setInt(1, 0);
        gestionarDiagnostico.setInt(2, diagnostico.getIdDiagnostico());
        gestionarDiagnostico.setInt(3, diagnostico.getIdPaciente());
        gestionarDiagnostico.setString(4, diagnostico.getDiagGeneral());
        gestionarDiagnostico.setString(5, diagnostico.getDiagEspecifico());
        gestionarDiagnostico.setString(6, diagnostico.getNumeroSesiones());

        gestionarDiagnostico.execute();

    }

    public Diagnostico consultar(String identificador) throws Exception {

        Diagnostico diagnostico = null;

        PreparedStatement consultarDiagnostico
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from diagnosticos "
                        + "where idDiagnostico = ?");
        consultarDiagnostico.setString(1, identificador);

        ResultSet resultSet = consultarDiagnostico.executeQuery();

        if (resultSet.next()) {

            diagnostico = new Diagnostico(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5));
        }

        return diagnostico;

    }
}
