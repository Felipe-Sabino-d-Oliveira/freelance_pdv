package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int id;
    private static int proximoId = 1;
    private String localizacao;
    private List<Produto> produtos;

    public Estoque(String localizacao) {
        this.id = proximoId++;
        this.localizacao = localizacao;
        this.produtos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
