<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5">
        <div class="text-center">
            <h1>Edición de Usuario</h1>
        
        <p>Este es un apartado para editar un usuario del sistema.</p>
       
        
        <% 
            Usuario user= (Usuario)request.getSession().getAttribute("usuEditar");
        %>
        
        
        
        <form class="user" action="SvEditarUsuarios" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mb-3" >
                    <input name="nomusu" type="text" class="form-control form-control-user"   id="nomusu" placeholder="Nombre de Usuario" value="<%=user.getNombre_usuario()%>">
                </div>
                 <div class="col-sm-6 mb-3">
                     <input type="password" class="form-control form-control-user" id="contras" placeholder="Contraseña" name="contras"  value="<%= user.getContrasenia()  %>">
                </div>
                 <div class="col-sm-6 mb-3" >
                     <input type="text" class="form-control form-control-user" id="rol" placeholder="Rol" name="rol" value="<%= user.getRol()%>">
                </div>
                
                <!--aca van los a ir todo lo que respecta a horarios y usuarios 
                -->
                
                
            </div>
          
           
            <button class="btn btn-primary btn-user btn-block" type="submit">Guardar</button>
            <hr>
        
          
        </form>

        <hr>

         </div>
    </div>  

    <%@include file="components/bodyFinal.jsp" %>





</html>
