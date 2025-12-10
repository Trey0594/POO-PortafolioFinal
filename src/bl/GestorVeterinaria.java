package bl;

import dl.CitaDAO;
import dl.ClienteDAO;
import dl.MascotaDAO;
import dl.VeterinarioDAO;
import tl.Cita;
import tl.Cliente;
import tl.Mascota;
import tl.Veterinario;

import java.time.LocalDate;
import java.util.List;

public class GestorVeterinaria {

    private final ClienteDAO clienteDAO;
    private final MascotaDAO mascotaDAO;
    private final VeterinarioDAO veterinarioDAO;
    private final CitaDAO citaDAO;

    public GestorVeterinaria() {
        this.clienteDAO = new ClienteDAO();
        this.mascotaDAO = new MascotaDAO();
        this.veterinarioDAO = new VeterinarioDAO();
        this.citaDAO = new CitaDAO();
    }

    // --- Clientes ---

    public void registrarCliente(String nombre, String apellidos, String cedula, char sexo, String ubicacion) {
        Cliente c = new Cliente(nombre, apellidos, cedula, sexo, ubicacion);
        clienteDAO.insertar(c);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.obtenerTodos();
    }

    // --- Mascotas ---

    public void registrarMascota(String nombre, String especie, String raza, int edad, int idCliente) {
        Mascota m = new Mascota(nombre, especie, raza, edad, idCliente);
        mascotaDAO.insertar(m);
    }

    public List<Mascota> listarMascotas() {
        return mascotaDAO.obtenerTodas();
    }

    // --- Veterinarios ---

    public void registrarVeterinario(String nombre, String apellidos, String cedula, char sexo, String especialidad) {
        Veterinario v = new Veterinario(nombre, apellidos, cedula, sexo, especialidad);
        veterinarioDAO.insertar(v);
    }

    public List<Veterinario> listarVeterinarios() {
        return veterinarioDAO.obtenerTodos();
    }

    // --- Citas ---

    public void registrarCita(LocalDate fecha, String motivo, int idMascota, int idVeterinario) {
        Cita c = new Cita(fecha, motivo, idMascota, idVeterinario);
        citaDAO.insertar(c);
    }

    public List<Cita> listarCitas() {
        return citaDAO.obtenerTodas();
    }
}
