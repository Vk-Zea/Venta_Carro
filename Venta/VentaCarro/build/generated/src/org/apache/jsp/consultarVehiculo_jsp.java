package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import modeloDAO.CategoriaDAO;
import modeloVO.CategoriaVO;
import java.util.ArrayList;
import modeloDAO.VehiculoDAO;
import modeloVO.VehiculoVO;

public final class consultarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consultar Vehiculo</title>\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"formu\">\n");
      out.write("        <form method=\"post\" action=\"Vehiculo\">\n");
      out.write("            <h1>Consultar Vehiculo</h1>\n");
      out.write("                        <label> Placa: </label><br>\n");
      out.write("                        <input type=\"text\" name=\"textPlaca\"><br><br>\n");
      out.write("    \n");
      out.write("            <button> Consultar </button><br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("            \n");
      out.write("            <a href=\"menu.jsp\" >Volver</a>\n");
      out.write("            \n");
      out.write("        </form> <br><br>\n");
      out.write("            \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            ");
 if(request.getAttribute("mensajeError")!=null){ 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("        </div><br><br>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <div >\n");
      out.write("            <form>\n");
      out.write("            \n");
      out.write("                <table border=\"1px\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th> Placa </th>\n");
      out.write("                        <th> Datos </th>\n");
      out.write("                        <th> Categoria </th>\n");
      out.write("                        <th> Modelo </th>\n");
      out.write("                        <th> Marca </th>\n");
      out.write("                        <th> Estado </th>\n");
      out.write("                        <th> Precio </th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                        
                        VehiculoVO vehVO = new VehiculoVO();
                        VehiculoDAO vehDAO = new VehiculoDAO();
                        
                        ArrayList <VehiculoVO> listaVehiculos = vehDAO.listar();
                        
                        for(int i = 0; i < listaVehiculos.size(); i++){
                            
                            vehVO = listaVehiculos.get(i);   
                    
      out.write("\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(vehVO.getVehPlaca());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(vehVO.getDatId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(vehVO.getCatId());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print(vehVO.getVehModelo());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(vehVO.getVehMarca());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(vehVO.getVehEstado());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(vehVO.getVehPrecio());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                  </div>  \n");
      out.write("        </div>\n");
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
