package model;

import java.util.Date;

public class Operador extends Funcionario {

	private int codigoCaixa;
	private String turno;
	private Date ultimaVenda;
	private String status;

	public Operador(String nome, int cpf, Date dataNascimento, int telefone, String email, String endereco,
			Date dataAdmissao, String cargo, double salario, String senha, boolean ativo, int codigoCaixa, String turno,
			Date ultimaVenda, String status) {
		super(nome, cpf, dataNascimento, telefone, email, endereco, dataAdmissao, cargo, salario, senha, ativo);
		this.codigoCaixa = codigoCaixa;
		this.turno = turno;
		this.ultimaVenda = ultimaVenda;
		this.status = status;
	}

	public int getCodigoCaixa() {
		return codigoCaixa;
	}

	public void setCodigoCaixa(int codigoCaixa) {
		this.codigoCaixa = codigoCaixa;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUltimaVenda() {
		return ultimaVenda;
	}

}
