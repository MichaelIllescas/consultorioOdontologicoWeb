<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>


  <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Alta Paciente Menor de edad</h1>
        
        <p>Este es un apartado para dar de alta a los diferentes pacientes menores de edad en el sistema.</p>
        </div>
        <form class="user text-center" action="SVAtaPacienteMenor" method="POST">
  <h1>Paciente:</h1>
  <div class="form-group col">
    <div class="col-sm-6 mx-auto mb-3">
        <input name="nomPac" type="text" class="form-control form-control-user" id="nomPac" placeholder="Nombre" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="apellido" placeholder="Apellido" name="apellidoPac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="dni" placeholder="DNI" name="dniPac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="fechaNac" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNacPac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="direccion" placeholder="Dirección" name="direccionPac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="telefono" placeholder="Teléfono" name="telefonoPac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="obraSocial" placeholder="Obra Social" name="obraSocialPac">
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="tipoSangre" placeholder="Tipo de Sangre" name="tipoSangrePac">
    </div> 
      
       <hr>
    <h1>Responsable:</h1>   
      <div class="col-sm-6 mx-auto mb-3">
        <input name="nomRes" type="text" class="form-control form-control-user" id="nomRes" placeholder="Nombre" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="apellidoRes" placeholder="Apellido" name="apellidoRes" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="dniRes" placeholder="DNI" name="dniRes" required>
    </div>

    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="fechaNacRes" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNacRes" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="direccionRes" placeholder="Dirección" name="direccionRes" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="telefonoRes" placeholder="Teléfono" name="telefonoRes" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="parentesco" placeholder="Parentesco" name="parentesco" required>
    </div>
    
    
 
  </div>
  
  <button class="btn btn-primary btn-user" type="submit">
    Crear Paciente
  </button>
  <hr>
</form>


        <hr>

    </div>  
    
    <%@include file="components/bodyFinal.jsp" %>





</html>
