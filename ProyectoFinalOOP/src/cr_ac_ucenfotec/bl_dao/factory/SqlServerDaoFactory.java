/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.factory;

import cr_ac_ucenfotec.bl_dao.actividad.*;
import cr_ac_ucenfotec.bl_dao.clienteFisico.IClienteFisicoDao;
import cr_ac_ucenfotec.bl_dao.clienteFisico.SqlServerClienteFisicoDao;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.IClienteJuridicoDao;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.SqlServerClienteJuridicoDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.*;
import cr_ac_ucenfotec.bl_dao.usuario.IUsuarioDao;
import cr_ac_ucenfotec.bl_dao.usuario.SqlServerUsuarioDao;



public class SqlServerDaoFactory extends DaoFactory {
    
    @Override
    public ITecnologiaDao insertarTecnologiaDao(){
        return new SqlServerTecnologiaDao();
    }
    
    @Override
    public ITecnologiaDao listarTecnologiaDao(){
        return new SqlServerTecnologiaDao();
    }
    
    @Override
    public ITecnologiaDao actualizarTecnologia(){
        return new SqlServerTecnologiaDao();
    }
    
    @Override
    public ITecnologiaDao buscarTecnologia(){
        return new SqlServerTecnologiaDao();
    }
   ////////////////////////////////////////////////////////// 
    
    @Override
    public IActividadDao insertarActividadDao(){
        return new SqlServerActividadDao();
    }
    
    @Override
    public IActividadDao listarActividadDao(){
        return new SqlServerActividadDao();
    }
    
    @Override
    public IActividadDao actualizarActividad(){
        return new SqlServerActividadDao();
    }
    
    @Override
    public IActividadDao buscarActividad(){
        return new SqlServerActividadDao();
    }
    
    /////////////////////////////////////////////////
    
    @Override
     public IUsuarioDao insertarUsuarioDao(){
        return new SqlServerUsuarioDao();
    }
    
    @Override
    public IUsuarioDao listarUsuarioDao(){
        return new SqlServerUsuarioDao();
    }
    
    @Override
    public IUsuarioDao actualizarUsuarioDao(){
        return new SqlServerUsuarioDao();
    }
    
    @Override
    public IUsuarioDao buscarUsuarioDao(){
        return new SqlServerUsuarioDao();
    }
    
    @Override
     public IUsuarioDao loginUsuarioDao(){
        return new SqlServerUsuarioDao();
    }

//////////////////////////////////////////////////////////////
    
    @Override
    public IClienteJuridicoDao insertarClienteJuridicoDao(){
        return new SqlServerClienteJuridicoDao();
    }
    
    @Override
    public IClienteJuridicoDao listarClienteJuridicoDao(){
        return new SqlServerClienteJuridicoDao();
    }
    
    @Override
    public IClienteJuridicoDao actualizarClienteJuridico(){
        return new SqlServerClienteJuridicoDao();
    }
    
    @Override
    public IClienteJuridicoDao buscarClienteJuridico(){
        return new SqlServerClienteJuridicoDao();
    }
    
    
    //////////////////////////////////////////////////////////////
    
     @Override
    public IClienteFisicoDao insertarClienteFisicoDao(){
        return new SqlServerClienteFisicoDao();
    }
    
    @Override
    public IClienteFisicoDao listarClienteFisicoDao(){
        return new SqlServerClienteFisicoDao();
    }
    
    @Override
    public IClienteFisicoDao actualizarClienteFisicoDao(){
        return new SqlServerClienteFisicoDao();
    }
    
    @Override
    public IClienteFisicoDao buscarClienteFisicoDao(){
        return new SqlServerClienteFisicoDao();
    }

   
   
    

}
    

    
    
   
    

