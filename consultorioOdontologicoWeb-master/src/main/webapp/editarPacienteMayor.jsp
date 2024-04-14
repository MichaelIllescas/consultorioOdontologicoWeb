<%-- 
    Document   : editarPacienteMayor
    Created on : 23 mar. 2024, 15:05:10
    Author     : jonii
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="logica.Persona"%>
<%@page import="logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5 text-center">
        <div class="text-center">
            <h1>Edición de Paciente.</h1>

            <p>Este es un apartado para editar los datos de los diferentes pacientes en el sistema.</p>
        </div>

        <%            Paciente paciente = (Paciente) request.getSession().getAttribute("pacEditar");
                       
        %>



        <form class="user text-center" action="SvEditarPacienteMayor" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mx-auto mb-3">
                    <input name="nombre" type="text" class="form-control form-control-user" id="nombre" placeholder="Nombre" value="<%=paciente.getNombre()%>" required>
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="apellido" placeholder="Apellido" name="apellido" value="<%=paciente.getApellido()%>" required>
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="dni" placeholder="DNI" name="dni" value="<%=paciente.getDni()%>" required>
                </div>

                <div class="col-sm-6 mx-auto mb-3">
                    <input type="date" class="form-control form-control-user" id="fechaNac" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNac" value="<%=paciente.dateToString(paciente.getFecha_Nacimiento())%>" required>
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="direccion" placeholder="Dirección" name="direccion" value="<%=paciente.getDireccion()%>" required>
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="telefono" placeholder="Teléfono" name="telefono" value="<%=paciente.getTelefono()%>" required>
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="obraSocial" placeholder="Obra Social" name="obraSocial" value="<%=paciente.isTiene_OS()%>">
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="text" class="form-control form-control-user" id="tipoSangre" placeholder="Tipo de Sangre" value="<%=paciente.getTipo_sangre()%>" name="tipoSangre">
                </div> 

            </div>

            <button class="btn btn-primary btn-user" type="submit">
                Actualizar Paciente
            </button>
            <hr>
        </form>
        <hr>

    </div>  

    <%@include file="components/bodyFinal.jsp" %>