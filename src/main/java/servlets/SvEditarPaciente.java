
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
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Paciente;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvEditarPaciente", urlPatterns = {"/SvEditarPaciente"})
public class SvEditarPaciente extends HttpServlet {

    Controladora controladora=new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        int id = Integer.parseInt(request.getParameter("id"));
           Paciente paciente= controladora.traerPaciente(id);

           HttpSession miSession= request.getSession();
           
           miSession.setAttribute("pacEditar", paciente);
           ;  
           if(paciente.getResponsable()==null)
           {
                 response.sendRedirect("editarPacienteMayor.jsp");
           }else
           {
                response.sendRedirect("editarPacienteMenor.jsp");  
           }
            
          
           
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String dni= request.getParameter("dni");
        String telefono= request.getParameter("telefono");
        String direccion= request.getParameter("direccion");
        String fechaNac= request.getParameter("fechaNac");
        String obraSocial= request.getParameter("obraSocial");
        String tipoSangre= request.getParameter("tipoSangre");
        
        
        
        String nombreRes= request.getParameter("NombreRes");
        String apellidoRes= request.getParameter("apellidoRes");
        String fechaNacResponsable= request.getParameter("fechaNacRes");
        String direccionRes= request.getParameter("direccionRes");
        String telefonoRes= request.getParameter("telefonoRes");
        String parentesco= request.getParameter("parentesco");
        
      
      
        
        Paciente paciente = (Paciente) request.getSession().getAttribute("pacEditar");
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setDni(dni);
        paciente.setTelefono(telefono);
        paciente.setDireccion(direccion);
        paciente.setTiene_OS(obraSocial);
        paciente.setTipo_sangre(tipoSangre);
        
        
        Date fechaNacimiento=null;
        Date fechaNacRes=null;
        try {
            fechaNacimiento = convertirStringADate(fechaNac);
             fechaNacRes = convertirStringADate(fechaNacResponsable);
        } catch (ParseException ex) {
            Logger.getLogger(SVAtaPacienteMenor.class.getName()).log(Level.SEVERE, null, ex);
        }
        paciente.setFecha_Nacimiento(fechaNacimiento);
        
 
        if(paciente.getResponsable()!=null){
              paciente.getResponsable().setNombre(nombreRes);
              paciente.getResponsable().setApellido(apellidoRes);
              paciente.getResponsable().setFecha_Nacimiento(fechaNacRes);
              paciente.getResponsable().setTelefono(telefonoRes);
              paciente.getResponsable().setDireccion(direccionRes);
              paciente.getResponsable().setParentezco(parentesco);
                     
            
        }
        
        
        controladora.editarPacienteMayor(paciente);
        
        response.sendRedirect("SvAltaPAcienteMayor");
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


           public Date convertirStringADate(String fecha) throws ParseException, java.text.ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(fecha);
    }
    

    
}
