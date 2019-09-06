/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import cr_ac_ucenfotec.bl_dao.proyecto.Proyecto;
import cr_ac_ucenfotec.bl_dao.proyecto.SqlServerProyectoDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.ITecnologiaDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.SqlServerTecnologiaDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class ControllerProyecto {
     public ControllerProyecto(){
        
    }

    public void registrarProyecto(String codigo, String nombre,String descripcion,String fechaI,String fechaF,ArrayList<String> lista,ArrayList<String> lista2, String clienteAsociado,String tipo)throws SQLException,
            Exception{
         SqlServerProyectoDao dao = new SqlServerProyectoDao();
         dao.insertarProyecto(codigo, nombre, descripcion, fechaI, fechaF, lista, lista2, clienteAsociado, tipo);
    }
    
  
    public Proyecto buscarProyecto(String codigo) throws Exception {
               SqlServerProyectoDao dao= new SqlServerProyectoDao();
              return  dao.buscarPorCodigo(codigo); }

    public ArrayList<Proyecto> listarProyectos() throws Exception {
                   SqlServerProyectoDao dao= new SqlServerProyectoDao();
              return  dao.listarProyectos();    } 

    public void actualizarProyecto(String codigo, String nombre,String descripcion,String fechaI,String fechaF,ArrayList<String> lista,ArrayList<String> lista2, String clienteAsociado,String tipo) throws Exception {
                 SqlServerProyectoDao dao = new SqlServerProyectoDao();

        dao.actualizarProyecto(codigo, nombre,descripcion,fechaI,fechaF,lista,lista2,clienteAsociado, tipo);
    }
}
