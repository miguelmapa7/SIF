/**
 *
 * Clase: ControladorEmpleado
 *
 * @version: 0.1
 *
 * @Fecha de creación: 12/06/2020
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
import edu.cecar.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorEmpleado {

    public void guardar(Empleado empleado) throws Exception {

//        System.out.println(empleado.getTelefonos() + "  " + Utilidades.getSepararComasArray(empleado.getTelefonos()));
        PreparedStatement gestionarEmpleado
                = SentenciaPreparada.getGestionarEmpleado();
        gestionarEmpleado.setInt(1, 0);
        gestionarEmpleado.setInt(2, empleado.getNumeroidentificacion());
        gestionarEmpleado.setString(3, "" + empleado.getTipoidentificacion()
                .charAt(0));
        gestionarEmpleado.setString(4, empleado.getNombres());
        gestionarEmpleado.setString(5, empleado.getApellidos());
        gestionarEmpleado.setString(6, empleado.getFechanacimiento());
        gestionarEmpleado.setString(7, empleado.getDireccion());
        gestionarEmpleado.setString(8, Utilidades.getSepararComasArray(empleado
                .getTelefonos()));

        gestionarEmpleado.execute();

    }

    public void eliminar(Empleado empleado) throws Exception {

        PreparedStatement gestionarEmpleado
                = SentenciaPreparada.getGestionarEmpleado();
        gestionarEmpleado.setInt(2, empleado.getNumeroidentificacion());
        gestionarEmpleado.setInt(2, empleado.getNumeroidentificacion());
        gestionarEmpleado.setString(3, null);
        gestionarEmpleado.setString(4, null);
        gestionarEmpleado.setString(5, null);
        gestionarEmpleado.setString(6, null);
        gestionarEmpleado.setString(7, null);
        gestionarEmpleado.setString(8, null);
        gestionarEmpleado.execute();

    }

    public Empleado consultar(String identificador) throws Exception {

        Empleado empleado = null;

        PreparedStatement consultarEmpleado
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from empleados "
                        + "where numeroidentificacion = ?");
        consultarEmpleado.setString(1, identificador);

        ResultSet resultSet = consultarEmpleado.executeQuery();

        if (resultSet.next()) {

            empleado = new Empleado(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6));

        }

        return empleado;

    }

}
