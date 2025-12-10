package dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {


    private static final String URL = "jdbc:mysql://localhost:3306/veterinaria_db";


    private static final String USER = "trey";


    private static final String PASSWORD = "1234";

    static {
        try {
            // Cargar el driver de MySQL (versión 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error cargando el driver de MySQL: " + e.getMessage());
        }
    }

    public static Connection obtenerConexion() throws SQLException {
        // Devuelve una conexión lista para usar en los DAO
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
