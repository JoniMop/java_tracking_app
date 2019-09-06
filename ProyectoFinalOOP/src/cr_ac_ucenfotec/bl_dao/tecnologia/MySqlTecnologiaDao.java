/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.tecnologia;

import accesodatos.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
/*public class MySqlTecnologiaDao implements ITecnologiaDao {
    
    
    public void insertarTecnologia(  String codigo, String nombre
    ) throws SQLException, Exception 
    {
        System.out.println("Hola estoy aqui");
        
        String queryText;
        queryText = "insert into TTecnologia (codigo,nombre) values('"
                   + codigo + "','" + nombre + "')";
    Conector.getConector().ejecutarMySQL(queryText);

   

    }
    
    
    @Override
    public void actualizarTecnologia(  String codigo, String nombre
    ) throws SQLException, Exception 
    {
        System.out.println("Hola estoy aqui");
        
        String queryText;
        queryText = "update  dbo.[dbo.TTecnologia] set nombre='"+nombre+"' where codigo='"+codigo+"'";
        Conector.getConector().ejecutarMySQL(queryText);

   

    }

    @Override
    public ArrayList<Tecnologia> listarTecnologia() throws SQLException, Exception {
        ArrayList<Tecnologia> tecnologias = new ArrayList<>();
        ResultSet rs;
        String queryText;
        queryText = "SELECT * FROM  dbo.[dbo.TTecnologia]";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            Tecnologia tmpTecnologia = new Tecnologia(rs.getString("CODIGO"),
                    rs.getString("NOMBRE"));
                  
            tecnologias.add(tmpTecnologia);
        }
        return tecnologias;
    }

    @Override
    public Tecnologia buscarTecnologia(String pCodigo) throws SQLException, Exception {
        Tecnologia tmpTecnologia = new Tecnologia();
        ResultSet rs;
        String queryText = "SELECT * FROM  dbo.[dbo.TTecnologia] WHERE CODIGO = '"
                + pCodigo + "'";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            tmpTecnologia.setCodigo(rs.getString("CODIGO"));
            tmpTecnologia.setNombre(rs.getString("NOMBRE"));

        }
        return tmpTecnologia;
    }

    
    
}*/
