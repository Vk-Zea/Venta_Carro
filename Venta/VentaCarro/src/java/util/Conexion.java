
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public String driver, bd, user, password,urlBd;
    public Connection conexion;
    
    public Conexion(){
        driver="com.mysql.jdbc.Driver";
        bd="proyecto";
        user="root";
        password="";
        urlBd="jdbc:mysql://localhost:3306/"+bd;
        
        try{
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBd,user,password);
            System.out.println("¡Conexión OK!");
            
        }catch (Exception e){
            System.out.println("Error al conectarse " + e);
            
        }
        
    }
    
    public Connection obtenerConexion (){
        return conexion;
    }
    
    public Connection cerrarConexion () throws SQLException{
        conexion.close();
        conexion = null;
        return conexion;
    }
    
    public static void main (String[] args){
        new Conexion();
    }
    
}
