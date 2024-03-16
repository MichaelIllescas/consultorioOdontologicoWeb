package logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author jonii
 */
@Entity
public class Responsable extends Persona {
   // private int id_responsable;
    private String parentezco;

    public Responsable() {
    }

    public Responsable(String parentezco, int id, String nombre, String apellido, String telefono, String direccion, Date fecha_Nacimiento) {
        super(id, nombre, apellido, telefono, direccion, fecha_Nacimiento);
        this.parentezco = parentezco;
    }

   

       

  
    
    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
    
    
    
}
