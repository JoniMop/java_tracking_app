/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.tl;

import cr_ac_ucenfotec.bl_dao.usuario.SqlServerUsuarioDao;
import cr_ac_ucenfotec.bl_dao.usuario.Usuario;

/**
 *
 * @author jonat
 */
public class ControllerLogin {
    public ControllerLogin(){
        
    }

   public Usuario login(String nombre, String clave) throws Exception{
       SqlServerUsuarioDao dao = new SqlServerUsuarioDao();
       return dao.login(nombre, clave);

}

}
