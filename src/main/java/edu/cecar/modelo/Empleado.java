/**
 *
 * Clase: Empleado
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
package edu.cecar.modelo;

import edu.cecar.componentes.Utilidades;

/**
 *
 *
 */
public class Empleado {

    private int numeroidentificacion;
    private String tipoidentificacion;
    private String nombres;
    private String apellidos;
    private String fechanacimiento;
    private String direccion;
    private Object[] telefonos;

    public Empleado(
            int numeroidentificacion,
            String tipoidentificacion,
            String nombres,
            String apellidos,
            String fechanacimiento,
            String direccion) {

        this.numeroidentificacion = numeroidentificacion;
        this.tipoidentificacion = tipoidentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
        this.telefonos = telefonos;

    }

    public Empleado(
            int numeroidentificacion,
            String tipoidentificacion,
            String nombres,
            String apellidos,
            String fechanacimiento,
            String direccion,
            Object[] telefonos) {

        this(numeroidentificacion,
                tipoidentificacion,
                nombres,
                apellidos,
                fechanacimiento,
                direccion);

        this.telefonos = telefonos;

    }

    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public int getEdad() {

        return Utilidades.getNumeroAños(fechanacimiento);

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

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Object[] getTelefonos() {
        return telefonos;
    }
}
