
package cr_ac_ucenfotec.bl_dao.factory;

import cr_ac_ucenfotec.bl_dao.actividad.IActividadDao;
import cr_ac_ucenfotec.bl_dao.clienteFisico.IClienteFisicoDao;
import cr_ac_ucenfotec.bl_dao.clienteJuridico.IClienteJuridicoDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.ITecnologiaDao;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import cr_ac_ucenfotec.bl_dao.usuario.IUsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;


public abstract class DaoFactory {
    public static final int SqlServer = 1;
    public static final int MySQL = 2;
    
    //el metodo de aqui abajo es static segun sugerencia del IDE en Archivo Controller
    public static DaoFactory getDaoFactory(int whichFactory){
        switch(whichFactory){
            case 1:
                return new SqlServerDaoFactory();
                
            case 2:
                //return new MySqlDaoFactory();
        }
        return null;
    }
    
    public abstract ITecnologiaDao insertarTecnologiaDao();
    public abstract ITecnologiaDao listarTecnologiaDao();
    public abstract ITecnologiaDao actualizarTecnologia();
    public abstract ITecnologiaDao buscarTecnologia();
    
    public abstract IActividadDao insertarActividadDao();
    public abstract IActividadDao listarActividadDao();
    public abstract IActividadDao actualizarActividad();
    public abstract IActividadDao buscarActividad();
    
    
    public abstract IUsuarioDao insertarUsuarioDao();
    public abstract IUsuarioDao listarUsuarioDao();
    public abstract IUsuarioDao actualizarUsuarioDao();
    public abstract IUsuarioDao buscarUsuarioDao();
    public abstract IUsuarioDao loginUsuarioDao();
    
    public abstract IClienteJuridicoDao insertarClienteJuridicoDao();
    public abstract IClienteJuridicoDao listarClienteJuridicoDao();
    public abstract IClienteJuridicoDao actualizarClienteJuridico();
    public abstract IClienteJuridicoDao buscarClienteJuridico();
    
    
    
    public abstract IClienteFisicoDao insertarClienteFisicoDao();
    public abstract IClienteFisicoDao listarClienteFisicoDao();
    public abstract IClienteFisicoDao actualizarClienteFisicoDao();
    public abstract IClienteFisicoDao buscarClienteFisicoDao();
     
}
