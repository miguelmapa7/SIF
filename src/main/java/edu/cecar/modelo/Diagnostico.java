/**
 *
 * Clase: Diagnostico
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
public class Diagnostico {

    private int idDiagnostico;
    private int idPaciente;
    private String diagGeneral;
    private String diagEspecifico;
    private String numeroSesiones;

    public Diagnostico(int idDiagnostico, int idPaciente, String diagGeneral, String diagEspecifico, String numeroSesiones) {
        this.idDiagnostico = idDiagnostico;
        this.idPaciente = idPaciente;
        this.diagGeneral = diagGeneral;
        this.diagEspecifico = diagEspecifico;
        this.numeroSesiones = numeroSesiones;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDiagGeneral() {
        return diagGeneral;
    }

    public void setDiagGeneral(String diagGeneral) {
        this.diagGeneral = diagGeneral;
    }

    public String getDiagEspecifico() {
        return diagEspecifico;
    }

    public void setDiagEspecifico(String diagEspecifico) {
        this.diagEspecifico = diagEspecifico;
    }

    public String getNumeroSesiones() {
        return numeroSesiones;
    }

    public void setNumeroSesiones(String numeroSesiones) {
        this.numeroSesiones = numeroSesiones;
    }

}
