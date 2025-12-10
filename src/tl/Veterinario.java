package tl;

public class Veterinario extends Persona {

    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(int id, String nombre, String apellidos, String cedula, char sexo, String especialidad) {
        super(id, nombre, apellidos, cedula, sexo);
        this.especialidad = especialidad;
    }

    public Veterinario(String nombre, String apellidos, String cedula, char sexo, String especialidad) {
        super(nombre, apellidos, cedula, sexo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Veterinario #" + id + " - " + nombre + " " + apellidos +
                " | Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", sexo=" + sexo +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
