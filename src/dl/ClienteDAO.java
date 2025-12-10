package dl;

import tl.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void insertar(Cliente cliente) {
        String sql = "INSERT INTO cliente (nombre, apellidos, cedula, sexo, ubicacion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getCedula());
            stmt.setString(4, String.valueOf(cliente.getSexo()));
            stmt.setString(5, cliente.getUbicacion());

            stmt.executeUpdate();
            System.out.println("Cliente registrado correctamente en la base de datos.");

        } catch (SQLException e) {
            System.err.println("Error al insertar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> obtenerTodos() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT id, nombre, apellidos, cedula, sexo, ubicacion FROM cliente";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("cedula"),
                        rs.getString("sexo").charAt(0),
                        rs.getString("ubicacion")
                );
                clientes.add(c);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener clientes: " + e.getMessage());
        }

        return clientes;
    }
}
