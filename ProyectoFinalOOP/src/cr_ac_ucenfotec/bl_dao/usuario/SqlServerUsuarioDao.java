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
public class SqlServerUsuarioDao implements IUsuarioDao {

    @Override
    public void insertarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico, String cedula, String genero, String clave
    ) throws SQLException, Exception {
        System.out.println("Registrando...");

        String queryText;
        queryText = "INSERT INTO TUSUARIO (NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO, CORREO_ELECTRONICO, CEDULA, GENERO, CLAVE) values('"
                + nombre + "','" + primer_apellido + "','" + segundo_apellido + "','" + correo_electronico
                + "','" + cedula + "','" + genero + "','" + clave + "' )";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public void actualizarUsuario(String nombre, String primer_apellido, String segundo_apellido, String correo_electronico, String cedula, String genero, String clave
    ) throws SQLException, Exception {
        System.out.println("Actualizando...");

        String queryText;
        queryText = "UPDATE TUSUARIO SET NOMBRE = '" + nombre + "' ,  PRIMER_APELLIDO = '" + primer_apellido + "' , SEGUNDO_APELLIDO ='" + segundo_apellido + "' , CORREO_ELECTRONICO='" + correo_electronico + "' , CEDULA='" + cedula + "', GENERO='" + genero + "', CLAVE='" + clave + "' WHERE NOMBRE='" + nombre + "'";
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

            tmpUsuario.setNombre(rs.getString("NOMBRE"));
            tmpUsuario.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
            tmpUsuario.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
            tmpUsuario.setCorreo_electronico(rs.getString("CORREO_ELECTRONICO"));
            tmpUsuario.setCedula(rs.getString("CEDULA"));
            tmpUsuario.setGenero(rs.getString("GENERO"));
            tmpUsuario.setClave(rs.getString("CLAVE"));
        }
        return tmpUsuario;
    }
    
     @Override
    public Usuario login(String correo, String clave) throws SQLException, Exception {
        Usuario tmpUsuario = new Usuario();
        ResultSet rs;
        String queryText = "SELECT * FROM TUSUARIO WHERE CLAVE  = '"
                + clave + "' and correo_electronico='"+correo+"';";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {

            tmpUsuario.setNombre(rs.getString("NOMBRE"));
            tmpUsuario.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
            tmpUsuario.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
            tmpUsuario.setCorreo_electronico(rs.getString("CORREO_ELECTRONICO"));
            tmpUsuario.setCedula(rs.getString("CEDULA"));
            tmpUsuario.setGenero(rs.getString("GENERO"));
            tmpUsuario.setClave(rs.getString("CLAVE"));
            return tmpUsuario;
        }
        return null;
    }
}
