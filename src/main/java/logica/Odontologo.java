package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jonii
 */
@Entity
public class Odontologo extends Persona implements Serializable{

    //private int id_odontologo;
    private String especialidad;
    private String dni;
    
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> lista_turnos;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad,String dni, List<Turno> lista_turnos, Usuario usuario, Horario horario, int id, String nombre, String apellido, String telefono, String direccion, Date fecha_Nacimiento) {
        super(id, nombre, apellido, telefono, direccion, fecha_Nacimiento);
        this.especialidad = especialidad;
        this.lista_turnos = lista_turnos;
        this.usuario = usuario;
        this.horario = horario;
        this.dni= dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

   

  
    public List<Turno> getLista_turnos() {
        return lista_turnos;
    }

    public void setLista_turnos(List<Turno> lista_turnos) {
        this.lista_turnos = lista_turnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

  

   /* public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }*/

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
