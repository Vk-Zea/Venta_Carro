<%-- 
    Document   : actualizarVehiculo
    Created on : 18/06/2020, 11:22:40 AM
    Author     : Familia
--%>


<%@page import="modeloVO.CategoriaVO"%>
<%@page import="modeloDAO.CategoriaDAO"%>
<%@page import="modeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Actualizar Vehiculo </title>
        
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div id="formu">
        <h1> Actualizar Vehiculo </h1>
        
        <%
            VehiculoVO vehVO = (VehiculoVO)request.getAttribute("vehiculo");
            if (vehVO != null){
        %>
        
        <form method="post" action="Vehiculo">
            
            <table>
                <tr>
                    <th>
                        <label> Placa: </label><br>
                        <input type="text" name="textPlaca" value="<%=vehVO.getVehPlaca()%>"><br><br>
                        <label> Datos: </label><br>
                        <input type="text" name="textDatos" value="<%=vehVO.getDatId()%>"><br><br>
                        <label> Categoria: </label><br>
                        
                        <select name="textCategoria">
                            <option value="<%=vehVO.getCatId()%>">Selecione...</option>
                            <%
                                CategoriaDAO catDAO = new CategoriaDAO();
                                for (CategoriaVO catVO : catDAO.listar()){
                                   
                                %>
                                <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo() %></option>
                                
                                <% } %>
                        </select><br><br>
                        <label> Modelo: </label><br>
                        <input type="text" name="textModelo" value="<%=vehVO.getVehModelo()%>"><br><br>
                        <label> Marca: </label><br>
                        <input type="text" name="textMarca" value="<%=vehVO.getVehMarca()%>"><br><br>
                        <label> Estado: </label><br>
                        <input type="text" name="textEstado" value="<%=vehVO.getVehEstado()%>"><br><br>
                        <label> Precio: </label><br>
                        <input type="text" name="textPrecio" value="<%=vehVO.getVehPrecio()%>"><br><br>
                    </th>
                </tr>
            </table><br>
            
            <button id="button"> Actualizar </button><br>
            
            <input type="hidden" value="2" name="opcion">
            
        </form> <br><br>
     
                    
        <%}else{ %>
        <% } %>
        
        
        <a href="consultarVehiculo.jsp" >Volver</a>
        
            
        <div id="Mensaje">
            
            <% if(request.getAttribute("mensajeError")!=null){ %>
            ${mensajeError}
             <% }else{ %>
            ${mensajeExito}
            <% } %>
        </div>
        </div>
    
    </body>
</html>
