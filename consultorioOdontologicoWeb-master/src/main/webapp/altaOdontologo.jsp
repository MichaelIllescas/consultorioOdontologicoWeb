<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Alta Odontólogo</h1>
        

            <form class="user" action="SvAltaOdondologos" method="POST">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-sm-6">
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" placeholder="Nombre" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido" placeholder="Apellido" required>
        </div>
       
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono"placeholder="Teléfono" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="direccion" name="direccion" placeholder="Dirección" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" placeholder="Dni">
        </div>
        <div class="form-group">
            <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad" placeholder="Especialidad" required>
        </div>
      </div>
    </div>
  </div>
  
  <button class="btn btn-primary btn-user" type="submit">
    Crear Odontólogo
  </button>
  <hr>
  
</form>

       </div>
        <hr>

    </div>  

    <%@include file="components/bodyFinal.jsp" %>





</html>
