package herencia;
import java.sql.Date;

public class Persona {
    private String dni;
    private Date fechaDeNac;
    private String nombre;

    public Persona(String dni, Date fechaDeNac, String nombre) {
        this.dni = dni;
        this.fechaDeNac = fechaDeNac;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeNac() {
        return fechaDeNac;
    }

    public void setFechaDeNac(Date fechaDeNac) {
        this.fechaDeNac = fechaDeNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}