package tl;

import java.util.ArrayList;
import java.util.List;

public class Mascota implements Agendable {

    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private int idCliente; // Relación con Cliente en BD
    private List<Cita> citas; // Composición: la vida de la cita depende de la mascota

    public Mascota() {
        this.citas = new ArrayList<>();
    }

    public Mascota(int id, String nombre, String especie, String raza, int edad, int idCliente) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.idCliente = idCliente;
    }

    public Mascota(String nombre, String especie, String raza, int edad, int idCliente) {
        this(0, nombre, especie, raza, edad, idCliente);
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    @Override
    public void agendarCita(Cita cita) {
        if (cita != null) {
            this.citas.add(cita);
        }
    }

    public void mostrarInfoMascota() {
        System.out.println("Mascota #" + id + " - " + nombre + " (" + especie + ", " + raza + "), edad " + edad +
                " años | Id Cliente: " + idCliente);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", idCliente=" + idCliente +
                '}';
    }
}
