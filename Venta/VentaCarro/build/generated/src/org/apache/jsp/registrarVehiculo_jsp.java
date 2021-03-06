package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.UsuarioVO;
import modeloVO.DatosVO;
import modeloDAO.DatosDAO;
import modeloVO.CategoriaVO;
import modeloDAO.CategoriaDAO;

public final class registrarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "No-cache, no-store, must-revalidate");
    response.setDateHeader("Expired", 0);
    
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body></body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Vehículo</title>\n");
      out.write("        \n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form method=\"post\" action=\"Vehiculo\">\n");
      out.write("            <div id=\"formu\">\n");
      out.write("                 <h1>Registrar Vehículo</h1>\n");
      out.write(" \n");
      out.write("                        <label> Placa: </label><br>\n");
      out.write("                            <input type=\"text\" name=\"textPlaca\"><br><br>\n");
      out.write("                        <label> Datos: </label><br>\n");
      out.write("                            <select name=\"textDatos\">\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            ");

                                DatosDAO datDAO = new DatosDAO();
                                for (DatosVO datVO : datDAO.listar()){
                                   
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(datVO.getDatId());
      out.write('"');
      out.write('>');
      out.print(datVO.getDatNombre() );
      out.write("</option>\n");
      out.write("                               \n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                        </select><br><br>\n");
      out.write("                        <label> Categoria: </label><br>\n");
      out.write("                            <select name=\"textCategoria\">\n");
      out.write("                                <option value=\"\"> Selecione</option>\n");
      out.write("                                \n");
      out.write("                                ");

                                    CategoriaDAO catDAO = new CategoriaDAO();
                                    for(CategoriaVO catVO : catDAO.listar()){
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                <option value=\"");
      out.print(catVO.getCatId());
      out.write('"');
      out.write('>');
      out.print(catVO.getCatTipo());
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select><br><br>\n");
      out.write("                        <label> Modelo: </label><br>\n");
      out.write("                            <input type=\"text\" name=\"textModelo\"><br><br>\n");
      out.write("                        <label> Marca: </label><br>\n");
      out.write("                            <input type=\"text\" name=\"textMarca\"><br><br>\n");
      out.write("                        <label> Estado: </label><br>\n");
      out.write("                            <input type=\"text\" name=\"textEstado\"><br><br>\n");
      out.write("                        <label> Precio: </label><br>\n");
      out.write("                            <input type=\"text\" name=\"textPrecio\"><br><br>\n");
      out.write("            \n");
      out.write("            <button id=\"button\"> Registrar </button><br>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("            \n");
      out.write("        </form> <br><br>\n");
      out.write("        <div id=\"Mensaje\">\n");
      out.write("            \n");
      out.write("            ");
 if(request.getAttribute("mensajeError")!=null){ 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
 }else{ 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
