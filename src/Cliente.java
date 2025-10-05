
public class Cliente {

    // Atributos
    private String nombre;
    private String apellidos;
    private String cedula;
    private char sexo;
    private String ubicacion;

    // Constructores
    public Cliente(String nombre, String apellidos, String cedula, char sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    public Cliente(String nombre, String apellidos, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ubicacion = ubicacion;
    }

    public Cliente() { } // vacío

    //  Métodos Get y Set  =====
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    // Metodo
    public void mostrarInfoCliente() {
        System.out.println("Cliente: " + nombre + " " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("------------------------------------");
    }
}
