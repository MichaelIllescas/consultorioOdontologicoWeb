package logica;

import com.google.protobuf.TextFormat.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;
import servlets.SvAltaOdondologos;

/**
 *
 * @author jonii
 */
public class Controladora {

    
    ControladoraPersistencia controladoraPersisntencia= new ControladoraPersistencia();

    public Controladora() {
    }
        
    public void creaUsuario(String nombreUsusario, String contaseña,String rol){
        
        Usuario usuario =new Usuario();
    
        usuario.setNombre_usuario(nombreUsusario);
        usuario.setContrasenia(contaseña);
        usuario.setRol(rol);
        
        controladoraPersisntencia.crearUsuario(usuario);
        
    }

    public List<Usuario> getUsuarios() {
       
        return controladoraPersisntencia.getUsuarios();
        
        
    }

    public void borrarUsuario(int id) {
        controladoraPersisntencia.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
         return controladoraPersisntencia.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
       controladoraPersisntencia.editarUsuario(usu);
    }

    public boolean validarUsuario(String usuario, String clave) {
        List<Usuario> listaUsuarios= new ArrayList<>();
        listaUsuarios= controladoraPersisntencia.getUsuarios();
        
        boolean ingreso=false;
        
        for(Usuario usu: listaUsuarios){
            if (usu.getNombre_usuario().equals(usuario))
            {
                if(usu.getContrasenia().equals(clave))
                {
                     ingreso=true;
                }else 
                {
                    ingreso=false;
                }
            }
      
     
        }

         return ingreso;
    }

    public void crearOdontologo(String nombre, String apellido,  String telefono, String dni,String direccion,  String especialidad) throws java.text.ParseException {
       
        
        Odontologo odontologo= new Odontologo();
        odontologo.setNombre(nombre);
        odontologo.setApellido(apellido);
        odontologo.setDireccion(direccion);
        odontologo.setEspecialidad(especialidad);
        odontologo.setTelefono(telefono);
        odontologo.setDni(dni);
        
        
        
        controladoraPersisntencia.crearOdontologo(odontologo);
    }

     public static Date convertirStringADate(String fecha) throws ParseException, java.text.ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(fecha);
    }

    public List<Odontologo> getOdontologos() {
       return  controladoraPersisntencia.getOdontologos();
    }

    public void borrarOdontologo(int id)  {
        controladoraPersisntencia.borrarOdontologo(id);
    }

    public void editarOdontologo(Odontologo odontologo) {
        
        controladoraPersisntencia.editarOdontologo(odontologo);
    }

    public Odontologo traerOdontologo(int id) {
      return  controladoraPersisntencia.traerOdontologo(id);
    }

    public void crearPacienteMayor(String nombre, String apellido, String dni, String fechaNac, String direccion, String telefono, String obraSocial, String tipoSangre) throws ParseException, java.text.ParseException {
        
        Paciente pacienteMayor= new Paciente();
        pacienteMayor.setApellido(apellido);
        pacienteMayor.setNombre(nombre);
        pacienteMayor.setDireccion(direccion);
        pacienteMayor.setDni(dni);
        pacienteMayor.setTelefono(telefono);
        pacienteMayor.setFecha_Nacimiento(convertirStringADate(fechaNac));
        pacienteMayor.setTipo_sangre(tipoSangre);
        pacienteMayor.setTiene_OS(obraSocial);
        
        controladoraPersisntencia.crearPacienteMayor(pacienteMayor);
        
        
        
        
        
    }

    public void crearPacienteMenor(Paciente paciente ) {
        
    List<Responsable> responsables= controladoraPersisntencia.traerResponsables();         

       int idResponsable=responsables.size(); 

        controladoraPersisntencia.crearPacienteMenor(paciente, idResponsable);
    }

    public void crearResponsable(Responsable responsable) {
        controladoraPersisntencia.crearResponsable(responsable);
    }

  
   


  
}
