package model;

import java.util.Date;

public class Produto {

	private int id;
	private static int proximoId = 1;
	private String nome;
	private String codigoBarras;
	private String descricao;
	private String unidade; // Ex: kg, un, pct
	private double precoVenda;
	private double precoCusto;
	private int quantidadeEstoque;
	private Date validade;
	private boolean ativo;

	

	public Produto(String nome, String codigoBarras, String descricao, String unidade, double precoVenda,
			double precoCusto, int quantidadeEstoque, Date validade, boolean ativo) {
		this.id = proximoId++;
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
		this.unidade = unidade;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.validade = validade;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
