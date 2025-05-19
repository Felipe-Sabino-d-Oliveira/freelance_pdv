package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://" +
                        Env.get("DB_HOST") + ":" +
                        Env.get("DB_PORT") + "/" +
                        Env.get("DB_NAME") +
                        "?useSSL=false&serverTimezone=UTC";

                connection = DriverManager.getConnection(url, Env.get("DB_USER"), Env.get("DB_PASSWORD"));
                System.out.println("✅ Conectado ao banco!");
            } catch (SQLException e) {
                System.out.println("❌ Erro ao conectar: " + e.getMessage());
            }
        }
        return connection;
    }
}
