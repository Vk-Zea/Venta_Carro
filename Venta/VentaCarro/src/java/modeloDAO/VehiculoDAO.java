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
import modeloVO.VehiculoVO;
import util.Conexion;
import util.Crud;

/**
 *
 * @author Familia
 */
public class VehiculoDAO extends Conexion implements Crud {
    
    private Connection conexion = null;
    private PreparedStatement puente = null;
    private ResultSet mensajero = null;
    
    private String sql;
    private boolean operacion = false;
    
    private String vehPlaca = ""; 
    private String datId = ""; 
    private String catId = "";
    private String vehModelo = "";
    private String vehMarca = "";
    private String vehEstado = ""; 
    private String vehPrecio = "";
    
    public VehiculoDAO() {
    }
    
    
    public VehiculoDAO(VehiculoVO vehVO){
        super();
        
        try{
            conexion = this.obtenerConexion();
            vehPlaca = vehVO.getVehPlaca();
            datId = vehVO.getDatId();
            catId = vehVO.getCatId();
            vehModelo = vehVO.getVehModelo();
            vehMarca = vehVO.getVehMarca();
            vehEstado = vehVO.getVehEstado();
            vehPrecio = vehVO.getVehPrecio();
            
            
        } catch (Exception e){
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql="insert into vehiculo values(?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, vehPlaca);
            puente.setString(2, datId);
            puente.setString(3, catId);
            puente.setString(4, vehModelo);
            puente.setString(5, vehMarca);
            puente.setString(6, vehEstado);
            puente.setString(7, vehPrecio);
            puente.executeUpdate();
            operacion = true;
            
        }catch (SQLException e){
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            try{
            this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql="update vehiculo set DATID=?, CATID=?, VEHMODELO=?, VEHMARCA=?, VEHESTADO=?, VEHPRECIO=? Where VEHPLACA=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, datId);
            puente.setString(2, catId);
            puente.setString(3, vehModelo);
            puente.setString(4, vehMarca);
            puente.setString(5, vehEstado);
            puente.setString(6, vehPrecio);
            puente.setString(7, vehPlaca);
            puente.executeUpdate();
            operacion = true;
            
        }catch (SQLException e){
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            try{
            this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return operacion;
         
    }
    
    public VehiculoVO consultarPlaca(String placa){
        VehiculoVO vehVO = null;
        try {
            conexion = this.obtenerConexion();
            sql="SELECT * FROM VEHICULO WHERE VEHPLACA =? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, placa);
            mensajero = puente.executeQuery();
            while (mensajero.next()){
                
                vehVO = new VehiculoVO (placa, mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));
            }
            
        }catch (Exception e){
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            try{
                this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return vehVO;
    }
    
    public ArrayList<VehiculoVO>listar(){
        ArrayList<VehiculoVO>listaVehiculos = new ArrayList<VehiculoVO>();
        
        try {
            conexion = this.obtenerConexion();
            sql="SELECT * FROM VEHICULO";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()){
                
                VehiculoVO vehVO = new VehiculoVO (mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7));
                listaVehiculos.add(vehVO);
            }
            
        }catch (Exception e){
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally {
            try{
                this.cerrarConexion();
            }catch (SQLException e) {
                 Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE,null,e);
                }
        } 
        return listaVehiculos;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
