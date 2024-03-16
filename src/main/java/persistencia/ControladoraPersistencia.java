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

    public void crearPacienteMayor(Paciente pacienteMayor) {
      pacienteJPA.create(pacienteMayor);
        
    }

    public void crearResponsable(Responsable responsable) {
        responsableJPA.create(responsable);
        
    }

    public void crearPacienteMenor(Paciente paciente, int idResponsable) {
        
        paciente.setResponsable(responsableJPA.findResponsable(idResponsable));
        
        pacienteJPA.create(paciente);
        
        
    }

    public List<Responsable>traerResponsables() {
        
        return responsableJPA.findResponsableEntities(); 
    }

    


}
   

    
    
    

