
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Paciente;
import logica.Persona;
import logica.Responsable;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SVAtaPacienteMenor", urlPatterns = {"/SVAtaPacienteMenor"})
public class SVAtaPacienteMenor extends HttpServlet {

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
        Responsable responsable= new Responsable();
        
        String nombreRes= request.getParameter("nomRes");
        String apellidoRes= request.getParameter("apellidoRes");
        String dniRes= request.getParameter("dniRes");
        String direccionRes= request.getParameter("direccionRes");
        String telefonoRes= request.getParameter("telefonoRes");
        String parentesco= request.getParameter("parentesco");
        
        
        Date fechaNacRes=null;
        try {
            fechaNacRes = convertirStringADate(Persona.formatearFecha(request.getParameter("fechaNacRes")));
        } catch (ParseException ex) {
            Logger.getLogger(SVAtaPacienteMenor.class.getName()).log(Level.SEVERE, null, ex);
        }
        responsable.setApellido(apellidoRes);
        responsable.setNombre(nombreRes);
        responsable.setParentezco(parentesco);
        responsable.setDireccion(direccionRes);
        responsable.setFecha_Nacimiento(fechaNacRes);
        responsable.setTelefono(telefonoRes);

        
        Paciente paciente = new Paciente();
        
        String nombrePac= request.getParameter("nomPac");
        String apellidoPac= request.getParameter("apellidoPac");
        String dniPac= request.getParameter("dniPac");
        String fechaNacPac= Persona.formatearFecha( request.getParameter("fechaNacPac"));
        String direccionPac= request.getParameter("direccionPac");
        String telefonoPac= request.getParameter("telefonoPac");
        String obraSocialPac= request.getParameter("obraSocialPac");
        String tipoSangrePac= request.getParameter("tipoSangrePac");
        
        paciente.setNombre(nombrePac);
        paciente.setApellido(apellidoPac);
        paciente.setDireccion(direccionPac);
        paciente.setDni(dniPac);
        paciente.setFecha_Nacimiento(fechaNacRes);
        paciente.setTelefono(telefonoPac);
        paciente.setTiene_OS(dniRes);
        paciente.setTipo_sangre(tipoSangrePac);
        paciente.setResponsable(responsable);
        
        
        controladora.crearPacienteMayor(paciente);
        
        response.sendRedirect("index.jsp");
   
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    
    
       public static Date convertirStringADate(String fecha) throws ParseException, java.text.ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(fecha);
    }
    

}
