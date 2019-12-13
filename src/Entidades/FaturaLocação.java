package Entidades;

public class FaturaLoca��o {
	private double valorBasico;
	private double taxa;

	public FaturaLoca��o(double valorBasico, double taxa) {
		super();
		this.valorBasico = valorBasico;
		this.taxa = taxa;
	}

	public double getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(double valorBasico) {
		this.valorBasico = valorBasico;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double valorTotal() {
		return getTaxa() + getValorBasico();
	}
}
