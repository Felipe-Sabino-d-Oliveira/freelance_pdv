package controller;

import dao.ProdutoDao;
import model.Produto;

import java.util.List;

public class ProdutoController {

    private ProdutoDao produtoDao;

    public ProdutoController() {
        this.produtoDao = new ProdutoDao();
    }

    public void salvarProduto(Produto produto) {
        produtoDao.inserir(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoDao.listarTodos();
    }
}
