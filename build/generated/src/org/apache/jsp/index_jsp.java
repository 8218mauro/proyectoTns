package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelado.*;
import uml.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css'>\n");
      out.write("        <script src=\"js/jquery-3.1.0.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/miscript.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Bienvenido</h1>\n");
      out.write("        <a href=\"#\">Consulta de vuelos</a><br>\n");
      out.write("        <a href=\"#\">Reservacion de vuelos</a><br>\n");
      out.write("        <a href=\"#\">Estado de vuelos</a>\n");
      out.write("        <div>\n");
      out.write("            <form name=\"forLogin\" action=\"\" method=\"post\">\n");
      out.write("                login:<input type=\"text\" id=\"txtLogin\" name=\"txtLogin\"><br>\n");
      out.write("                Password:<input type=\"text\" id=\"txtPass\" name=\"txtPass\"><br>\n");
      out.write("                <input type=\"submit\" id=\"btnEntrar\" name=\"btnEntrar\" value=\"Entrar\"><br>\n");
      out.write("            </form>\n");
      out.write("        </div><br>\n");
      out.write("        <div>\n");
      out.write("            <form name=\"forRes\" action=\"\" method=\"post\">\n");
      out.write("                CC:<input type=\"text\" id=\"txtCc\" name=\"txtCc\">\n");
      out.write("                Nombres:<input type=\"text\" id=\"txtNombres\" name=\"txtNombres\">\n");
      out.write("                Apellidos:<input type=\"text\" id=\"txtApellidos\" name=\"txtApellidos\">\n");
      out.write("                Edad:<input type=\"text\" id=\"txtEdad\" name=\"txtEdad\">\n");
      out.write("                Correo:<input type=\"text\" id=\"txtCorreo\" name=\"txtCorreo\">\n");
      out.write("                Contrasena:<input type=\"text\" id=\"txtContrasena\" name=\"txtContrasena\">\n");
      out.write("                <input type=\"submit\" id=\"btnEnviar\" name=\"btnEnviar\" value=\"Enviar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"result\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
