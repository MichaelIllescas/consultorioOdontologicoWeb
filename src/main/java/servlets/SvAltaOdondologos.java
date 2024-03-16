
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;


@WebServlet(name = "SvAltaOdondologos", urlPatterns = {"/SvAltaOdondologos"})
public class SvAltaOdondologos extends HttpServlet {

    Controladora controladora=new Controladora ();
            
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              List <Odontologo> listaOdontologos=new ArrayList<>();
        listaOdontologos=controladora.getOdontologos();
        
        HttpSession miSession= request.getSession();
        miSession.setAttribute("listaOdo", listaOdontologos);
        
      
        response.sendRedirect("verOdontologos.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        String telefono= request.getParameter("telefono");
        String dni= request.getParameter("dni");
        String especialidad= request.getParameter("especialidad");
        String direccion= request.getParameter("direccion");
        
        
        try {
            controladora.crearOdontologo(nombre, apellido, telefono,dni,direccion, especialidad);
        } catch (ParseException ex) {
            Logger.getLogger(SvAltaOdondologos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
       response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
