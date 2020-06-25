/**
 *
 * Clase: Precio
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
public class Precio {

    private int idPrecios;
    private int iDAreaCuerpo;
    private String valor;

    public Precio(int idPrecios, int iDAreaCuerpo, String valor) {
        this.idPrecios = idPrecios;
        this.iDAreaCuerpo = iDAreaCuerpo;
        this.valor = valor;
    }

    public int getIdPrecios() {
        return idPrecios;
    }

    public void setIdPrecios(int idPrecios) {
        this.idPrecios = idPrecios;
    }

    public int getiDAreaCuerpo() {
        return iDAreaCuerpo;
    }

    public void setiDAreaCuerpo(int iDAreaCuerpo) {
        this.iDAreaCuerpo = iDAreaCuerpo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
