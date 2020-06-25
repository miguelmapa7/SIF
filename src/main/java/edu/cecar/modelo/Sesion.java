/**
 *
 * Clase: Sesion
 *
 * @version: 0.1
 *
 * @Fecha de creación: 17/06/2020
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
public class Sesion {

    private int idSesion;
    private String fecha;
    private int idDiagnostico;
    private String peso;
    private String presion;
    private String temperatura;
    private String nivelDolor;
    private String resultado;

    public Sesion(int idSesion, String fecha, int idDiagnostico, String peso, String presion, String temperatura, String nivelDolor, String resultado) {
        this.idSesion = idSesion;
        this.fecha = fecha;
        this.idDiagnostico = idDiagnostico;
        this.peso = peso;
        this.presion = presion;
        this.temperatura = temperatura;
        this.nivelDolor = nivelDolor;
        this.resultado = resultado;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getNivelDolor() {
        return nivelDolor;
    }

    public void setNivelDolor(String nivelDolor) {
        this.nivelDolor = nivelDolor;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
