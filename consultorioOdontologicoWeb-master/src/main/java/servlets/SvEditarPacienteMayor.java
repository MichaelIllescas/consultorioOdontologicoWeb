
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import static logica.Controladora.convertirStringADate;
import logica.Paciente;
import logica.Persona;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvEditarPacienteMayor", urlPatterns = {"/SvEditarPacienteMayor"})
public class SvEditarPacienteMayor extends HttpServlet {

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
        processRequest(request, response);
        
         Paciente paciente = (Paciente) request.getSession().getAttribute("pacEditar");
        
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String dni= request.getParameter("dni");
        String telefono= request.getParameter("telefono");
        String direccion= request.getParameter("direccion");
        String fechaNacido= Persona.formatearFecha( request.getParameter("fechaNac"));
        String obraSocial= request.getParameter("obraSocial");
        String tipoSangre= request.getParameter("tipoSangre");
        
        Date fechaNacimiento=null;
      
        try {
            
            
            fechaNacimiento = convertirStringADate(fechaNacido);
            
           
            
        } catch (ParseException ex) {
            Logger.getLogger(SVAtaPacienteMenor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setDni(dni);
        paciente.setTelefono(telefono);
        paciente.setDireccion(direccion);
        paciente.setTiene_OS(obraSocial);
        paciente.setTipo_sangre(tipoSangre);
        paciente.setFecha_Nacimiento(fechaNacimiento);
        
        
          controladora.editarPacienteMayor(paciente);
        
        response.sendRedirect("SvAltaPAcienteMayor");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
