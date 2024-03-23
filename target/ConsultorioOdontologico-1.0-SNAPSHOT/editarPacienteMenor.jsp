<%@page import="logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>


  <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Editar Paciente Menor de edad</h1>
        
        <p>Este es un apartado para dar de Editar a los diferentes pacientes menores de edad en el sistema.</p>
        </div>
      
      
        <%            Paciente paciente = (Paciente) request.getSession().getAttribute("pacEditar");
        %>

      
        <form class="user text-center" action="SvEditarPaciente" method="POST">
  <h1>Paciente:</h1>
  <div class="form-group col">
    <div class="col-sm-6 mx-auto mb-3">
        <input name="nombre" type="text" class="form-control form-control-user" id="nomPac" placeholder="Nombre" value="<%=paciente.getNombre()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="apellido" placeholder="Apellido" name="apellido" value="<%=paciente.getApellido()%>"  required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="dni" placeholder="DNI" name="dni" value="<%=paciente.getDni()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="fechaNac" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNac" value="<%=paciente.dateToString(paciente.getFecha_Nacimiento())%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="direccion" placeholder="Dirección" name="direccion" value="<%=paciente.getDireccion()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="telefono" placeholder="Teléfono" name="telefono" value="<%=paciente.getTelefono()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="obraSocial" placeholder="Obra Social" name="obraSocial" value="<%=paciente.isTiene_OS() %>">
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="tipoSangre" placeholder="Tipo de Sangre" name="tipoSangre" value="<%=paciente.getTipo_sangre()%>">
    </div> 
      
       <hr>
    <h1>Responsable:</h1>   
      <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="nomRes" placeholder="Nombre" name="NombreRes" value="<%=paciente.getResponsable().getNombre()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="apellidoRes" placeholder="Apellido" name="apellidoRes" value="<%=paciente.getResponsable().getApellido()%>" required>
    </div>
   

    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="fechaNacRes" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNacRes" value="<%=paciente.dateToString(paciente.getResponsable().getFecha_Nacimiento())%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="direccionRes" placeholder="Dirección" name="direccionRes" value="<%=paciente.getResponsable().getDireccion()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="telefonoRes" placeholder="Teléfono" name="telefonoRes" value="<%=paciente.getResponsable().getTelefono()%>" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="parentesco" placeholder="Parentesco" name="parentesco" value="<%=paciente.getResponsable().getParentezco()%>" required>
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





</html>
