

<%@page import="logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>
    
    <div class="container-fluid" data-aos="zoom-in">


        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Pacientes</h1>
        <p class="mb-4">A continuación, podrá visualziar la lista completa de Pacientes en el sistema.<p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Pacientes: </h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>DNI</th>
                                <th>Teléfono</th>
                                <th>Dirección</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Obra Social</th>
                                <th>Tipo de Sangre</th>
                                <th>Responsable</th>
                                
                                
                                <th style="width:210px">Acción</th>
                                
                             
                            </tr>
                        </thead>
                       
                        
                             <%    List<Paciente>listaPacientes= (List)request.getSession().getAttribute("listaPac");                         %>
                        
                        
                        
                            
                          
                       
     
                        <tbody>
                               <%for(Paciente pac:listaPacientes ){%>
                          
                            <tr>
                                <td><%=pac.getId()%></td>
                                <td><%=pac.getNombre()%></td>
                                <td><%=pac.getApellido()%></td>
                                <td><%=pac.getDni()%></td>
                                 <td><%=pac.getTelefono()%></td>
                                  <td><%=pac.getDireccion()%></td>
                                  <td><%=Paciente.convertirFormatoFecha(pac.dateToString(pac.getFecha_Nacimiento()))%></td>
                                 <td><%=pac.isTiene_OS()%></td>  
                                 <td><%=pac.getTipo_sangre()%></td> 
                                 <td><%if (pac.getResponsable()!= null) {%>
                                     <%=pac.getResponsable().getNombre() + " " + pac.getResponsable().getApellido()%>
                                     <%}else{%>
                                -----
                                 <%}%>
                                 </td> 
                                  
                                <td style="display:flex; width:210px;">
                                    <form name="eliminar" action="SvEliminarPaciente" method="POST">
                                        
                                        <button type="submit" class="btn btn-circle btn-danger btn-user "/>
                                        <i class="fas fa-trash-alt"></i> 
                                        </button>
                                        <input type="hidden" name="id" value="<%=pac.getId()%>"> 
                                    
                                    </form>
                                        <form name="editar" action="SvEditarPaciente" method="GET">
                                        
                                            <button type="submit" class="btn btn-primary  btn-user btn-circle " style=" margin-left: 5px;"/>
                                            <i class="fas fa-pencil-alt"></i>   
                                            </button>
                                            
                                            <input type="hidden" name="id" class="btn btn-primary  btn-user btn-block " value="<%=pac.getId()%>" />
                                            
                                     
                                    </form>
                                
                            </tr>
                            <%}%>
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container-fluid -->

    

    <%@include file="components/bodyFinal.jsp" %>

</html>