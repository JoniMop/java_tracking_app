/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.clienteFisico.ClienteFisico;
import cr_ac_ucenfotec.bl_dao.clienteFisico.IClienteFisicoDao;
import cr_ac_ucenfotec.bl_dao.clienteFisico.SqlServerClienteFisicoDao;
import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class ControllerClienteFisico {

    public ControllerClienteFisico() {
    }
     public void registrarClientefisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito, 
                                        String direccion_exacta, String correo_electronico,
                                        int telefono)
           throws SQLException, Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        IClienteFisicoDao daoObject = factory.insertarClienteFisicoDao();
        daoObject.insertarClienteFisico(nombre, primer_apellido, segundo_apellido, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono);
    }
    
     public void actualizarClienteFisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito, 
                                        String direccion_exacta, String correo_electronico,
                                        int telefono)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        SqlServerClienteFisicoDao dao= new SqlServerClienteFisicoDao();
        dao.actualizarClienteFisico(nombre, primer_apellido, segundo_apellido, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono);
    }

    public ClienteFisico buscarClienteFisico(String correo_electronico) throws Exception {
               SqlServerClienteFisicoDao dao= new SqlServerClienteFisicoDao();
              return  dao.buscarClienteFisico(correo_electronico); }

    public ArrayList<ClienteFisico> listarClienteFisico() throws Exception {
                   SqlServerClienteFisicoDao dao= new SqlServerClienteFisicoDao();
              return  dao.listarClienteFisico();    }

}






