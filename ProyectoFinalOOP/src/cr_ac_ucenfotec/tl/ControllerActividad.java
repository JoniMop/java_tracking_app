/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.actividad.IActividadDao;
import cr_ac_ucenfotec.bl_dao.actividad.SqlServerActividadDao;
import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class ControllerActividad {
     public ControllerActividad(){
        
    }

    public void registrarActividad(String codigo, String nombre, String descripcion)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        IActividadDao daoObject = factory.insertarActividadDao();
        daoObject.insertarActividad(codigo, nombre, descripcion);
    }
    
     public void actualizarActividad(String codigo, String nombre, String descripcion)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        SqlServerActividadDao dao= new SqlServerActividadDao();
        dao.actualizarActividad(codigo, nombre, descripcion);
    }

    public Actividad buscarActividad(String codigo) throws Exception {
               SqlServerActividadDao dao= new SqlServerActividadDao();
              return  dao.buscarActividad(codigo); }

    public ArrayList<Actividad> listarActividades() throws Exception {
                   SqlServerActividadDao dao= new SqlServerActividadDao();
              return  dao.listarActividad();    }

}


