<%-- 
    Document   : registrarUsuario
    Created on : 16/06/2020, 07:17:51 PM
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
       
        <div id="formu">
             <h1>Registrar Usuario</h1>
        <form method="post" action="Usuario">

                        <label> Usuario: </label><br>
                        <input type="text" name="textUsuario"><br><br>
                        <label> Contraseña: </label><br>
                        <input type="password" name="textClave"><br><br>

            </table><br>
            
            <button id="button"> Registrar </button><br>
            
            <input type="hidden" value="1" name="opcion">
            
        </form><br><br>
        
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
