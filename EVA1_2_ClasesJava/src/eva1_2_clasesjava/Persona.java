package eva1_2_clasesjava;

public class Persona {
    //Atributos de la clase

    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;

    //Metodos
    //Lectura y escritura de atributos
    //Get y set
    //metodo: modifier return value name(args){imp}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String inNombre) {
        nombre = inNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String inApellido) {
        apellido = inApellido;

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int inEdad) {
        edad = inEdad;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean inECivil){
        estadoCivil = inECivil;
    }
}
