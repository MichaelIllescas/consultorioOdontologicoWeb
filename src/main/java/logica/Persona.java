package logica;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jonii
 */
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_Nacimiento;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String telefono, String direccion, Date fecha_Nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }
    
    
      public static String formatearFecha(String fechaString) {
        try {
            // Crear un objeto SimpleDateFormat para el formato actual
            SimpleDateFormat formatoActual = new SimpleDateFormat("yyyy-MM-dd");
            
            // Parsear la cadena de fecha al formato actual
            Date fecha = formatoActual.parse(fechaString);
            
            // Crear un nuevo objeto SimpleDateFormat para el formato deseado
            SimpleDateFormat nuevoFormato = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println(nuevoFormato.format(fecha));
            // Formatear la fecha al nuevo formato
            return nuevoFormato.format(fecha);
       } catch (ParseException e) {
            // Manejar la excepción si la cadena de fecha no puede ser parseada
            e.printStackTrace();
            return null;
        }
    
    
}
}