<%-- 
    Document   : registrarVehiculo
    Created on : 18/06/2020, 11:22:12 AM
    Author     : Familia
--%>

<%@page import="modeloVO.UsuarioVO"%>
<%@page import="modeloVO.DatosVO"%>
<%@page import="modeloDAO.DatosDAO"%>
<%@page import="modeloVO.CategoriaVO"%>
<%@page import="modeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Vehículo</title>
        
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
       
        <form method="post" action="Vehiculo">
            <div id="formu">
                 <h1>Registrar Vehículo</h1>
 
                        <label> Placa: </label><br>
                            <input type="text" name="textPlaca"><br><br>
                        <label> Datos: </label><br>
                            <select name="textDatos">
                            <option value="">Selecione</option>
                            <%
                                DatosDAO datDAO = new DatosDAO();
                                for (DatosVO datVO : datDAO.listar()){
                                   
                                %>
                                <option value="<%=datVO.getDatId()%>"><%=datVO.getDatNombre() %></option>
                               
                                <% } %>
                        </select><br><br>
                        <label> Categoria: </label><br>
                            <select name="textCategoria">
                                <option value=""> Selecione</option>
                                
                                <%
                                    CategoriaDAO catDAO = new CategoriaDAO();
                                    for(CategoriaVO catVO : catDAO.listar()){
                                %>
                                
                                <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                                <%}%>
                            </select><br><br>
                        <label> Modelo: </label><br>
                            <input type="text" name="textModelo"><br><br>
                        <label> Marca: </label><br>
                            <input type="text" name="textMarca"><br><br>
                        <label> Estado: </label><br>
                            <input type="text" name="textEstado"><br><br>
                        <label> Precio: </label><br>
                            <input type="text" name="textPrecio"><br><br>
            
            <button id="button"> Registrar </button><br>
            
            <input type="hidden" value="1" name="opcion">
            
        </form> <br><br>
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
