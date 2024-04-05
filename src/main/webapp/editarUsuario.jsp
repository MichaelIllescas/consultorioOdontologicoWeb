<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5 " data-aos="zoom-in">
        <div class="text-center ">
            <h1>Edición de Usuario</h1>
        
        <p>Este es un apartado para editar un usuario del sistema.</p>
       
        
        <% 
            Usuario user= (Usuario)request.getSession().getAttribute("usuEditar");
        %>
        
        
        
        <form class="user text-center" action="SvEditarUsuarios" method="POST">
            <div class="form-group col text-center">
                <div class="col-sm-6 mb-3 mx-auto" >
                    <input name="nomusu" type="text" class="form-control form-control-user"   id="nomusu" placeholder="Nombre de Usuario" value="<%=user.getNombre_usuario()%>">
                </div>
                 <div class="col-sm-6 mb-3 mx-auto">
                     <input type="password" class="form-control form-control-user" id="contras" placeholder="Contraseña" name="contras"  value="<%= user.getContrasenia()  %>">
                </div>
                 <div class="col-sm-6 mb-3 mx-auto" >
                     <input type="text" class="form-control form-control-user" id="rol" placeholder="Rol" name="rol" value="<%= user.getRol()%>">
                </div>
                
                
            
                
             <button class="btn btn-primary btn-user" type="submit">Guardar</button>
      
   
            </div>
           
            
            <hr>
        
          
        </form>

        <hr>

         </div>
    </div>  

    <%@include file="components/bodyFinal.jsp" %>





</html>
