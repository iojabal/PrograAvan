import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    String name;
    String lastName;
    String email;
    int ci;
    SimpleDateFormat fecha_nac;
    char genero;


    public Persona(String name, String lastName, String email, int ci, String fecha_nac, char genero) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.ci = ci;
        this.fecha_nac = new SimpleDateFormat(fecha_nac);
        this.genero = genero;
    }
}
