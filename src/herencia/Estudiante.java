package herencia;
import java.sql.Date;

public class Estudiante extends Persona {
    private boolean tituloSecundario;

    public Estudiante(String dni, Date fechaDeNac, String nombre) {
        //Conexion con la clase ancestra(Persona)
        super(dni, fechaDeNac, nombre);
    }
    
    //Sobrecarga de constructor
    public Estudiante(boolean tituloSecundario, String dni, Date fechaDeNac, String nombre) {
        super(dni, fechaDeNac, nombre);
        this.tituloSecundario = tituloSecundario;
    }

    public boolean isTituloSecundario() {
        return tituloSecundario;
    }

    public void setTituloSecundario(boolean tituloSecundario) {
        this.tituloSecundario = tituloSecundario;
    }
}