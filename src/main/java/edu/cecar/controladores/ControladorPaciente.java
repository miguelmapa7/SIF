
/**
 *
 * Clase: ControladorPaciente
 *
 * @version: 0.1 
 *
 * @Fecha de creación: 14/06/2020
 *
 * Fecha de Modificación: 
 *
 * @author migue 1102838994
 *
 * Copyrigth: CECAR
 * 
 */

package edu.cecar.controladores;

import edu.cecar.componentes.Utilidades;
import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.componentes.baseDatos.SentenciaPreparada;
import edu.cecar.modelo.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * 
 */

public class ControladorPaciente {
    
    public void guardar(Paciente paciente) throws Exception {

        PreparedStatement gestionarPaciente
                = SentenciaPreparada.getGestionarPaciente();
        gestionarPaciente.setInt(1, 0);
        gestionarPaciente.setInt(2, paciente.getIdentificacionPaciente());
        gestionarPaciente.setString(3, paciente.getTipoIdentificacion());
        gestionarPaciente.setString(4, paciente.getNombres());
        gestionarPaciente.setString(5, paciente.getApellidos());
        gestionarPaciente.setString(6, paciente.getEmail());
        gestionarPaciente.setString(7, Utilidades.getSepararComasArray(paciente
                .getTelefonos()));

        gestionarPaciente.execute();

    }

    public Paciente consultar(String identificador) throws Exception {

        Paciente paciente = null;

        PreparedStatement consultarPaciente
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from pacientes "
                        + "where identificacionPaciente = ?");
        consultarPaciente.setString(1, identificador);

        ResultSet resultSet = consultarPaciente.executeQuery();

        if (resultSet.next()) {

            paciente = new Paciente(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5));
        }
        return paciente;

    }
}
