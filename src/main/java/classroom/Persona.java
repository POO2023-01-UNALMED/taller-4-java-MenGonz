package classroom;

public class Persona {

    long cedula = 3;
    String nombre;
    static int totalPersonas;
    
    static { totalPersonas = 0; }

    // Sobrecarga de métodos persona()
    public Persona(){ this(0); }
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1;
        totalPersonas++;
    }
}
