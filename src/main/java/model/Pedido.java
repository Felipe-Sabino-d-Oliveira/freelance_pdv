package model;

import java.util.Date;
import java.util.List;

public class Pedido {
	
	private int id;
    private Date dataHora;
    private Funcionario operador; // ou apenas operadorId
    private List<ItemPedido> itens;
    private double total;
    private Pagamento pagamento;
    private String status; // Ex: "Finalizado", "Cancelado", "Em aberto"

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

}
