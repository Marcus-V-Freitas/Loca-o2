package Entidades;

public class FaturaLocação {
	private double valorCaucao;
	private double taxa;
	
	public FaturaLocação(double valorCaucao, double taxa) {
		super();
		this.valorCaucao = valorCaucao;
		this.taxa = taxa;
	}

	public double getValorCaucao() {
		return valorCaucao;
	}

	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa= taxa;
	}
	
	public double valorTotal() {
		return getTaxa()+getValorCaucao();
	}
	
}

