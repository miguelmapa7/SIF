/**
 *
 * Clase: Paciente
 *
 * @version: 0.1
 *
 * @Fecha de creación: 14/06/2020
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
public class Paciente {

    private int identificacionPaciente;
    private String tipoIdentificacion;
    private String nombres;
    private String apellidos;
    private String email;
    private Object[] telefonos;

    public Paciente(int identificacionPaciente,
            String tipoIdentificacion,
            String nombres,
            String apellidos,
            String email,
            Object[] telefonos) {

        this.identificacionPaciente = identificacionPaciente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefonos = telefonos;
    }

    public Paciente(int identificacionPaciente, 
            String tipoIdentificacion, 
            String nombres, 
            String apellidos, 
            String email) {
        
        this.identificacionPaciente = identificacionPaciente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }
    
    

    public int getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public void setIdentificacionPaciente(int identificacionPaciente) {
        this.identificacionPaciente = identificacionPaciente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Object[] telefonos) {
        this.telefonos = telefonos;
    }

}
