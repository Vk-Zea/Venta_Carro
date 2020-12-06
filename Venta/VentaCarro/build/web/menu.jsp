<%-- 
    Document   : menu
    Created on : 16/06/2020, 07:41:12 PM
    Author     : Familia
--%>

<%@page import="modeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>

<%    HttpSession miSesion = (HttpSession) request.getSession();
    if (miSesion.getAttribute("usuario") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("usuario");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú</title>

        <link href="estilo.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div id="formu">
            <h1>Menú</h1>
            <h2>Bienvenido: </h2>

            <label> Registrar </label><br>
            <button onclick="location.href = 'registrarVehiculo.jsp'"> Vehiculo </button>
            <button onclick="location.href = 'registrarUsuario.jsp'"> Usuario </button><br><br>
            <label> Consultar y Actualizar </label><br>
            <button onclick="location.href = 'consultarVehiculo.jsp'"> Vehiculo </button><br><br>

            <form method="post" action="Sesiones">
                <input type="submit" value="Cerrar Sesion">
            </form>
        </div>
    </body>
</html>
