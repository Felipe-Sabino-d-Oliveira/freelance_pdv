package model;

public class Pagamento {
	
	private int id;
	private static int proximoId = 1;
    private String forma; // Dinheiro, Débito, Crédito, PIX
    private double valorPago;
    private double troco;
	
    public Pagamento(String forma, double valorPago, double troco) {
		this.id = proximoId;
		this.forma = forma;
		this.valorPago = valorPago;
		this.troco = troco;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public int getId() {
		return id;
	}

}
