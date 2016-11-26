<%-- 
    Document   : reservacion
    Created on : 25/11/2016, 06:19:36 PM
    Author     : MAURICIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservacion</title>
        <%  RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("index.jsp");
            String nombre=(String)session.getAttribute("usuario");
            if(nombre==null)
            {
                out.print(nombre);
                rd.forward(request, response);
        }else{}
        %>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
