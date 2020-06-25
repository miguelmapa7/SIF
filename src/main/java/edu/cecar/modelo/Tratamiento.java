/**
 *
 * Clase: Tratamiento
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
package edu.cecar.modelo;

/**
 *
 *
 */
public class Tratamiento {

    private int idTratamiento;
    private String nombre;
    private int precio;

    public Tratamiento(int idTratamiento, String nombre, int precio) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
