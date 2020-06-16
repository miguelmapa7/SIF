/**
 *
 * Clase: Utilidades
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
package edu.cecar.componentes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Utilidades {

    /**
     *
     * @param fechaNacimiento
     * @return
     */
    public static int getNumeroAños(String fechaNacimiento) {

        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fechaNacimientoLocalDate
                = LocalDate.parse(fechaNacimiento, dateTimeFormatter);

        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNacimientoLocalDate, ahora);

        return periodo.getYears();
    }

    /**
     *
     * @param telefonos
     * @return
     */
    public static String getSepararComasArray(Object[] telefonos) {

        StringBuffer resultado = new StringBuffer();

        for (Object telefono : telefonos) {

            resultado.append(telefono).append(",");

        }

        return resultado.toString();

    }
}
