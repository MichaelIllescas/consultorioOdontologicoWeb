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
public class Paciente extends Persona implements Serializable {
    
    
  //  private int id_paciente;
    private String tiene_OS;
    private String tipo_sangre;  
    private String dni;
    @OneToOne
    private Responsable responsable;
    @OneToMany(mappedBy = "paciente")
    private List<Turno> listaTurnos; 
  
    
    public Paciente() {
    }

    public Paciente(String tiene_OS, String tipo_sangre, Responsable responsable, List<Turno> listaTurnos, int id, String nombre, String apellido, String telefono, String direccion, Date fecha_Nacimiento, String dni) {
        super(id,  nombre, apellido, telefono, direccion, fecha_Nacimiento);
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.responsable = responsable;
        this.listaTurnos = listaTurnos;
        this.dni=dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

  

   

   /* public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public String isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(String tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    
    
}
