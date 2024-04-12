
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;
import logica.Paciente;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvRegistrarTurno", urlPatterns = {"/SvRegistrarTurno"})
public class SvRegistrarTurno extends HttpServlet {

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
        processRequest(request, response);
      
       
         HttpSession session=request.getSession();
       
        
        
        
        Odontologo odontologo= (Odontologo) session.getAttribute("odon");
        
        Paciente paciente=(Paciente)session.getAttribute("paciente");
        
        String hora= (String) request.getParameter( "horaseleccionada");
        
        
        
        String fecha =(String)request.getParameter("fecha");
               
        String motivo=(String)request.getParameter("motivo");
                
               
        controladora.crearTurno(odontologo, paciente,fecha, hora, motivo);
      
       response.sendRedirect("index.jsp");
       
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
