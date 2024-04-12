package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Responsable;
import logica.Turno;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-04-12T01:27:31")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, String> tiene_OS;
    public static volatile SingularAttribute<Paciente, Responsable> responsable;
    public static volatile SingularAttribute<Paciente, String> tipo_sangre;
    public static volatile SingularAttribute<Paciente, String> dni;
    public static volatile ListAttribute<Paciente, Turno> listaTurnos;

}