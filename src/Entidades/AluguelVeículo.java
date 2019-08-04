package Entidades;

import java.util.Date;

public class AluguelVe�culo {
	private Date inicio;
	private Date fim;
	private Ve�culo veiculo;
	
	private FaturaLoca��o faturaLoca��o;
	
	
	public AluguelVe�culo(Date inicio, Date fim, Ve�culo veiculo) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
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



	@Override
	public String toString() {
		return "Valor B�sico: "+String.format("%.2f", getFaturaLoca��o().getValorCaucao())+
		"Valor da taxa: " +String.format("%.2f", getFaturaLoca��o().getTaxa())+
		"Valor total: "+String.format("%.2f", getFaturaLoca��o().valorTotal());
	}

	
	
	
}
