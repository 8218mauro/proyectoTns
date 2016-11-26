package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uml.*;
import modelado.*;
/**
 *
 * @author MAURICIO
 */
public class SERVOperaciones extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            DAOTarifas dao = new DAOTarifas();
            List<Tarifas> datos = new ArrayList<Tarifas>();
            String tabla = "";
            Timestamp valor = Timestamp.valueOf(request.getParameter("param")+" 00:00:00.000");
            
            try {
                //if(valor=="horario"){
                    tabla +="<tr><th>C. Aerolinea</th><th>C. Origen</th><th>C. Destino</th><th>F. Salida</th><th>F. Llegada</th><th>Costo</th><tr>";
                        datos=dao.filtrar2(valor);
                        for (Tarifas t : datos){
                            tabla+="<tr><td>"+t.getcAerolinea()+"</td><td>"+t.getcOrigen()+"</td><td>"+t.getcDestino()+"</td><td>"+t.getfSalida()+"</td><td>"+t.getfLlegada()+"</td><td>"+t.getPrecio()+"</td></tr>";
                        }
                        out.print(tabla);
               // }
            } catch (Exception e) {
            }   
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
