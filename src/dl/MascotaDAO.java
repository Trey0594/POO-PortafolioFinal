package dl;

import tl.Mascota;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {

    public void insertar(Mascota mascota) {
        String sql = "INSERT INTO mascota (nombre, especie, raza, edad, id_cliente) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, mascota.getNombre());
            stmt.setString(2, mascota.getEspecie());
            stmt.setString(3, mascota.getRaza());
            stmt.setInt(4, mascota.getEdad());
            stmt.setInt(5, mascota.getIdCliente());

            stmt.executeUpdate();
            System.out.println("Mascota registrada correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al insertar mascota: " + e.getMessage());
        }
    }

    public List<Mascota> obtenerTodas() {
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT id, nombre, especie, raza, edad, id_cliente FROM mascota";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Mascota m = new Mascota(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("especie"),
                        rs.getString("raza"),
                        rs.getInt("edad"),
                        rs.getInt("id_cliente")
                );
                mascotas.add(m);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener mascotas: " + e.getMessage());
        }

        return mascotas;
    }
}
