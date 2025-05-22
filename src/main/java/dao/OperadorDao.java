package dao;

import java.sql.*;
import model.Operador;
import config.ConexaoMySQL;

public class OperadorDao extends FuncionarioDao {

    public void inserirOperador(Operador operador) {
        super.inserir(operador); // Insere na tabela funcionarios

        String sql = "INSERT INTO operadores (id_funcionario, codigoCaixa, turno, ultimaVenda, status) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoMySQL.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, operador.getId());
            stmt.setInt(2, operador.getCodigoCaixa());
            stmt.setString(3, operador.getTurno());
            stmt.setDate(4, new java.sql.Date(operador.getUltimaVenda().getTime()));
            stmt.setString(5, operador.getStatus());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Atualizar, listar ou deletar operadores seriam feitos com join entre tabelas
}
