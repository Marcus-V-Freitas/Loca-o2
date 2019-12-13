package Entidades;

import java.util.Date;

import Exceptions.DominioException;

public class AluguelVeículo {
	private Date inicio;
	private Date fim;
	private Date retorno;
	private Veículo veiculo;
	private double previstaKm;
	private double totalKm;

	private FaturaLocação faturaLocação;

	public AluguelVeículo(Date inicio, Date fim, Date retorno, Veículo veiculo) throws DominioException {
		if (inicio.before(new Date())) {
			throw new DominioException("Data de aluguel deve ser maior que a data de hoje");
		}
		if (!retorno.after(inicio) || !fim.after(inicio)) {
			throw new DominioException("Data de retorno não pode ser menor que a data de inicio");
		}
		this.inicio = inicio;
		this.fim = fim;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}

	public AluguelVeículo(double previstaKm, double totalKm, Veículo veiculo) {
		this.previstaKm = previstaKm;
		this.totalKm = totalKm;
		this.veiculo = veiculo;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public FaturaLocação getFaturaLocação() {
		return faturaLocação;
	}

	public void setFaturaLocação(FaturaLocação faturaLocação) {
		this.faturaLocação = faturaLocação;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veículo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veículo veiculo) {
		this.veiculo = veiculo;
	}

	public double getPrevistaKm() {
		return previstaKm;
	}

	public void setPrevistaKm(double previstaKm) {
		this.previstaKm = previstaKm;
	}

	public double getTotalKm() {
		return totalKm;
	}

	public void setTotalKm(double totalKm) {
		this.totalKm = totalKm;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Fatura da locação\n\n");
		sb.append("Valor do aluguel do veículo: R$" + String.format("%.2f", getFaturaLocação().getValorBasico()) + "\n");
		sb.append("Valor da taxa do seguro: R$" + String.format("%.2f", getFaturaLocação().getTaxa()) + "\n");
		sb.append("Valor total: R$" + String.format("%.2f", getFaturaLocação().valorTotal()) + "\n");
		return sb.toString();

	}

}
