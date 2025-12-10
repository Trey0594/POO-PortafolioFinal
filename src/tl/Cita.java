package tl;

import java.time.LocalDate;

public class Cita {

    private int id;
    private LocalDate fecha;
    private String motivo;
    private int idMascota;
    private int idVeterinario;

    public Cita() {
    }

    public Cita(int id, LocalDate fecha, String motivo, int idMascota, int idVeterinario) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
        this.idMascota = idMascota;
        this.idVeterinario = idVeterinario;
    }

    public Cita(LocalDate fecha, String motivo, int idMascota, int idVeterinario) {
        this(0, fecha, motivo, idMascota, idVeterinario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", motivo='" + motivo + '\'' +
                ", idMascota=" + idMascota +
                ", idVeterinario=" + idVeterinario +
                '}';
    }
}
