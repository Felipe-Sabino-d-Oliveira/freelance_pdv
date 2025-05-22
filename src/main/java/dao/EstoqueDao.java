package dao;

import model.Estoque;
import config.ConexaoMySQL;

import java.sql.*;

public class EstoqueDao {

    private Connection connection;

    public EstoqueDao() {
        this.connection = ConexaoMySQL.getConnection();
    }

    public void inserir(Estoque estoque) {
        String sql = "INSERT INTO estoques (id, localizacao) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, estoque.getId());
            stmt.setString(2, estoque.getLocalizacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
