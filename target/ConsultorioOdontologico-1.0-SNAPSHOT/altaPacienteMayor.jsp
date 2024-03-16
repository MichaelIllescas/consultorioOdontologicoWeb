<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>


  <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Alta Paciente Mayor de edad</h1>
        
        <p>Este es un apartado para dar de alta a los diferentes apcientes mayores de edad en el sistema.</p>
        </div>
        <form class="user text-center" action="SvAltaPAcienteMayor" method="POST">
  <div class="form-group col">
    <div class="col-sm-6 mx-auto mb-3">
        <input name="nombre" type="text" class="form-control form-control-user" id="nombre" placeholder="Nombre" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="apellido" placeholder="Apellido" name="apellido" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
      <input type="text" class="form-control form-control-user" id="dni" placeholder="DNI" name="dni" required>
    </div>

    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="fechaNac" placeholder="Fecha de Nacimiento (DD/MM/AAAA)" name="fechaNac" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
          <input type="text" class="form-control form-control-user" id="direccion" placeholder="Dirección" name="direccion" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="telefono" placeholder="Teléfono" name="telefono" required>
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="obraSocial" placeholder="Obra Social" name="obraSocial">
    </div>
    <div class="col-sm-6 mx-auto mb-3">
        <input type="text" class="form-control form-control-user" id="tipoSangre" placeholder="Tipo de Sangre" name="tipoSangre">
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
