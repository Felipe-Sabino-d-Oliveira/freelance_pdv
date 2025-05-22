package dao;

import java.sql.*;
import model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import config.ConexaoMySQL;

public class FuncionarioDao {

    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (id, nome, cpf, dataNascimento, telefone, email, endereco, dataAdmissao, cargo, salario, senha, ativo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoMySQL.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, funcionario.getId());
            stmt.setString(2, funcionario.getNome());
            stmt.setInt(3, funcionario.getCpf());
            stmt.setDate(4, new java.sql.Date(funcionario.getDataNascimento().getTime()));
            stmt.setInt(5, funcionario.getTelefone());
            stmt.setString(6, funcionario.getEmail());
            stmt.setString(7, funcionario.getEndereco());
            stmt.setDate(8, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
            stmt.setString(9, funcionario.getCargo());
            stmt.setDouble(10, funcionario.getSalario());
            stmt.setString(11, funcionario.getSenha());
            stmt.setBoolean(12, funcionario.isAtivo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> listar() {
        List<Funcionario> lista = new ArrayList<>();
        // Implementar com base no tipo de retorno esperado (provavelmente instanciar como Gerente ou Operador depois).
        return lista;
    }

    public void atualizar(Funcionario funcionario) {
        // Similar à inserção, mas com UPDATE e WHERE id = ?
    }

    public void deletar(int id) {
        String sql = "DELETE FROM funcionarios WHERE id = ?";

        try (Connection conn = ConexaoMySQL.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
