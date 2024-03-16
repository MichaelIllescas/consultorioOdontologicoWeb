
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

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvAltaPAcienteMayor", urlPatterns = {"/SvAltaPAcienteMayor"})
public class SvAltaPAcienteMayor extends HttpServlet {

    Controladora controladora=new Controladora();
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
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String dni= request.getParameter("dni");
        String fechaNac= request.getParameter("fechaNac");
        String direccion= request.getParameter("direccion");
        String telefono= request.getParameter("telefono");
        String obraSocial= request.getParameter("obraSocial");
        String tipoSangre= request.getParameter("tipoSangre");
        
        try {
            controladora.crearPacienteMayor(nombre, apellido, dni, fechaNac, direccion, telefono,obraSocial,tipoSangre);
        } catch (Exception e) {
              Logger.getLogger(SvAltaOdondologos.class.getName()).log(Level.SEVERE, null, e);
        }
      
       response.sendRedirect("index.jsp");

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
