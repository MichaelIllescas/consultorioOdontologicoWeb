<%-- 
    Document   : bodyPrimeraParte
    Created on : 8 mar. 2024, 03:17:05
    Author     : jonii
--%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body id="page-top" >
   

    <!-- validacion de session-->
    
     <%HttpSession miSession= request.getSession();
      String usuario = (String)miSession.getAttribute("usuario");
      Usuario user = (Usuario)miSession.getAttribute("user");
      String visiblidad = (String)miSession.getAttribute("visiblidad");
      
       if (usuario==null)
       {
            response.sendRedirect("sinLogin.jsp");
       }
    
    
    %>
    
    
    
    <!-- Page Wrapper -->
    <div id="wrapper" >

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-solid fa-tooth"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Consultorio Odontológico</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
               
                  <button id="sidebarToggleTop" class="btn btn-link  rounded-circle mr-3 nav-link">
                        <i class="fa fa-bars"></i><span>Menu</span>
                    </button>

                
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Gestión
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapse-header"
                    aria-expanded="true" aria-controls="collapse-header">
                    <i class="fas fa-solid fa-stethoscope"></i>
                    <span>Odontólogos</span>
                </a>
                <div id="collapse-header" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Acciones:</h6>
                        <a class="collapse-item" href="altaOdontologo.jsp">Alta Odontontólogo</a>
                        <a class="collapse-item" href="SvAltaOdondologos">Ver Odontontólogos</a>
                        
                    </div>
                </div>
            </li>
              <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-solid fa-hospital-user"></i>
                    <span>Pacientes</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Acciones:</h6>
                        <a class="collapse-item" href="pacientesSeleccion.jsp">Alta Paciente</a>
                        <a class="collapse-item" href="SvAltaPAcienteMayor">Ver Pacientes</a>
                        
                    </div>
                </div>
            </li>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item" style="display: <%=visiblidad%> ">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUsers"
                    aria-expanded="true" aria-controls="collapseUsers">
                   
                   <i class="fas fa-solid fa-user-plus"></i>
                    <span>Usuarios</span>
                </a>
                <div id="collapseUsers" class="collapse" aria-labelledby="collapseUsers"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Acciones: </h6>
                        <a class="collapse-item" href="SvUsuarios">Ver Usuarios</a>
                        <a class="collapse-item" href="altaUsuarios.jsp">Alta Usuario</a>

                    </div>
                </div>
            </li>
            
        
                
                
          
           
           
            <!-- Divider -->
            <hr class="sidebar-divider">
            <form action="SvCargarDatosTurno" method="GET">
            <div class="container-fluid ">

                <div class="text-center d-flex justify-content-center align-items-center">

                    <button type="submit" class="btn btn-primary">Asignar Turno</button>
                     
                </div>
            </div>
            </form>

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                  

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                     

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
                                   <%=
                                      user.getRol().toUpperCase() + " : " +
                                       usuario
                                    %></span>
                                <img class="img-profile rounded-circle"
                                    src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Perfil
                                </a>
                             
                              
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Cerrar Sesión
                                  
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Clínica Odontológica</h1>
                       
                    </div>

            </div>
