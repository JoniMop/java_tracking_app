/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.usuario;

import accesodatos.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public class MySqlUsuarioDao implements IUsuarioDao {
    
     @Override
    public void insertarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico,String cedula, String genero, String clave
    ) throws SQLException, Exception 
    {
        System.out.println("Hola estoy aqui");
        
        String queryText;
        queryText = "INSERT INTO TUSUARIO (NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO, CORREO_ELECTRONICO, CEDULA, GENERO, CLAVE) values('"
                   + nombre + "','" +  primer_apellido + "','" + segundo_apellido + "','" + correo_electronico +
                "','" + cedula + "','" + genero +"','" + clave + "')";
    Conector.getConector().ejecutarSql(queryText);

   

    }
    
    
    @Override
    public void actualizarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico,String cedula, String genero, String clave
    ) throws SQLException, Exception 
    {
        System.out.println("Hola estoy aqui");
        
        String queryText;
        queryText = "update TUSUARIO set nombre='"+nombre+"' where codigo='"+cedula+"'";
        Conector.getConector().ejecutarSql(queryText);

   

    }

    @Override
    public ArrayList<Usuario> listarUsuario() throws SQLException, Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ResultSet rs;
        String queryText;
        queryText = "SELECT * FROM TUSUARIO";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            Usuario tmpUsuario = new Usuario(
                    rs.getString("NOMBRE"),
                    rs.getString("PRIMER_APELLIDO"),
                    rs.getString("SEGUNDO_APELLIDO"),
                    rs.getString("CORREO_ELECTRONICO"),
                    rs.getString("CEDULA"),
                    rs.getString("GENERO"),
                    rs.getString("CLAVE"));
                  
            usuarios.add(tmpUsuario);
        }
        return usuarios;
    }

    @Override
    public Usuario buscarUsuario(String pCedula) throws SQLException, Exception {
        Usuario tmpUsuario = new Usuario();
        ResultSet rs;
        String queryText = "SELECT * FROM TUSUARIO WHERE CEDULA = '"
                + pCedula + "'";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            tmpUsuario.setCedula(rs.getString("CEDULA"));
            tmpUsuario.setNombre(rs.getString("NOMBRE"));

        }
        return tmpUsuario;
    }

    @Override
    public Usuario login(String nombre, String clave) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

