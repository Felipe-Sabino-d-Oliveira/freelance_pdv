package controller;

import dao.EstoqueDao;
import model.Estoque;

public class EstoqueController {

    private EstoqueDao estoqueDao;

    public EstoqueController() {
        this.estoqueDao = new EstoqueDao();
    }

    public void salvarEstoque(Estoque estoque) {
        estoqueDao.inserir(estoque);
    }
}
