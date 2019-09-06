/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.actividad;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public interface IActividadDao {
    
    //esto tengo que implementarlo en las clases que implementen esta Interfaces
    void insertarActividad(String codigo, String nombre, String descripcion) throws SQLException, Exception;
    void actualizarActividad(String codigo, String nombre, String descripcion) throws SQLException, Exception;
    ArrayList<Actividad> listarActividad() throws SQLException, Exception;
    Actividad buscarActividad(String codigo) throws SQLException, Exception;

    
    
    
}
