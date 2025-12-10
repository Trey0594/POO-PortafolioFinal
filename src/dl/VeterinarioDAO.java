package dl;

import tl.Veterinario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {

    public void insertar(Veterinario vet) {
        String sql = "INSERT INTO veterinario (nombre, apellidos, cedula, sexo, especialidad) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vet.getNombre());
            stmt.setString(2, vet.getApellidos());
            stmt.setString(3, vet.getCedula());
            stmt.setString(4, String.valueOf(vet.getSexo()));
            stmt.setString(5, vet.getEspecialidad());

            stmt.executeUpdate();
            System.out.println("Veterinario registrado correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al insertar veterinario: " + e.getMessage());
        }
    }

    public List<Veterinario> obtenerTodos() {
        List<Veterinario> vets = new ArrayList<>();
        String sql = "SELECT id, nombre, apellidos, cedula, sexo, especialidad FROM veterinario";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Veterinario v = new Veterinario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("cedula"),
                        rs.getString("sexo").charAt(0),
                        rs.getString("especialidad")
                );
                vets.add(v);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener veterinarios: " + e.getMessage());
        }

        return vets;
    }
}
