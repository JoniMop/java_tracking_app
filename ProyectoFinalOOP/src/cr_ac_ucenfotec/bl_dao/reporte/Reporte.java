/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.reporte;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.bitacora.Bitacora;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.proyecto.Proyecto;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;






public class Reporte {
    private Cliente cliente;
    private Proyecto proyecto;
    private Actividad actividad;
    private Tecnologia tecnologia;
    private Bitacora bitacora;

    public Reporte() {
    }

    public Reporte(Cliente cliente, Proyecto proyecto, Actividad actividad, Tecnologia tecnologia, Bitacora bitacora) {
        this.cliente = cliente;
        this.proyecto = proyecto;
        this.actividad = actividad;
        this.tecnologia = tecnologia;
        this.bitacora = bitacora;
    }

    
    
    
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }
    
    
    
    
    
    
    ///////////////////////////////RUTINAS PARA REPORTE SEGUN SU TIPO//////////////
   /* public String reporte_tiempo_por_periodo(){
        
    }
    
    public String reporte_curva_de_aprendizaje(){
        
    }*/

    @Override
    public String toString() {
        return "Reporte{" + "cliente=" + cliente + ", proyecto=" + proyecto + ", actividad=" + actividad + ", tecnologia=" + tecnologia + ", bitacora=" + bitacora + '}';
    }
}


