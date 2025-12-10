package dl;

import tl.Cita;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CitaDAO {

    public void insertar(Cita cita) {
        String sql = "INSERT INTO cita (fecha, motivo, id_mascota, id_veterinario) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(cita.getFecha()));
            stmt.setString(2, cita.getMotivo());
            stmt.setInt(3, cita.getIdMascota());
            stmt.setInt(4, cita.getIdVeterinario());

            stmt.executeUpdate();
            System.out.println("Cita registrada correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al insertar cita: " + e.getMessage());
        }
    }

    public List<Cita> obtenerTodas() {
        List<Cita> citas = new ArrayList<>();
        String sql = "SELECT id, fecha, motivo, id_mascota, id_veterinario FROM cita";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cita c = new Cita(
                        rs.getInt("id"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getString("motivo"),
                        rs.getInt("id_mascota"),
                        rs.getInt("id_veterinario")
                );
                citas.add(c);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener citas: " + e.getMessage());
        }

        return citas;
    }
}
