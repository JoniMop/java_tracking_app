/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.contacto;


public class Contacto {
    private String nombre;
    private String apellido;
    private String segundo_apellido;
    private String cedula;
    private int telefono1;
    private int telefono2;
    private String correo_electronico;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String segundo_apellido, String cedula, int telefono1, int telefono2, String correo_electronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundo_apellido = segundo_apellido;
        this.cedula = cedula;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correo_electronico = correo_electronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellido=" + apellido + ", segundo_apellido=" + segundo_apellido + ", cedula=" + cedula + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correo_electronico=" + correo_electronico + '}';
    }
    
    
    
}
