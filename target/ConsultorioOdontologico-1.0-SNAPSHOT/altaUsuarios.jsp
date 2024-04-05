<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Alta Usuario</h1>

            <p>Este es un apartado para dar de alta a los diferentes usuarios del sistema.</p>
        </div>
        <form class="user text-center" action="SvUsuarios" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mx-auto mb-3">
                    <input name="nomusu" type="text" class="form-control form-control-user" id="nomusu" placeholder="Nombre de Usuario">
                </div>
                <div class="col-sm-6 mx-auto mb-3">
                    <input type="password" class="form-control form-control-user" id="contras" placeholder="Contraseña" name="contras">
                </div>



            </div>        
            <div class="form-group col-sm-6 mx-auto mb-3 ">
                <label for="rol">Selecciona un Rol</label>
                <select id="miListaDesplegable " name="rol" class="form-control  form-control-lg form-select rounded-5 "  style="font-size: 0.99rem; " >
                    <option value="ADMINISTADOR">Administrador</option>
                    <option value="ODONTOLOGO">Odontólogo/a</option>
                    <option value="SECRETARIO">Secretario/a</option>


                </select>
            </div>


    <button class="btn btn-primary btn-user" type="submit">
        Crear Usuario
    </button>
    </div>  

    <hr>
</form>


<hr>

</div>  

<%@include file="components/bodyFinal.jsp" %>





</html>
