/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteFisico;

import accesodatos.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public class SqlServerClienteFisicoDao implements IClienteFisicoDao{
    
    
    
    @Override
    public void insertarClienteFisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito,
            String direccion_exacta, String correo_electronico,
            int telefono) throws SQLException, Exception {
        System.out.println("Registrando...un momento por favor");

        String queryText;
        queryText = "insert into TClienteFisico (nombre, primer_apellido, segundo_apellido, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono) values('"
                + nombre + "','" + primer_apellido + "','" + segundo_apellido + "','" + provincia + "','" + canton + "','" + distrito + "','" + direccion_exacta + "','" + correo_electronico + "','" + telefono + "')";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public void actualizarClienteFisico(String nombre, String primer_apellido, String segundo_apellido, String provincia, String canton, String distrito,
            String direccion_exacta, String correo_electronico,
            int telefono) throws SQLException, Exception {
        System.out.println("Actualizando...");

        String queryText;
        queryText = "UPDATE TCLIENTEFISICO SET NOMBRE = '"+nombre+"' ,  PRIMER_APELLIDO = '"+primer_apellido+ "' , SEGUNDO_APELLIDO ='"+segundo_apellido+"' , PROVINCIA='"+provincia+"' , CANTON='"+canton+ "', DISTRITO='"+distrito+ "', DIRECCION_EXACTA='"+direccion_exacta+ 
                                "', CORREO_ELECTRONICO='"+correo_electronico+ "', TELEFONO='"+telefono+    "' WHERE CORREO_ELECTRONICO='"+correo_electronico+"'";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public ArrayList<ClienteFisico> listarClienteFisico() throws SQLException, Exception {
        ArrayList<ClienteFisico> clientesFisicos = new ArrayList<>();
        ResultSet rs = null;
        String queryText = null;
        queryText = "SELECT * FROM  TCLIENTEFISICO";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            ClienteFisico tmpClienteFisico = new ClienteFisico(
                    //rs.getString("NOMBRE"),
                    rs.getString("PRIMER_APELLIDO"),
                    rs.getString("SEGUNDO_APELLIDO"));
                    //rs.getString("PROVINCIA"),
                    //rs.getString("CANTON"),
                    //rs.getString("DISTRITO"),
                    //rs.getString("DIRECCION_EXACTA"),
                    //rs.getString("CORREO_ELECTRONICO"),
                    //rs.getInt("TELEFONO"));

            clientesFisicos.add(tmpClienteFisico);
        }
        return clientesFisicos;
    }

 
    @Override
    public ClienteFisico buscarClienteFisico(String correo_electronico) throws SQLException, Exception {
        ClienteFisico tmpClienteFisico = new ClienteFisico();
        ResultSet rs;
        String queryText = "SELECT nombre FROM TClienteFisico  WHERE CORREO_ELECTRONICO = '"
                + correo_electronico + "'";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            tmpClienteFisico.setCorreo_electronico(rs.getString("CORREO_ELECTRONICO"));
            tmpClienteFisico.setNombre(rs.getString("NOMBRE"));

        }
        //System.out.println(tmpTecnologia);
        return tmpClienteFisico;
    }

   
    
    


}
