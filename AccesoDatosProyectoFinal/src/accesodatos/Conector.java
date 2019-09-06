/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author jonatangur-ari
 */
public class Conector {

    private static AccesoBD conectorBD = null;
    
    public static AccesoBD getConector() throws SQLException, Exception {
        
        FileReader fr = null;
        BufferedReader br = null;
        
        String filename = "../AccesoDatosProyectoFinal/accesodatos.txt";
        String driver = "";
        String strConnection = "";
        
        if(conectorBD == null){
            try{
                fr = new FileReader(filename);  
                br = new BufferedReader(fr);
                String data;
                
                while((data = br.readLine()) != null) 
                {
                    String [] arrayForLogin = data.split(",");
                    driver = arrayForLogin[0];
                    strConnection = arrayForLogin[1];
                }
                fr.close();
                
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
        conectorBD = new AccesoBD(driver, strConnection);
            

    /*public static AccesoBD getConector() throws SQLException, Exception {
        if (conectorBD == null) {
            conectorBD = new AccesoBD("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                    "jdbc:sqlserver://DESKTOP-INJ1MQP;"
                    + "DatabaseName=bitacora;user=joni;password=1607");

            // si se usa mysql server
           // conectorBD = new AccesoBD("com.mysql.cj.jdbc.Driver",
             //       "jdbc:mysql://localhost:3306/laboratorio?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "root");

        }*/
            }
        
    
            
        
        return conectorBD;
    }
}