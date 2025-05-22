package dao;

import model.Produto;
import config.ConexaoMySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao() {
        this.connection = ConexaoMySQL.getConnection();
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produtos (id, nome, preco, validade, quantidade) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getNome());
            stmt.setDouble(3, produto.getPreco());
            stmt.setDate(4, new java.sql.Date(produto.getValidade().getTime()));
            stmt.setInt(5, produto.getQuantidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Produto p = new Produto(
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getDate("validade"),
                        rs.getInt("quantidade")
                );
                produtos.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;
    }
}
