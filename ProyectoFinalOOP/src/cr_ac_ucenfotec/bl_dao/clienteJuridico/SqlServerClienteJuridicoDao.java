/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteJuridico;


import accesodatos.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public class SqlServerClienteJuridicoDao implements IClienteJuridicoDao {

    @Override
    public void insertarClienteJuridico(String nombre, String provincia, String canton, String distrito,
            String direccion_exacta, String correo_electronico,
            int telefono, String cedula_juridica, String contacto
    ) throws SQLException, Exception {
        System.out.println("Registrando...");

        String queryText;
        queryText = "insert into TClienteJuridico (nombre, provincia, canton, distrito, direccion_exacta, correo_electronico, telefono, cedula_juridica, contacto) values('"
                + nombre + "','" + provincia + "','" + canton + "','" + distrito + "','" + direccion_exacta + "','" + correo_electronico + "','" + telefono + "','" + cedula_juridica + "','" + contacto + "')";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public void actualizarClienteJuridico(String nombre, String provincia, String canton, String distrito,
            String direccion_exacta, String correo_electronico,
            int telefono, String cedula_juridica, String contacto
    ) throws SQLException, Exception {
        System.out.println("Actualizando...");

        String queryText;
        queryText = "UPDATE  dbo.[TCLIENTEJURIDICO] SET NOMBRE = '"+nombre+"' ,  PROVINCIA = '"+provincia+ "' , CANTON='"+canton+"' , DISTRITO='"+distrito+"' , DIRECCION_EXACTA='"+direccion_exacta+ "', CORREO_ELECTRONICO='"+correo_electronico+ "', TELEFONO='"+telefono+ "', CEDULA_JURIDICA='"+cedula_juridica+ "', CONTACTO='"+contacto+    "' WHERE CEDULA_JURIDICA='"+cedula_juridica+"'";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public ArrayList<ClienteJuridico> listarClienteJuridico() throws SQLException, Exception {
        ArrayList<ClienteJuridico> clientesJuridicos = new ArrayList<>();
        ResultSet rs;
        String queryText;
        queryText = "SELECT * FROM  TClienteJuridico";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            ClienteJuridico tmpClienteJuridico = new ClienteJuridico(rs.getString("CEDULA_JURIDICA"),
                    rs.getString("CEDULA_JURIDICA"));

            clientesJuridicos.add(tmpClienteJuridico);
        }
        return clientesJuridicos;
    }

 
    @Override
    public ClienteJuridico buscarClienteJuridico(String pNombre) throws SQLException, Exception {
        ClienteJuridico tmpClienteJuridico = new ClienteJuridico();
        ResultSet rs;
        String queryText = "SELECT * FROM TClienteJuridico CJ WHERE CJ.NOMBRE = '"
                + pNombre + "'";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            tmpClienteJuridico.setCedula_juridica(rs.getString("CEDULA_JURIDICA"));
            tmpClienteJuridico.setNombre(rs.getString("NOMBRE"));

        }
        //System.out.println(tmpTecnologia);
        return tmpClienteJuridico;
    }

    
}
