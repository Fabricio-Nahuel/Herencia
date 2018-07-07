package herencia;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
    
    //Herencia: una clase hereda de otra sus atributos y metodos
    Estudiante estudiante1 = new Estudiante("37179001", new Date(92,10,19), "Fabricio");    
    estudiante1.setTituloSecundario(true);
    
    System.out.println(
            estudiante1.getNombre() +" es: "+ estudiante1.getClass().getSimpleName() +"\n"
            +"Nació el: "+ estudiante1.getFechaDeNac() +"\n"
            +"Tiene titulo secundario?: "+ estudiante1.isTituloSecundario()
    );
    
    }
}