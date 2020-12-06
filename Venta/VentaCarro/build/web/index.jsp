<%-- 
    Document   : index
    Created on : 16/06/2020, 07:20:02 PM
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>      
        
        <div id="formu">
             <h1>Iniciar Sesion</h1>
        <form method="post" action="Usuario" >
                        <label> Usuario: </label><br>
                        <input type="text" name="textUsuario"><br><br>
                        <label> Contraseña: </label><br>
                        <input type="password" name="textClave"><br><br>
            
            <button id="button"> Iniciar </button><br><br>
            
            <input type="hidden" value="3" name="opcion">
            
        </form>
            
        
        <div id="Error">
            
            <% if(request.getAttribute("mensajeError")!=null){ %>
            ${mensajeError}
            <% } %>
            
        </div>
            </div>
        
        </center>
        
    </body>
</html>
