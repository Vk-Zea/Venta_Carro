
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modeloDAO.UsuarioDAO;
import modeloVO.UsuarioVO;


@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String usuId = request.getParameter("textId");
        String usuLogin = request.getParameter("textUsuario");
        String usuPassword = request.getParameter("textClave");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        UsuarioVO usuVO = new UsuarioVO (usuId, usuLogin, usuPassword);
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        
        switch (opcion){
            
            case 1: //Agregar Registro
                if (usuDAO.agregarRegistro()){
                request.setAttribute("mensajeExito", "¡El usuario se registro correctamente!");
            }else{
                request.setAttribute("mensajeError", "¡El usuario NO se registro correctamente!");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
            break;
            
            
            case 2: // Actualizar Registro
                if (usuDAO.actualizarRegistro()){
                request.setAttribute("mensajeExito", "¡El usuario se actualizo correctamente!");
            }else{
                request.setAttribute("mensajeError", "¡El usuario NO se pudo actualizar!");
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
            break;
            
            
            case 3: //Iniciar Sesion
                if(usuDAO.inicioSesion(usuLogin, usuPassword)){
                    HttpSession miSesion = request.getSession(true);
                    usuVO = new UsuarioVO(usuLogin);
                    miSesion.setAttribute ("usuario", usuVO);
                    
                    request.getRequestDispatcher("menu.jsp").forward(request, response);
            }else{
                    request.setAttribute("mensajeError", "¡El usuario y/o contraseña son incorrectas!");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                break;
               
            case 4:
                usuVO = usuDAO.consultarUser(usuLogin, usuPassword);
                if (usuVO != null){
                    request.setAttribute("usuario", usuVO);
                    request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                }else{
                    request.setAttribute("mensajeError", "¡El usuario NO existe!");
                    request.getRequestDispatcher("consultarUsuario.jsp").forward(request, response);
                }
            break;
                
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
