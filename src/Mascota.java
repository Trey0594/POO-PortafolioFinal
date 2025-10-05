

public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Cliente duenio;
    private Cita cita;

    // Constructores
    public Mascota(String nombre, String especie, String raza, int edad, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.duenio = duenio;
    }

    public Mascota() { }

    //  Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Cliente getDuenio() { return duenio; }
    public void setDuenio(Cliente duenio) { this.duenio = duenio; }

    public void registrarCita(Cita cita) {
        this.cita = cita;
        System.out.println("Cita registrada para " + nombre);
    }

    //  Mostrar información
    public void mostrarInfoMascota() {
        System.out.println("Mascota: " + nombre + " (" + especie + ")");
        System.out.println("Dueño: " + duenio.getNombre() + " " + duenio.getApellidos());
        if (cita != null) {
            cita.mostrarInfoCita();
        }
        System.out.println("------------------------------------");
    }
}
