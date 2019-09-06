/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.clienteJuridico.ClienteJuridico;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.IClienteJuridicoDao;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.SqlServerClienteJuridicoDao;
import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class ControllerClienteJuridico {

    public ControllerClienteJuridico() {
    }

   
    
    
    
   public void registrarClienteJuridico(String nombre, String provincia, String canton, String distrito, 
                                        String direccion_exacta, String correo_electronico,
                                        int telefono, String cedula_juridica, String contacto)
           throws SQLException, Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        IClienteJuridicoDao daoObject = factory.insertarClienteJuridicoDao();
        daoObject.insertarClienteJuridico(nombre, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono, cedula_juridica, contacto);
    }
    
     public void actualizarClienteJuridico(String nombre, String provincia, String canton, String distrito, 
                                        String direccion_exacta, String correo_electronico,
                                        int telefono, String cedula_juridica, String contacto)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        SqlServerClienteJuridicoDao dao= new SqlServerClienteJuridicoDao();
        dao.actualizarClienteJuridico(nombre, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono, cedula_juridica, contacto);
    }

    public ClienteJuridico buscarClienteJuridico(String nombre) throws Exception {
               SqlServerClienteJuridicoDao dao= new SqlServerClienteJuridicoDao();
              return  dao.buscarClienteJuridico(nombre); }

    public ArrayList<ClienteJuridico> listarClienteJuridico() throws Exception {
                   SqlServerClienteJuridicoDao dao= new SqlServerClienteJuridicoDao();
              return  dao.listarClienteJuridico();    }

}




