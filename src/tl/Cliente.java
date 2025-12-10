package tl;

public class Cliente extends Persona {

    private String ubicacion;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellidos, String cedula, char sexo, String ubicacion) {
        super(id, nombre, apellidos, cedula, sexo);
        this.ubicacion = ubicacion;
    }

    public Cliente(String nombre, String apellidos, String cedula, char sexo, String ubicacion) {
        super(nombre, apellidos, cedula, sexo);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente #" + id + " - " + nombre + " " + apellidos +
                " | Cédula: " + cedula + " | Sexo: " + sexo + " | Ubicación: " + ubicacion);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", sexo=" + sexo +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
