<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css'>
        <script src="js/jquery-3.1.0.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/script2.js"></script>
        <%  RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("index.jsp");
            String nombre=(String)session.getAttribute("nombre");
            if(nombre==null)
            {
                out.print(nombre);
                rd.forward(request, response);
        }else{}
        %>
    </head>
    <body>
        <h1>Seleccione el tipo de consulta</h1>
        <input type="button" id="btnHorarios" name="btnHorarios" value="Horarios">
        <input type="button" id="btnTarifas" name="btnTarifas" value="Tarifas">
        <input type="button" id="btnEstado" name="btnEstado" value="Estado">
        <div id="consulta">
            <form name="fHorario" id="fHorario">
                Fecha de salida:<input type="date" name="txtHorario" id="txtHorario">
                <input type="button" id="btnChorario" name="btnChorario" value="horario">
            </form>
            <form name="fCosto" id="fCosto">
                <label>Consultar precios entre:</label>
                <input type="text" id="txtCinicial" name="txtCinicial"> y
                <input type="text" id="txtCfinal" name="txtCfinal">
                <input type="button" id="btnCosto" name="btnCosto" value="costo">
            </form>
          
        </div>
        <div id="result"></div>
    </body>
</html>
