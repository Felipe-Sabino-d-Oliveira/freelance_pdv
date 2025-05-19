package controller;

public class Produto {
	
	// Atributos produtos
	private int id;
	private String codigo;
	private String nome;
	private Double preco;
	private int quatidade;
	
	// Construtor
	public Produto(int id,String codigo, String nome, double preco, int quantidade) {
		this.id = id;
		this.codigo  = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quatidade = quantidade;
	}
	
	// Getters e setters
	
	// Métodos de produto
	public void buscarProduto() {/*  codigo: retornar produto */}
	
	public void criarProduto() {/* no bd */}
	
	public void alterarDadosProduto() { /*  */ }
	
	public void deletarProduto() { /*  */ }
	
	
}
