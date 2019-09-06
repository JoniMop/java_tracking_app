/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.usuario;







public class Usuario {
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String correo_electronico;
    private String cedula;
    private String genero;
    private String clave;
    //protected String avatar; // pendiente investigar sobre tipo de dato para img de avatar.

    public Usuario() {
    }

    public Usuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico, String cedula, String genero, String clave) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.correo_electronico = correo_electronico;
        this.cedula = cedula;
        this.genero = genero;
        this.clave = clave;
       // this.avatar = avatar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", correo_electronico=" + correo_electronico + ", cedula=" + cedula + ", genero=" + genero + ", clave=" + clave + '}';
    }

   
    
    
   
    
}

