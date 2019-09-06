/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteJuridico;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public interface IClienteJuridicoDao {
     //esto tengo que implementarlo en las clases que implementen esta Interfaces
    void insertarClienteJuridico(String nombre, String provincia, String canton, String distrito,  String direccion_exacta, String correo_electronico, int telefono, String cedula_juridica, String contacto) throws SQLException, Exception;
    void actualizarClienteJuridico(String nombre, String provincia, String canton, String distrito,  String direccion_exacta, String correo_electronico, int telefono, String cedula_juridica, String contacto) throws SQLException, Exception;
    ArrayList<ClienteJuridico> listarClienteJuridico() throws SQLException, Exception;
    ClienteJuridico buscarClienteJuridico(String cedula_juridica) throws SQLException, Exception;

}
