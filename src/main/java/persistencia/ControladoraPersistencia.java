package persistencia;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Odontologo;
import logica.Paciente;
import logica.Responsable;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jonii
 */
public class ControladoraPersistencia {

    public ControladoraPersistencia() {
    }
    
    
    HorarioJpaController horarioJPA = new HorarioJpaController();
    
    OdontologoJpaController odontologoJPA = new OdontologoJpaController();
    
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    
    PersonaJpaController personaJPA = new PersonaJpaController();

    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    
    TurnoJpaController turnoJPA = new TurnoJpaController();
     
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        
        usuarioJPA.create(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
               usuarioJPA.destroy(id);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJPA.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJPA.edit(usu);
        } catch (Exception e) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void crearOdontologo(Odontologo odontologo) {
        odontologoJPA.create(odontologo);
    }

    public List<Odontologo> getOdontologos() {
        return odontologoJPA.findOdontologoEntities();
    }

    public void borrarOdontologo(int id)  {
    
         try {
                  odontologoJPA.destroy(id);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
    

    }

 
    }

    public void editarOdontologo(Odontologo odontologo) {
        try {
            odontologoJPA.edit(odontologo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo traerOdontologo(int id) {
       return odontologoJPA.findOdontologo(id);
    }
    
    //crea una instancia de un paciente en la BD el cual recibe por paramatro sin clave foranea a Responsable
    public void crearPacienteMayor(Paciente pacienteMayor) {
      pacienteJPA.create(pacienteMayor);   
    }

    //crea una instancia de un responsable en la BD el cual recibe por paramatro
    public void crearResponsable(Responsable responsable) {
        responsableJPA.create(responsable);
    }

    //crea un paciente menor de edad a raiz de una instancia de Paciente y del ID del responsable
    public void crearPacienteMenor(Paciente paciente, int idResponsable) {
        
        paciente.setResponsable(responsableJPA.findResponsable(idResponsable));
        
        pacienteJPA.create(paciente);
   
    }

    //retorna una lista de los responsables que hay en la BD
    public List<Responsable>traerResponsables() {
        
        return responsableJPA.findResponsableEntities(); 
    }

    //retorna una lista de los pacientes que hay en la BD
    public List<Paciente> getPacientes() {
        return pacienteJPA.findPacienteEntities();
           
    }

    //Elimina un paciente de la BD a raiz de un id que recibe
    public void borrarPaciente(int id) throws NonexistentEntityException {
       
        pacienteJPA.destroy(id);
      
    }

    //retorna un responsable de la BD a raiz de un id
    public Responsable traerResponsable(int id) {
        return responsableJPA.findResponsable(id);
    }

    //retorna un paciente de la BD a raiz de un id
    public Paciente treaerPaciente(int id) {
       return pacienteJPA.findPaciente(id);
    }
    
    //Elimina un Responsable de la BD a raiz de un id que recibe
    public void borrarResponsable(int id) throws NonexistentEntityException {
        responsableJPA.destroy(id);
    }

    public void crearPaciente(Paciente paciente) {
        pacienteJPA.create(paciente);
    }

    public void editarPacienteMayor(Paciente paciente) {
        try {
            pacienteJPA.edit(paciente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    


}
   

    
    
    

