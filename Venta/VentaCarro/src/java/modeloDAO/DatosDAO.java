
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.DatosVO;
import util.Conexion;

public class DatosDAO extends Conexion {
    
    private Connection conexion = null;
    private PreparedStatement puente = null;
    private ResultSet mensajero = null;
    
    private String sql;
    
    public ArrayList<DatosVO>listar(){
        ArrayList<DatosVO>listaDatos = new ArrayList<DatosVO>();
        
        try {
            conexion = this.obtenerConexion();
                sql="SELECT * FROM DATOSPERSONALES";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()){
                
                DatosVO datVO = new DatosVO (mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
                listaDatos.add(datVO);
            }
            
        }catch (Exception e){
            Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            try{
                this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return listaDatos;
    }
}
