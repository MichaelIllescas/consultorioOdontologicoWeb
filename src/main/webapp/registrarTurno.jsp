



<%@page import="logica.Paciente"%>
<%@page import="logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>
<div class="container-fluid" data-aos="zoom-in">
    <div class="text-center">
        <!-- Page Heading -->
        <h1 class="h1 mb-2 text-gray-800">Registrar Turno</h1>
        <p class="mb-4">A continuación, podrá asignar turno a un paciente registrado en el sistema.</p>
    </div>
    <% List<Odontologo> listaOdontologos = (List) request.getSession().getAttribute("listaOdo");
        List<Paciente> listaPacientes = (List) request.getSession().getAttribute("listaPac");
    %>
    <form action="SvRegistrarTurno" method="POST" class="mt-4">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="form-group">
                    <label for="miListaDesplegable">Selecciona un Odontólogo:</label>
                    <select id="miListaDesplegable"  class="form-control form-control-lg" name="odontologo">
                        <%for (Odontologo odo : listaOdontologos) {%>
                        <option  value="<%=odo.getId()%>"><%=odo.getNombre() + " " + odo.getApellido()%></option>
                        <%}%>
                    </select>


                </div>

                <div class="form-group">
                   
                    <label for="listaPacientes">Selecciona un Paciente:</label>
                    <input name="paciente" id="listaPacientes" type="search" class="form-control form-control-lg" list="listaBuscadora">
                    <datalist id="listaBuscadora">
                         <% for (Paciente pac : listaPacientes) {%>
                        <!-- Mostrar el nombre, apellido y DNI del paciente como opción en el datalist -->
                        <option  value="<%=pac.getId() + "     "+ pac.getNombre() + " " + pac.getApellido() + ", DNI: " + pac.getDni()%>">  
                       
                         
                          </option>           
                          
                        <% }%>
                    </datalist>
                </div>
                <div class="form-group">
                    <label for="fecha">Seleccione una fecha:</label>
                    <input type="date" class="form-control form-control-user" id="fecha" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fecha" required>
                </div>


                <div class="form-group">
                    <label for="hora">Seleccione una hora:</label>
                    <select class="form-select form-control-lg" id="hora" name="horaseleccionada">
                        <option  value="08:00">08:00 AM</option>
                        <option  value="08:30">08:30 AM</option>
                        <option  value="09:00">09:00 AM</option>
                        <option  value="09:30">09:30 AM</option>
                        <option  value="10:00">10:00 AM</option>
                        <option  value="10:30">10:30 AM</option>
                        <option  value="11:00">11:00 AM</option>
                        <option  value="11:30">11:30 AM</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="motivo">Motivo:</label>
                    <input type="text" class="form-control  form-control-user " id="motivo" name="motivo">

                    </input>
                </div>



                <div class="text-center">
                    <button type="submit" class="btn btn-primary mt-5">Reservar Turno</button>
                </div>
            </div>
        </div>
    </form>
</div>





<!-- /.container-fluid -->

<script src="/bootstrap-datepicker-1.9.0-dist/js/bootstrap-datepicker.js"></script>
<script src="/bootstrap-datepicker-1.9.0-dist/js/bootstrap-datepicker.min.js"></script>



<%@include file="components/bodyFinal.jsp" %>

