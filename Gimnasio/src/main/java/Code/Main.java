package Code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL ="jdbc:postgresql://35.205.101.101:5432/Gimnasio";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static Connection conn;

    private static void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    private static void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
    public static void main(String[] args) {
        try {
            connect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
