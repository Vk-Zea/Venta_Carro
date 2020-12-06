<%-- 
    Document   : consultarVehiculo
    Created on : 18/06/2020, 11:38:33 AM
    Author     : Familia
--%>

<%@page import="java.sql.*"%>
<%@page import="modeloDAO.CategoriaDAO"%>
<%@page import="modeloVO.CategoriaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.VehiculoDAO"%>
<%@page import="modeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Vehiculo</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        
        
        
        <div id="formu">
        <form method="post" action="Vehiculo">
            <h1>Consultar Vehiculo</h1>
                        <label> Placa: </label><br>
                        <input type="text" name="textPlaca"><br><br>
    
            <button> Consultar </button><br><br>
            
            <input type="hidden" value="3" name="opcion">
            
            <a href="menu.jsp" >Volver</a>
            
        </form> <br><br>
            
        <div>
            
            <% if(request.getAttribute("mensajeError")!=null){ %>
            ${mensajeError}
            <% } %>
            
        </div><br><br>
                
            
            <div >
            <form>
            
                <table border="1px">
                    <tr>
                        <th> Placa </th>
                        <th> Datos </th>
                        <th> Categoria </th>
                        <th> Modelo </th>
                        <th> Marca </th>
                        <th> Estado </th>
                        <th> Precio </th>
                    </tr>
                    
                    <%
                        
                        VehiculoVO vehVO = new VehiculoVO();
                        VehiculoDAO vehDAO = new VehiculoDAO();
                        
                        ArrayList <VehiculoVO> listaVehiculos = vehDAO.listar();
                        
                        for(int i = 0; i < listaVehiculos.size(); i++){
                            
                            vehVO = listaVehiculos.get(i);   
                    %>
                   
                    <tr>
                        <td><%=vehVO.getVehPlaca()%></td>
                        <td><%=vehVO.getDatId()%></td>
                        <td><%=vehVO.getCatId()%> </td>
                        <td><%=vehVO.getVehModelo()%></td>
                        <td><%=vehVO.getVehMarca()%></td>
                        <td><%=vehVO.getVehEstado()%></td>
                        <td><%=vehVO.getVehPrecio()%></td>
                    </tr>
                    
                    <% } %>
                </table>
                
            </form>
                  </div>  
        </div>
    </body>
</html>
