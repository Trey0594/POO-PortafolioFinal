package tl;

public abstract class Persona {

    protected int id;            // Se usará para la base de datos
    protected String nombre;
    protected String apellidos;
    protected String cedula;
    protected char sexo;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellidos, String cedula, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public Persona(String nombre, String apellidos, String cedula, char sexo) {
        this(0, nombre, apellidos, cedula, sexo);
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public abstract void mostrarInfo();
}
