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
import logica.Usuario;

/**
 *
 * @author jonii
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

     Controladora controladora = new Controladora();

    public SvUsuarios() {  
    }
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        List <Usuario> listaUsuarios=new ArrayList<>();
        listaUsuarios=controladora.getUsuarios();
        
        HttpSession miSession= request.getSession();
        miSession.setAttribute("listaUsu", listaUsuarios);
        
      
        response.sendRedirect("verUsuarios.jsp");
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String name= request.getParameter("nomusu");
        String pass= request.getParameter("contras");
        String rol= request.getParameter("rol");
        
        
        controladora.creaUsuario(name, pass, rol);
        
     
                
        
       response.sendRedirect("index.jsp");
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
