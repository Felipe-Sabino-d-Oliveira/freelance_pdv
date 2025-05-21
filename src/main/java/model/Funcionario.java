package model;

import java.util.Date;

public abstract class Funcionario {

	private int id;
	private static int proximoId = 1;
	private String nome;
	private int cpf;
	private Date dataNascimento;
	private int telefone;
	private String email;
	private String endereco;
	private Date dataAdmissao;
	private String cargo;
	private double salario;
	private String senha;
	private boolean ativo;

	public Funcionario(String nome, int cpf, Date dataNascimento, int telefone, String email, String endereco,
			Date dataAdmissao, String cargo, double salario, String senha, boolean ativo) {
		
		this.id = proximoId++;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
		this.salario = salario;
		this.senha = senha;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void ativar() {
	    this.ativo = true;
	}

	public void desativar() {
	    this.ativo = false;
	}
	
}
