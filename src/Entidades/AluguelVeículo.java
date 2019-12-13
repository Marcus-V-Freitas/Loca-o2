package Entidades;

import java.util.Date;

import Exceptions.DominioException;

public class AluguelVe�culo {
	private Date inicio;
	private Date fim;
	private Date retorno;
	private Ve�culo veiculo;
	private double previstaKm;
	private double totalKm;

	private FaturaLoca��o faturaLoca��o;

	public AluguelVe�culo(Date inicio, Date fim, Date retorno, Ve�culo veiculo) throws DominioException {
		if (inicio.before(new Date())) {
			throw new DominioException("Data de aluguel deve ser maior que a data de hoje");
		}
		if (!retorno.after(inicio) || !fim.after(inicio)) {
			throw new DominioException("Data de retorno n�o pode ser menor que a data de inicio");
		}
		this.inicio = inicio;
		this.fim = fim;
		this.retorno = retorno;
		this.veiculo = veiculo;
	}

	public AluguelVe�culo(double previstaKm, double totalKm, Ve�culo veiculo) {
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

	public FaturaLoca��o getFaturaLoca��o() {
		return faturaLoca��o;
	}

	public void setFaturaLoca��o(FaturaLoca��o faturaLoca��o) {
		this.faturaLoca��o = faturaLoca��o;
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

	public Ve�culo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Ve�culo veiculo) {
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
		sb.append("Fatura da loca��o\n\n");
		sb.append("Valor do aluguel do ve�culo: R$" + String.format("%.2f", getFaturaLoca��o().getValorBasico()) + "\n");
		sb.append("Valor da taxa do seguro: R$" + String.format("%.2f", getFaturaLoca��o().getTaxa()) + "\n");
		sb.append("Valor total: R$" + String.format("%.2f", getFaturaLoca��o().valorTotal()) + "\n");
		return sb.toString();

	}

}
