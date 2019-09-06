/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.actividad;

import accesodatos.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public class MySqlActividadDao implements IActividadDao {

    public void insertarActividad(String codigo, String nombre, String descripcion
    ) throws SQLException, Exception {
        System.out.println("Hola estoy aqui");

        String queryText;
        queryText = "INSERT INTO TACTIVIDAD (CODIGO, NOMBRE, DESCRIPCION) VALUES('" 
             + codigo + "','"  + nombre + "','" + descripcion + "')";
        Conector.getConector().ejecutarSql(queryText);

    }

    @Override
    public void actualizarActividad(String codigo, String nombre, String descripcion
    ) throws SQLException, Exception {
        System.out.println("Hola estoy aqui");

        String queryText;
        queryText = "update  dbo.[dbo.TACTIVIDAD] SET NOMBRE='" + nombre + "' WHERE CODIGO='" + codigo + "'";
        Conector.getConector().ejecutarSql(queryText);

    }

    public ArrayList<Actividad> listarActividad() throws SQLException, Exception {
        ArrayList<Actividad> actividades = new ArrayList<>();
        ResultSet rs;
        String queryText;
        queryText = "SELECT * FROM  dbo.[dbo.TACTIVIDAD]";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            Actividad tmpActividad = new Actividad(rs.getString("CODIGO"),
                    rs.getString("NOMBRE"),
                    rs.getString("DESCRIPCION"));

            actividades.add(tmpActividad);
        }
        return actividades;
    }

    public Actividad buscarActividad(String pCodigo) throws SQLException, Exception {
        Actividad tmpActividad = new Actividad();
        ResultSet rs;
        String queryText = "SELECT * FROM  dbo.[dbo.TACTIVIDAD] WHERE CODIGO = '"
                + pCodigo + "'";
        rs = Conector.getConector().ejecutarQuery(queryText);
        while (rs.next()) {
            tmpActividad.setCodigo(rs.getString("CODIGO"));
            tmpActividad.setNombre(rs.getString("NOMBRE"));
            tmpActividad.setDescripcion(rs.getString("DESCRIPCION"));

        }
        return tmpActividad;

    }
}
