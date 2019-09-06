/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.tecnologia;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public interface ITecnologiaDao {
    //esto tengo que implementarlo en las clases que implementen esta Interfaces
    void insertarTecnologia(String codigo, String nombre) throws SQLException, Exception;
    void actualizarTecnologia(String codigo, String nombre) throws SQLException, Exception;
    ArrayList<Tecnologia> listarTecnologia() throws SQLException, Exception;
    Tecnologia buscarTecnologia(String codigo) throws SQLException, Exception;

    
    
}
