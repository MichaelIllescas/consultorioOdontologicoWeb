<%@page import="logica.Usuario"%>
<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>
    
    <div class="container-fluid" data-aos="zoom-in" >
      

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
        <p class="mb-4">A continuación, podrá visualziar la lista completa de usuarios del sistema.<p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Usuarios:</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre de Usuario</th>
                                <th>Rol</th>
                                <th>Acción</th>
                                
                             
                            </tr>
                        </thead>
                       
                        
                        <%    List<Usuario>listaDeUsuarios= (List)request.getSession().getAttribute("listaUsu");                         %>
                        
                        
                        <tbody>
                            <%for(Usuario usu:listaDeUsuarios){%>
                            <tr>
                                <td id="id_usu<%= usu.getId_usuario()  %>"><%= usu.getId_usuario()  %></td>
                                <td><%= usu.getNombre_usuario()  %></td>
                                <td><%= usu.getRol() %></td>
                                <td style="display:flex; ">
                                    <form name="eliminar" action="SvEliminarUsuarios" method="POST">
                                        
                                        <button type="submit" class="btn btn-danger  btn-user btn-circle " />
                                        <i class="fas fa-trash-alt"></i> 
                                        </button>
                                        <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"> 
                                    
                                    </form>
                                        <form " name="editar" action="SvEditarUsuarios" method="GET">
                                        
                                            <button type="submit" class="btn btn-primary  btn-user btn-circle " />
                                            <i class="fas fa-pencil-alt"></i>   
                                            </button>
                                            
                                            <input type="hidden"name="id" class="btn btn-primary  btn-user " value="<%=usu.getId_usuario()%>" style="margin-right: 5px;" />
        
                                    </form>
                                
                            </tr>
                            <% }%>
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->


    <%@include file="components/bodyFinal.jsp" %>

</html>