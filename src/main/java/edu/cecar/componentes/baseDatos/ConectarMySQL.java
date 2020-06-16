/**
 *
 * Clase: ConectarMySQL
 *
 * @version: 0.1
 *
 * @Fecha de creación: 11/06/2020
 *
 * Fecha de Modificación:
 *
 * @author Jhon Jaime Mendez Alandete // modificado por: 1102838994
 *
 * Copyrigth: CECAR
 *
 */
package edu.cecar.componentes.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Esta clase permite conectar a una base de datos Mysql y ademas ejecutar
 * sentencias DML
 *
 */
public class ConectarMySQL {

    //** Declaracion de variables
    private static Connection conexion;

    /**
     * Constructor general que se conecta a la base de datos dependiendo de los
     * parametros
     *
     * @param servidorNombre Nombre del servidor o direccion IP
     * @param nombreBD nombre de la base de datos
     * @param usuario Usuario autorizado
     * @param password
     *
     */
    public static void getConectarMySQL(String servidorNombre, String nombreBD,
            String usuario, String password) throws Exception {

        if (conexion == null) {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            // Se conecta a la base de datos
            // Se crea un URL hacia la maquina y la base de datos
            String url = "jdbc:mysql://" + servidorNombre + "/" + nombreBD;

            //se crea la conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);

            //conexion.setAutoCommit(false);
        }

    }

    /**
     * Devuelve el objeto que permite la conexion a la base de datos
     *
     * @return Connection Conexion a la base de datos
     *
     */
    public static Connection getConexion() {

        return conexion;

    }

    /**
     * Permite hacer los cambios permanentes en la BD
     *
     */
    public void commit() throws Exception {

        conexion.commit();

    }

    /**
     * Permite deshacer cambios en la BD antes del ultimo commit
     *
     */
    public void rollback() throws Exception {

        conexion.rollback();

    }

}
