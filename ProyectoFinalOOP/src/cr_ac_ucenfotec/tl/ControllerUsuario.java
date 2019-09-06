/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.factory.DaoFactory;
import cr_ac_ucenfotec.bl_dao.usuario.IUsuarioDao;
import cr_ac_ucenfotec.bl_dao.usuario.SqlServerUsuarioDao;
import cr_ac_ucenfotec.bl_dao.usuario.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonat
 */
public class ControllerUsuario {

    public ControllerUsuario(){
        
    }

    public void registrarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico, String cedula, String genero, String clave)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        IUsuarioDao daoObject = factory.insertarUsuarioDao();
        daoObject.insertarUsuario(nombre, primer_apellido, segundo_apellido, correo_electronico, cedula, genero, clave);
    }
    
   
    
     public void actualizarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico, String cedula, String genero, String clave)throws SQLException,
            Exception{
        DaoFactory factory = DaoFactory.getDaoFactory(DaoFactory.SqlServer);
        SqlServerUsuarioDao dao= new SqlServerUsuarioDao();
        dao.actualizarUsuario(nombre, primer_apellido, segundo_apellido, cedula, correo_electronico, genero, clave);
    }

    public Usuario buscarUsuario(String cedula) throws Exception {
               SqlServerUsuarioDao dao= new SqlServerUsuarioDao();
              return  dao.buscarUsuario(cedula); }

    public ArrayList<Usuario> listarUsuario() throws Exception {
                   SqlServerUsuarioDao dao= new SqlServerUsuarioDao();
              return  dao.listarUsuario();    }
    
    
    

}


