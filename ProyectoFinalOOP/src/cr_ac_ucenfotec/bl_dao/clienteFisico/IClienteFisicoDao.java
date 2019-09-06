/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteFisico;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public interface IClienteFisicoDao {
     //esto tengo que implementarlo en las clases que implementen esta Interfaces
    void insertarClienteFisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito,  String direccion_exacta, String correo_electronico, int telefono) throws SQLException, Exception;
    void actualizarClienteFisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito,  String direccion_exacta, String correo_electronico, int telefono) throws SQLException, Exception;
    ArrayList<ClienteFisico> listarClienteFisico() throws SQLException, Exception;
    ClienteFisico buscarClienteFisico(String correo_electronico) throws SQLException, Exception;

}
