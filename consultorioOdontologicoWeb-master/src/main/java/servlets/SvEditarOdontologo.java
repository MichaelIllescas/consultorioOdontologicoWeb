package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvEditarOdontologo", urlPatterns = {"/SvEditarOdontologo"})
public class SvEditarOdontologo extends HttpServlet {

    Controladora controladora=new Controladora();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        int id = Integer.parseInt(request.getParameter("id"));
           Odontologo usu= controladora.traerOdontologo(id);
           
           HttpSession miSession= request.getSession();
           
           miSession.setAttribute("odoEditar", usu);
        
   
            
          
           response.sendRedirect("editarOdontologo.jsp");  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String telefono= request.getParameter("telefono");
        String direccion= request.getParameter("direccion");
        String dni= request.getParameter("dni");
        String esepcialidad= request.getParameter("especialidad");
        
  
        
        Odontologo odontologo = (Odontologo) request.getSession().getAttribute("odoEditar");
        odontologo.setNombre(nombre);
        odontologo.setApellido(apellido);
        odontologo.setTelefono(telefono);
        odontologo.setDireccion(direccion);
        odontologo.setDni(dni);
        odontologo.setEspecialidad(esepcialidad);
        
        controladora.editarOdontologo(odontologo);
        
        response.sendRedirect("SvAltaOdondologos");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
