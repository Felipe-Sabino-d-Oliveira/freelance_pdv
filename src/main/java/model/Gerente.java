package model;

import java.util.Date;

public class Gerente extends Funcionario {

	public Gerente(String nome, int cpf, Date dataNascimento, int telefone, String email, String endereco,
			Date dataAdmissao, String cargo, double salario, String senha, boolean ativo) {
		super(nome, cpf, dataNascimento, telefone, email, endereco, dataAdmissao, cargo, salario, senha, ativo);
	}
}