<%@page import="logica.Odontologo"%>
<%@page import="java.util.List"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>
    
    <div class="container-fluid" data-aos="zoom-in">


        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Odontólogos</h1>
        <p class="mb-4">A continuación, podrá visualziar la lista completa de Odontólogos en el sistema.<p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Odontólogos:</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive table-responsive-sm">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Teléfono</th>
                                <th>Dirección</th>
                                <th>DNI</th>
                                <th>Especialidad</th>
                                <th style="width:210px">Acción</th>
                                
                             
                            </tr>
                        </thead>
                        <tfoot>
                        
                             <%    List<Odontologo>listaOdontologos= (List)request.getSession().getAttribute("listaOdo");                         %>
                        
                        
                        
                            
                            <tr>
                                <th>id </th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Teléfono</th>
                                <th>Dirección</th>
                                <th>DNI</th>
                                <th>Especialidad</th>
                                <th style="width:210px">Acción</th>
                            </tr>
                        </tfoot>
     
                        <tbody>
                          <%for(Odontologo odo:listaOdontologos ){%>
                            <tr>
                                <td> <%=odo.getId()%></td>
                                <td><%=odo.getNombre()%> </td>
                                <td><%=odo.getApellido()%></td>
                                <td><%=odo.getTelefono()%></td>
                                 <td><%=odo.getDireccion()%></td>
                                  <td><%=odo.getDni()%></td>
                                 <td><%=odo.getEspecialidad()%></td>
                                  
                                <td style="display:flex; width:210px;">
                                    <form name="eliminar" action="SvEliminarOdontologos" method="POST">
                                        
                                        <button type="submit" class="btn btn-primary  btn-user btn-block " style="background-color: red; margin-right: 5px"/>
                                        <i class="fas fa-trash-alt"></i> Eliminar
                                        </button>
                                        <input type="hidden" name="id" value="<%=odo.getId()%>"> 
                                    
                                    </form>
                                        <form name="editar" action="SvEditarOdontologo" method="GET">
                                        
                                            <button type="submit" class="btn btn-primary  btn-user btn-block " style=" margin-left: 5px;"/>
                                            <i class="fas fa-pencil-alt"></i> Editar  
                                            </button>
                                            
                                            <input type="hidden" name="id" class="btn btn-primary  btn-user btn-block " value="<%=odo.getId()%>" />
                                            
        
                                    </form>
                                <%}%>
                            </tr>
                           
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->

    

    <%@include file="components/bodyFinal.jsp" %>

</html>