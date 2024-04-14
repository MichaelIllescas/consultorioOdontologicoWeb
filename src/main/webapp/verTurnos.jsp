<%-- 
    Document   : verTurnos
    Created on : 12 abr. 2024, 01:04:39
    Author     : jonii
--%>

<%@page import="logica.Utilitaria"%>
<%@page import="logica.Turno"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Turnos Registrados:</h1>
        </div>
    </div>    
 <div class="container-fluid" data-aos="zoom-in">
    <!-- Page Heading -->
    
    <p class="mb-4">A continuación, podrá visualizar la lista completa de turnos registrados en el sistema.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Turnos Registrados:</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive table-responsive-sm">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                       
              
                     <tr>     
                            
                            <th>Nombre del Paciente</th>
                            <th>Fecha del Turno</th>
                            <th>Hora del Turno</th>
                            <th>Odontólogo</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>   
                        <%    List<Turno>listaTurnos= (List)request.getSession().getAttribute("turnos");                  
                        %>
                        <%for(Turno tur: listaTurnos){%>
                        <tr>
                           
                            <td><%=tur.getPaciente().getNombre()+ " " + tur.getPaciente().getApellido()%></td>
                            <td><%=   Utilitaria.dateToString(tur.getFecha_turno())%></td>
                            <td><%=tur.getHora_turno() %></td>
                            <td><%=tur.getOdontologo().getNombre()+ " " + tur.getOdontologo().getApellido()%></td>
                            <td>
                                <a href="#" class="btn btn-primary btn-circle btn-sm">
                                    <i class="fas fa-eye"></i>
                                </a>
                                <a href="#" class="btn btn-warning btn-circle btn-sm">
                                    <i class="fas fa-edit"></i>
                                </a>
                                <a href="#" class="btn btn-danger btn-circle btn-sm">
                                    <i class="fas fa-trash"></i>
                                </a>
                            </td>
                        </tr>
                        
                        <%}%>   
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

 <%@include file="components/bodyFinal.jsp" %>

</html>
