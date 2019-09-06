/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.proyecto;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Proyecto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private ArrayList tecnologias;
    private ArrayList actividades;
    private String clienteAsociado;
    private String tipo;

    public Proyecto() {
    }

    public Proyecto(String codigo, String nombre, String descripcion, String fecha_inicio, String fecha_fin, ArrayList<Tecnologia> tecnologias, ArrayList<Actividad> actividades, String clienteAsociado, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.tecnologias = tecnologias;
        this.actividades = actividades;
        this.clienteAsociado = clienteAsociado;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public ArrayList<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(ArrayList<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public String getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(String clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", tecnologias=" + tecnologias + ", actividades=" + actividades + ", clienteAsociado=" + clienteAsociado + ", tipo=" + tipo + '}';
    }
 
    
    

}