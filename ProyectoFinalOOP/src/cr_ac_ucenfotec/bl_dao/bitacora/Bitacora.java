/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.bitacora;

import cr_ac_ucenfotec.bl_dao.proyecto.Proyecto;
import cr_ac_ucenfotec.bl_dao.usuario.Usuario;

/**
 *
 * @author jonatangur-ari
 */
public class Bitacora {
    
    private String actividad;
    //private Date fecha_inicio;
   // private Date fecha_fin;
    private Proyecto proyecto;
    private Usuario usuario;

    public Bitacora() {
    }

    public Bitacora(String actividad, /*Date fecha_inicio, Date fecha_fin,*/ Proyecto proyecto, Usuario usuario) {
        this.actividad = actividad;
        //this.fecha_inicio = fecha_inicio;
        //this.fecha_fin = fecha_fin;
        this.proyecto = proyecto;
        this.usuario = usuario;
    }
    
    
    

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

   /* public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }*/

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Bitacora{" + "actividad=" + actividad + /*", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin +*/ ", proyecto=" + proyecto + ", usuario=" + usuario + '}';
    }
    
    
    
    
}

    

