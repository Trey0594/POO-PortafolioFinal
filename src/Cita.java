
public class Cita {

    // Atributos
    private String fecha;
    private String motivo;
    private String veterinario;

    //  Constructores
    public Cita(String fecha, String motivo, String veterinario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.veterinario = veterinario;
    }

    public Cita() { }

    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getVeterinario() { return veterinario; }
    public void setVeterinario(String veterinario) { this.veterinario = veterinario; }

    //  información
    public void mostrarInfoCita() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Motivo: " + motivo);
        System.out.println("Veterinario: " + veterinario);
    }
}
