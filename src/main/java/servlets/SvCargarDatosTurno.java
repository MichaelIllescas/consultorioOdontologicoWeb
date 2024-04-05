
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
@WebServlet(name = "SvCargarDatosTurno", urlPatterns = {"/SvCargarDatosTurno"})
public class SvCargarDatosTurno extends HttpServlet {

    Controladora controladora =new Controladora();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
           List <Odontologo> listaOdontologos=new ArrayList<>();
        
           listaOdontologos=controladora.getOdontologos();
        
        
           HttpSession miSession= request.getSession();
       
           miSession.setAttribute("listaOdo", listaOdontologos);
        
        
            List <Paciente> listaPacientes=new ArrayList<>();
        
           listaPacientes=controladora.getPacientes();
              
           miSession.setAttribute("listaPac", listaPacientes);
           
     
       
             response.sendRedirect("registrarTurno.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
