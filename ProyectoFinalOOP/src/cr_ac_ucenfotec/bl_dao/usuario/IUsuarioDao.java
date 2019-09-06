/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.usuario;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public interface IUsuarioDao {
    //esto tengo que implementarlo en las clases que implementen esta Interfaces
    void insertarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico,String cedula, String genero, String clave) throws SQLException, Exception;
    void actualizarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico,String cedula, String genero, String clave) throws SQLException, Exception;
    ArrayList<Usuario> listarUsuario() throws SQLException, Exception;
    Usuario buscarUsuario(String cedula) throws SQLException, Exception;
    Usuario login(String nombre, String clave) throws SQLException, Exception;
}
