package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consultarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Consultar Usuario</title>\n");
      out.write("        \n");
      out.write("         <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background-color: #4DD7CB;\n");
      out.write("                margin-top: 250px;\n");
      out.write("            }\n");
      out.write("            form { \n");
      out.write("                margin-left: 45%;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                margin-left: 43%;\n");
      out.write("            }\n");
      out.write("            #Mensaje {\n");
      out.write("                color: #373E94;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #button {\n");
      out.write("                margin-left: 60px;\n");
      out.write("            }\n");
      out.write("            #Tabla {\n");
      out.write("                margin-right: 13%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Consultar Usuario</h1>\n");
      out.write("        <div id=\"form\">\n");
      out.write("        <form method=\"post\" action=\"Usuario\">\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <label> Usuario </label><br>\n");
      out.write("                        <input type=\"text\" name=\"textUsuario\"><br><br>\n");
      out.write("                        <label> Contraseña </label><br>\n");
      out.write("                        <input type=\"password\" name=\"textClave\"><br><br>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table><br>\n");
      out.write("            \n");
      out.write("            <button id=\"button\"> Consultar </button><br>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" value=\"4\" name=\"opcion\">\n");
      out.write("            \n");
      out.write("        </form> <br><br>\n");
      out.write("            \n");
      out.write("        <div id=\"Mensaje\">\n");
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
      out.write("        </div>            \n");
      out.write("            \n");
      out.write("            <div id=\"Tabla\">\n");
      out.write("            <form>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
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
