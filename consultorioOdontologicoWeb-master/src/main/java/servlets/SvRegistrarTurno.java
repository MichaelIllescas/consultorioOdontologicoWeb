
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
import logica.Utilitaria;

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
        response.sendRedirect("registrarTurno.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
      
       
         HttpSession session=request.getSession();
       
        
        String odonId=(String)request.getParameter("odontologo");
        
        
        Odontologo odontologo= (Odontologo) controladora.traerOdontologo(Integer.parseInt(odonId));
        
        
          String pacienteId = request.getParameter("paciente").substring(0,6).trim();
   
   

        Paciente paciente=(Paciente)controladora.traerPaciente(Integer.parseInt(pacienteId));
        
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
