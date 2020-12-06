/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.CategoriaVO;
import util.Conexion;


public class CategoriaDAO extends Conexion {
    
    private Connection conexion = null;
    private PreparedStatement puente = null;
    private ResultSet mensajero = null;
    
    private String sql;
    
    
    public ArrayList<CategoriaVO>listar(){
        ArrayList<CategoriaVO>listaCategoria = new ArrayList<CategoriaVO>();
        
        try {
            conexion = this.obtenerConexion();
            sql="SELECT * FROM CATEGORIA";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()){
                
                CategoriaVO catVO = new CategoriaVO(mensajero.getString(1), mensajero.getString(2));
                listaCategoria.add(catVO);
            }
            
        }catch (Exception e){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            try{
                this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return listaCategoria;
    }
    
}
