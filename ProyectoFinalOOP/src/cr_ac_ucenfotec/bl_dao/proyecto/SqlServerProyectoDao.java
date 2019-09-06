/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.proyecto;

import accesodatos.Conector;
import cr_ac_ucenfotec.bl_dao.actividad.Actividad;
import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import cr_ac_ucenfotec.bl_dao.tecnologia.Tecnologia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonatangur-ari
 */
public class SqlServerProyectoDao {

    public void insertarProyecto(String codigo, String nombre, String descripcion, String fechaI, String fechaF, ArrayList<String> lista, ArrayList<String> lista2, String clienteAsociado, String tipo
    ) throws SQLException, Exception {
        System.out.println("Hola estoy aqui");

        String queryText;

        queryText = "INSERT INTO TPROYECTO (CODIGO, NOMBRE, DESCRIPCION, FECHA_INICIO, FECHA_FIN, CLIENTE_O_USUARIO, ACADEMICO_O_COMERCIAL) VALUES('" + codigo + "','" + nombre + "','" + descripcion + "','" + fechaI + "','" + fechaF + "','" + clienteAsociado + "','" + tipo + "')";
        Conector.getConector().ejecutarSql(queryText);

        for (int i = 0; i < lista2.size(); i++) {
            queryText = "INSERT INTO dbo.[TACTIVIDAD_PROYECTO] (CODIGO, FK_ACTIVIDAD,FK_PROYECTO) VALUES("
                    + "NEXT VALUE FOR DBO.sequence_ACTXProy"+ ",'" + lista2.get(i) + "','" + codigo + "')";
                       Conector.getConector().ejecutarSql(queryText);
                       
        }

        for (int i = 0; i < lista.size(); i++) {
            queryText = "INSERT INTO dbo.[TTECNOLOGIA_PROYECTO] (CODIGO, FK_TECNOLOGIA,FK_PROYECTO)  VALUES("
                    +"NEXT VALUE FOR DBO.sequence_TecXProy2"+ ",'" + lista.get(i) + "','" + codigo + "')";
                        Conector.getConector().ejecutarSql(queryText);
        }

    }

   
    public void actualizarProyecto(String codigo, String nombre, String descripcion, String fechaI, String fechaF, ArrayList<String> lista, ArrayList<String> lista2, String clienteAsociado, String tipo
     ) throws SQLException, Exception 
     {
     System.out.println("Hola estoy aqui");
        
     String queryText;
    
     queryText = "UPDATE  dbo.[TPROYECTO] SET NOMBRE = '"+nombre+"' ,  DESCRIPCION = '"+descripcion+ "' , FECHA_FIN='"+fechaF+"' , cliente_o_usuario='"+clienteAsociado+"' , academico_o_comercial='"+tipo+ "' WHERE CODIGO='"+codigo+"'";
     Conector.getConector().ejecutarSql(queryText);
    
    /* queryText = "UPDATE  dbo.[dbo.TTECNOLOGIAXPROYECTO] SET NOMBRE='"+nombre+"' WHERE CODIGO='"+codigo+"'";
     Conector.getConector().ejecutarSql(queryText);
    
     queryText = "UPDATE  dbo.[dbo.TACTIVIDADXPROYECTO] SET NOMBRE='"+nombre+"' WHERE CODIGO='"+codigo+"'";
     Conector.getConector().ejecutarSql(queryText);*/
  
     }

      
     public ArrayList<Proyecto> listarProyectos() throws SQLException, Exception {
     ArrayList<Proyecto> proyectos = new ArrayList<>();
     ResultSet rs;
     String queryText;
     queryText = "SELECT * from TPROYECTO";
   /* SELECT CODIGO, NOMBRE, DESCRIPCION,  FECHA_FIN,CLIENTE_O_USUARIO,ACADEMICO_O_COMERCIAL, ACTIVIDAD  
     FROM  
     dbo.[dbo.TPROYECTO] , DBO.TACTIVIDAD_PROYECTO WHERE TPROYECTO.CODIGO = 
     TTECNOLOGIA_PROYECTO.FK_PROYECTO
     INNER JOIN TTECNOLOGIAXPROYECTO
     ON 
     TPROYECTO.CODIGO = TTECNOLOGIAXPROYECTO.CODIGO
     INNER JOIN TACTIVIDADXPROYECTO 
     ON 
     TPROYECTO.CODIGO = TACTIVIDADXPROYECTO.CODIGO";*/
     
     /*SELECT T.CODIGO, T.NOMBRE, T.DESCRIPCION,  T.FECHA_FIN, T.CLIENTE_O_USUARIO, T.ACADEMICO_O_COMERCIAL, TA.fk_tecnologia 
     FROM  
     TPROYECTO T , TTECNOLOGIA_PROYECTO TA WHERE T.CODIGO = 
     TA.FK_PROYECTO*/
    
     rs = Conector.getConector().ejecutarQuery(queryText);
     while (rs.next()) {
     Proyecto tmpProyecto = new Proyecto(
     rs.getString("CODIGO"),
     rs.getString("NOMBRE"),
     rs.getString("DESCRIPCION"),
     rs.getString("FECHA_INICIO"), 
     rs.getString("FECHA_FIN"),null,null,
     rs.getString("CLIENTE_O_USUARIO"),
     rs.getString("ACADEMICO_O_COMERCIAL"));
                  
     proyectos.add(tmpProyecto);
     }
     return proyectos;
     }

   
    
      public Proyecto buscarPorCodigo(String pCodigo) throws SQLException, Exception {
     Proyecto tmpTecnologia = new Proyecto();
     ResultSet rs;
     String queryText = "SELECT * FROM  TPROYECTO WHERE CODIGO = '"
     + pCodigo + "'";
     rs = Conector.getConector().ejecutarQuery(queryText);
     while (rs.next()) {
      Proyecto tmpProyecto = new Proyecto(
      rs.getString("CODIGO"),
      rs.getString("NOMBRE"),
      rs.getString("DESCRIPCION"),
     rs.getString("FECHA_INICIO"), 
     rs.getString("FECHA_FIN"),null,null,
    rs.getString("CLIENTE_O_USUARIO"),
     rs.getString("ACADEMICO_O_COMERCIAL"));
            tmpTecnologia=  tmpProyecto  ;  
     }
     return tmpTecnologia;
     }
/*
     @Override
     public ArrayList<Tecnologia> listarTecnologia() throws SQLException, Exception {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public Tecnologia buscarTecnologia(String codigo) throws SQLException, Exception {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     
     */
}
