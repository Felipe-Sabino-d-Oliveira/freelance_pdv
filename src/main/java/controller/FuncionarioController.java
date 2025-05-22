package controller;

import dao.FuncionarioDao;
import model.Funcionario;

public abstract class FuncionarioController {
    
    protected FuncionarioDao funcionarioDao;

    public FuncionarioController() {
        funcionarioDao = new FuncionarioDao();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioDao.inserir(funcionario);
    }

    public void excluirFuncionario(int id) {
        funcionarioDao.deletar(id);
    }

    // Atualizar, listar, ativar/desativar etc.
}
