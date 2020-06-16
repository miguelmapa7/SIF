/**
 *
 * Clase: SingletonConexionBaseDatos
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
package edu.cecar.singletons;

import edu.cecar.componentes.baseDatos.ConectarMySQL;
import java.sql.Connection;

/**
 *
 *
 */
public class SingletonConexionBaseDatos {

    private static ConectarMySQL conectarMySQL;

    public static ConectarMySQL getInstances(
            String servidorNombre,
            String nombreBD,
            String usuario,
            String password) throws Exception {

        if (conectarMySQL == null) {

            conectarMySQL = new ConectarMySQL();
            conectarMySQL.getConectarMySQL(
                    servidorNombre,
                    nombreBD,
                    usuario,
                    password);

        }

        return conectarMySQL;
    }

    public static Connection getInstanceConnection() {

        return conectarMySQL.getConexion();

    }

}
