/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import cr_ac_ucenfotec.bl_dao.tecnologia.ITecnologiaDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.SqlServerTecnologiaDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Date;

public class ControllerTecnologia {
    
    public ControllerTecnologia(){
        
    }

    public void registrarTecnologia(String codigo, String nombre)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        ITecnologiaDao daoObject = factory.insertarTecnologiaDao();
        daoObject.insertarTecnologia(codigo, nombre);
    }
    
     public void actualizarTecnologia(String codigo, String nombre)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        SqlServerTecnologiaDao dao= new SqlServerTecnologiaDao();
        dao.actualizarTecnologia(codigo, nombre);
    }

    public Tecnologia buscarTecnologia(String codigo) throws Exception {
               SqlServerTecnologiaDao dao= new SqlServerTecnologiaDao();
              return  dao.buscarTecnologia(codigo); }

    public ArrayList<Tecnologia> listarTecnologias() throws Exception {
                   SqlServerTecnologiaDao dao= new SqlServerTecnologiaDao();
              return  dao.listarTecnologia();    }

}
