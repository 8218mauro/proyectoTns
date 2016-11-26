<%@page import="modelado.*" %>
<%@page import="uml.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css'>
        <script src="js/jquery-3.1.0.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/miscript.js"></script>
    </head>
    <body>
        <h1>Bienvenido ${sessionScope.usuario}</h1>
        <% if(session.getAttribute("usuario")!=null){
            %>
            <a href="consulta.jsp">Consulta de vuelos</a><br>
            <a href="reservacion.jsp">Reservacion de vuelos</a><br>
            <a href="estado.jsp">Estado de vuelos</a>
            <%
           }else{
            %>
            <a href="#">Consulta de vuelos</a><br>
            <a href="#">Reservacion de vuelos</a><br>
            <a href="#">Estado de vuelos</a>
            <%
           }
        %>
        <div id="info">
            
        </div>
        
        <div>
            <form name="forLogin" action="" method="post">
                login:<input type="email" id="txtLogin" name="txtLogin"><br>
                Password:<input type="text" id="txtPass" name="txtPass"><br>
                <input type="submit" id="btnEntrar" name="btnEntrar" value="Entrar"><br>
                <input type="submit" id="btnSalir" name="btnSalir" value="Salir"><br>
            </form>
        </div><br>
        <div>
            <form name="forRes" action="" method="post">
                CC:<input type="text" id="txtCc" name="txtCc">
                Nombres:<input type="text" id="txtNombres" name="txtNombres">
                Apellidos:<input type="text" id="txtApellidos" name="txtApellidos">
                Edad:<input type="text" id="txtEdad" name="txtEdad">
                Correo:<input type="email" id="txtCorreo" name="txtCorreo">
                Contrasena:<input type="text" id="txtContrasena" name="txtContrasena">
                <input type="submit" id="btnEnviar" name="btnEnviar" value="Enviar">
            </form>
        </div>
        <div id="result"></div>
    </body>
</html>
