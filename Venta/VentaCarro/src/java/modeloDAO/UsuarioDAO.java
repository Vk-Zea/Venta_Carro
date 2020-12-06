
package modeloDAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.UsuarioVO;
import util.Conexion;
import util.Crud;

public class UsuarioDAO extends Conexion implements Crud {
   
    private Connection conexion = null;
    private PreparedStatement puente = null;
    private ResultSet mensajero = null;
    
    private String sql;
    private boolean operacion = false;
    
    private String usuId="";
    private String usuLogin="";
    private String usuPassword="";
    
    public UsuarioDAO(UsuarioVO usuVO){
        super();
        
        try{
            conexion = this.obtenerConexion();
            usuId = usuVO.getUsuId();
            usuLogin = usuVO.getUsuLogin();
            usuPassword = usuVO.getUsuPassword();
            
        } catch (Exception e){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }

    @Override
    public boolean agregarRegistro() {
        try{
            
            sql = "Insert into usuario(usulogin,usupassword) values (?,?)";
            puente = conexion.prepareStatement (sql);
            puente.setString(1, usuLogin);
            puente.setString(2, usuPassword);
            puente.executeUpdate();
            operacion = true;
            
        } catch (SQLException e) {
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e); 
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try{
            
            sql = "update usuario set usulogin=? , usupassword=? where usuid=?";
            puente = conexion.prepareStatement (sql);
            puente.setString(1, usuLogin);
            puente.setString(2, usuPassword);
            puente.setString(3, usuId);
            puente.executeUpdate();
            operacion = true;
            
        } catch (SQLException e) {
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e); 
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
        
        return operacion;
    }
    
    public boolean inicioSesion(String usuario, String clave){
        try {
            
            conexion = this.obtenerConexion();
            sql="Select * from usuario where usulogin=? and usupassword=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(2, clave);
            mensajero = puente.executeQuery();
            
            if (mensajero.next()) {
                operacion = true;
            }
            
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);  
        }finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
        
        return operacion;
    }
    
    public UsuarioVO consultarUser(String usuario, String clave){
        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql="SELECT * FROM usuario WHERE usulogin=?, usupassword=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(1, usuario);
            mensajero = puente.executeQuery();
            while (mensajero.next()){
                
                usuVO = new UsuarioVO (mensajero.getString(1), mensajero.getString(2));
            }
            
        }catch (Exception e){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            try{
                this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } return usuVO;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
