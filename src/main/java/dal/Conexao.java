package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Configurações do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_seu_banco";
    private static final String USUARIO = "root";
    private static final String SENHA = "sua_senha_aqui";

    // Método para obter a conexão
    public static Connection conectar() {
        try {
            // Carrega o driver do MySQL (pode ser opcional em versões recentes do JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do MySQL não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }

    // Método opcional para fechar a conexão (pode ser usado em DAO)
    public static void desconectar(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}