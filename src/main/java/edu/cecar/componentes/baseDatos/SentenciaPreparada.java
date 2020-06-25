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
 * Con está clase se gestiona lo referente a los procedimientos almacenados
 *
 */
public class SentenciaPreparada {

    private static PreparedStatement gestionarUsuario;
    private static PreparedStatement gestionarPaciente;
    private static PreparedStatement gestionarAreaCuerpo;
    private static PreparedStatement gestionarPrecioTratamiento;
    private static PreparedStatement gestionarTratamiento;
    private static PreparedStatement gestionarDiagnostico;
    private static PreparedStatement gestionarSesion;

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

    public static PreparedStatement getGestionarPrecioTratamiento() throws Exception {

        if (gestionarPrecioTratamiento == null) {

            gestionarPrecioTratamiento
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionarpreciotratamiento(?,?,?,?)");
        }

        return gestionarPrecioTratamiento;
    }

    public static PreparedStatement getGestionarTratamiento() throws Exception {

        if (gestionarTratamiento == null) {

            gestionarTratamiento
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionartratamiento(?,?,?,?)");
        }

        return gestionarTratamiento;
    }
    
    public static PreparedStatement getGestionarDiagnostico() throws Exception {

        if (gestionarDiagnostico == null) {

            gestionarDiagnostico
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionardiagnostico(?,?,?,?,?,?)");
        }

        return gestionarDiagnostico;
    }
    
    public static PreparedStatement getGestionarSesion() throws Exception {

        if (gestionarSesion == null) {

            gestionarSesion
                    = ConectarMySQL
                            .getConexion().prepareStatement(
                                    "call gestionarsesion1(?,?,?,?,?,?,?,?,?)");
        }

        return gestionarSesion;
    }

}
