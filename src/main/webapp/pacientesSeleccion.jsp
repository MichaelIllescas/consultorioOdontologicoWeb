<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="en">
    <%@include file="components/header.jsp" %>
    <%@include file="components/bodyPrimeraParte.jsp" %>
    
     <div class="p-5" data-aos="zoom-in">
        <div class="text-center">
            <h1>Alta Paciente</h1>
        
        <p>Este es un apartado para dar de alta a los diferentes Pacientes en el sistema.</p>
        </div>
    
         <form action="altaPacienteMayor.jsp" method="POST" class=" text-center">
             
             
            <button type="submit" class="btn btn-primary  btn-user " />

                 <i class=" fas fa-solid fa-plus"></i>Mayor de Edad

            </button>

         </form>
              <hr>
           <form action="altaPacienteMenor.jsp" method="POST" class=" text-center">
             
             
            <button type="submit" class="btn btn-primary  btn-user " />

                 <i class=" fas fa-solid fa-plus"></i>Menor de Edad

            </button>

         </form>
  
          </div>      
              <hr>
              <hr>
            
    <%@include file="components/bodyFinal.jsp" %>
   
</html>