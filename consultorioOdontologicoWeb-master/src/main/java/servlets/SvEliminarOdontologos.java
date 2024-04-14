
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvEliminarOdontologos", urlPatterns = {"/SvEliminarOdontologos"})
public class SvEliminarOdontologos extends HttpServlet {

    Controladora controladora = new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        int id = Integer.parseInt(request.getParameter("id"));
        controladora.borrarOdontologo(id);
       
        response.sendRedirect("SvAltaOdondologos");
        
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
