/**
 *
 * Clase: AreaCuerpo
 *
 * @version: 0.1
 *
 * @Fecha de creación: 15/06/2020
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
public class AreaCuerpo {

    private int idareaCuerpo;
    private String descripcion;
    private String lado;

    public AreaCuerpo(int idareaCuerpo, String descripcion, String lado) {
        this.idareaCuerpo = idareaCuerpo;
        this.descripcion = descripcion;
        this.lado = lado;
    }

    public int getIdareaCuerpo() {
        return idareaCuerpo;
    }

    public void setIdareaCuerpo(int idareaCuerpo) {
        this.idareaCuerpo = idareaCuerpo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

}
