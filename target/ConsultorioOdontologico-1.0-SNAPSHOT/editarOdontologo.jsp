<%@page import="logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>

    <div class="p-5 text-center">
        <div class="text-center">
            <h1>Edición de Odontólogo.</h1>

            <p>Este es un apartado para editar los datos de los diferentes odontólogos del sistema.</p>
        </div>

        <%    
            Odontologo odontologo = (Odontologo) request.getSession().getAttribute("odoEditar");
        %>



        <form class="user" action="SvEditarOdontologo" method="POST">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-sm-6">
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" placeholder="Nombre" value="<%=odontologo.getNombre()%>" required>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="apellido" name="apellido" placeholder="Apellido" value="<%=odontologo.getApellido()%>" required>
                        </div>

                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="telefono" name="telefono" placeholder="Teléfono" value="<%=odontologo.getTelefono()%>" required>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="direccion" name="direccion" placeholder="Dirección" value="<%=odontologo.getDireccion()%>" required>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="dni" name="dni" placeholder="Dni" value="<%=odontologo.getDni()%>" required>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad" placeholder="Especialidad" value="<%=odontologo.getEspecialidad()%>" required>
                        </div>
                    </div>
                </div>
            </div>

            <button class="btn btn-primary btn-user" type="submit">
                Actualizar Odontólogo
            </button>
            <hr>
            <hr>
        </form>





        

    </div>  

    <%@include file="components/bodyFinal.jsp" %>





</html>
