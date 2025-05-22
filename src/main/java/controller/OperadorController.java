package controller;

import dao.OperadorDao;
import model.Operador;

public class OperadorController extends FuncionarioController {

    private OperadorDao operadorDao;

    public OperadorController() {
        this.operadorDao = new OperadorDao();
    }

    public void cadastrarOperador(Operador operador) {
        operadorDao.inserirOperador(operador);
    }

    // Métodos adicionais como alterar turno, status etc.
}
