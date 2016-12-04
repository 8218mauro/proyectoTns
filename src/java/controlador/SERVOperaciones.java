package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
            
            String tabla = "";
            String operacion = request.getParameter("operacion");
            
            
            try {
                if("filtrarPorHorario".equals(operacion)){
                    Timestamp valor = Timestamp.valueOf(request.getParameter("param")+" 00:00:00.000");
                    DAOTarifas dao = new DAOTarifas();
                    List<Tarifas> datos = new ArrayList<Tarifas>();
                    tabla +="<tr><th>Aerolinea</th><th>C. Origen</th><th>C. Destino</th><th>F. Salida</th><th>F. Llegada</th><th>Costo</th><th>C Avion</th><tr>";
                        datos=dao.filtrarPorFecha(valor);
                        for (Tarifas t : datos){
                            tabla+="<tr><td>"+t.getcAerolinea().getNombre()+"</td><td>"+t.getcOrigen()+"</td><td>"+t.getcDestino()+"</td><td>"+t.getfSalida()+"</td><td>"+t.getfLlegada()+"</td><td>"+t.getPrecio()+"</td><td>"+t.getcAvion()+"</td><td><button id='Estado' name='"+t.getcAerolinea().getNombre()+"' value='"+t.getId()+"'>Estado</button></td></tr>";
                            //tabla+="<tr><td>"+t.getcAerolinea().getNombre()+"</td><td>"+t.getcOrigen()+"</td><td>"+t.getcDestino()+"</td><td>"+t.getfSalida()+"</td><td>"+t.getfLlegada()+"</td><td>"+t.getPrecio()+"</td><td>"+t.getcAvion()+"<td><button id='Estado' name='"+t.getcAerolinea().getNombre()+"' value='"+t.getId()+"'>Estado</button></td></tr>";
                        }
                        out.print(tabla);
                }else if("filtrarPorCosto".equals(operacion)){
                    
                    String costoInicial = request.getParameter("costoInicial");
                    String costoFinal = request.getParameter("costoFinal");
                    DAOTarifas dao = new DAOTarifas();
                    List<Tarifas> datos = new ArrayList<Tarifas>();
                    tabla +="<tr><th>Aerolinea</th><th>C. Origen</th><th>C. Destino</th><th>F. Salida</th><th>F. Llegada</th><th>Costo</th></th><th>C Avion</th><tr>";
                        datos=dao.filtrarPorCosto( costoInicial, costoFinal );
                        for (Tarifas t : datos){
                            tabla+="<tr><td>"+t.getcAerolinea().getNombre()+"</td><td>"+t.getcOrigen()+"</td><td>"+t.getcDestino()+"</td><td>"+t.getfSalida()+"</td><td>"+t.getfLlegada()+"</td><td>"+t.getPrecio()+"</td><td>"+t.getcAvion()+"</td><td><button id='Estado' name='"+t.getcAerolinea().getNombre()+"' value='"+t.getId()+"'>Estado</button></td></tr>";
                        }
                        out.print(tabla);
                        
                }else if("filtrarPorEstado".equals(operacion)){
                    DAOconsulta dao = new DAOconsulta();
                    List<objCvuelo> datos = new ArrayList<objCvuelo>();
                    int codigoavion = Integer.parseInt(request.getParameter("param"));
                    tabla +="<tr><th>Nombre Aerolinea</th><th>C. Origen</th><th>C. Destino</th><th>F. Salida</th><th>F. Llegada</th><th>Costo</th><th>C. Avion</th><th>N. Pasajeros</th><th>A. Disponibles</th><tr>";
                        datos=dao.filtarInfoVuelo(codigoavion);
                        for (objCvuelo t : datos){
                            tabla+="<tr><td>"+t.getnAerolinea()+"</td><td>"+t.getcOrigen()+"</td><td>"+t.getcDestino()+"</td><td>"+t.getfSalida()+"</td><td>"+t.getFllegada()+"</td><td>"+t.getPrecio()+"</td><td>"+t.getcAvion()+"</td><td>"+t.getnPsajeros()+"</td><td>"+t.getaDisponibles()+"</td><td><button id='Reservar' name='Reservar' value='"+t.getIdtarifa()+"'>Reservar</button></td></tr>";
                        }
                        out.print(tabla);
                        
                }else if("reserva".equals(operacion)){
                    String resultado;
                    HttpSession sesion = request.getSession();
                    int idtarifa = Integer.parseInt(request.getParameter("param"));
                    int cedula = (Integer) sesion.getAttribute("usuario");
                    DAOconsulta dao = new DAOconsulta();
                    resultado = dao.crearReserva(idtarifa,cedula);
                    out.print(resultado);
                }
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
