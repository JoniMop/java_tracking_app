/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;



import java.sql.*;

/**
 *
 * @author jonatangur-ari
 */
public class AccesoBD {

    private Connection conn;
    private Statement stmt;

    public AccesoBD(String driver, String strConexion) throws SQLException, Exception {
//se registra el driver del motor de la base de datos.
        Class.forName(driver);
//inicializa la conexión, pasando el string de conexión al método getConnection del DriverManager. conn = DriverManager.getConnection(strConexion);
        conn = DriverManager.getConnection(strConexion);
//se inicializa el statement con la instancia de statement que retorna el método createStatement
        //de la clase conexión.
        stmt = conn.createStatement();
    }

    public AccesoBD(String driver, String url, String user, String pswd) throws SQLException, Exception {
// se registra el driver del motor de la base de datos.
        Class.forName(driver);
//inicializa la conexión, pasando el string de conexión al método getConnection del DirverManager conn =DriverManager.getConnection(url,user,pswd);
        conn = DriverManager.getConnection(url, user, pswd);
//iniciliaza el statement con la instancia de statement que retorna el método createStatement
        //de la calse conexión.
        stmt = conn.createStatement();
    }
//realiza las consultas de base de datos INSERT, UPDATE Y DELETE

    public void ejecutarSql(String query) throws SQLException {
        stmt.execute(query);
    }
    
   // public void ejecutarMySQL(String query) throws SQLException {
     //   stmt.execute(query);
   // }
//realiza las consultas de base de datos SELECT

    public ResultSet ejecutarQuery(String query) throws SQLException {
        return stmt.executeQuery(query);
    }


}
