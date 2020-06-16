/**
 *
 * Clase: SentenciaPreparada
 *
 * @version: 0.1
 *
 * @Fecha de creación: 11/06/2020
 *
 * Fecha de Modificación:
 *
 * @author migue 1102838994
 *
 * Copyrigth: CECAR
 *
 */
package edu.cecar.componentes.baseDatos;

import java.sql.PreparedStatement;

/**
 *
 *
 */
public class SentenciaPreparada {

    private static PreparedStatement gestionarUsuario;
    private static PreparedStatement gestionarPaciente;
    private static PreparedStatement gestionarAreaCuerpo;
    private static PreparedStatement gestionarEmpleado;

    public static PreparedStatement getGestionarEmpleado() throws Exception {

        if (gestionarEmpleado == null) {

            gestionarEmpleado
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionarEmpleados(?,?,?,"
                                    + "?,?,?,?,?)");
        }

        return gestionarEmpleado;
    }

    public static PreparedStatement getGestionarPaciente() throws Exception {

        if (gestionarPaciente == null) {

            gestionarPaciente
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionarPacientes(?,?,?,"
                                    + "?,?,?,?)");
        }

        return gestionarPaciente;
    }

    public static PreparedStatement getGestionarUsuario() throws Exception {

        if (gestionarUsuario == null) {

            gestionarUsuario
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionarUsuarios(?,?,?,"
                                    + "?,?,?,?,?,?,?)");
        }

        return gestionarUsuario;
    }

    public static PreparedStatement getGestionarAreaCuerpo() throws Exception {

        if (gestionarAreaCuerpo == null) {

            gestionarAreaCuerpo
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionararea(?,?,?,?)");
        }

        return gestionarAreaCuerpo;
    }

}
