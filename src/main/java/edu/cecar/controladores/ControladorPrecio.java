/**
 *
 * Clase: ControladorPrecio
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
import edu.cecar.modelo.Precio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 *
 */
public class ControladorPrecio {

    public void guardar(Precio precio) throws Exception {

        PreparedStatement gestionarPrecioTratamiento
                = SentenciaPreparada.getGestionarPrecioTratamiento();
        gestionarPrecioTratamiento.setInt(1, 0);
        gestionarPrecioTratamiento.setInt(2, precio.getIdPrecios());
        gestionarPrecioTratamiento.setInt(3, precio.getiDAreaCuerpo());
        gestionarPrecioTratamiento.setString(4, precio.getValor());

        gestionarPrecioTratamiento.execute();

    }

    public Precio consultar(String identificador) throws Exception {

        Precio precio = null;

        PreparedStatement consultarPrecio
                = ConectarMySQL.getConexion().prepareStatement(
                        "Select * "
                        + "from precios "
                        + "where idPrecios = ?");
        consultarPrecio.setString(1, identificador);

        ResultSet resultSet = consultarPrecio.executeQuery();

        if (resultSet.next()) {

            precio = new Precio(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getString(3));
        }

        return precio;

    }
}
