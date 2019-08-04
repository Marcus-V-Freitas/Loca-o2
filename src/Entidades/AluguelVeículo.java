package Entidades;

import java.util.Date;

public class AluguelVeículo {
	private Date inicio;
	private Date fim;
	private Veículo veiculo;
	
	private FaturaLocação faturaLocação;
	
	
	public AluguelVeículo(Date inicio, Date fim, Veículo veiculo) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
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



	@Override
	public String toString() {
		return "Valor Básico: "+String.format("%.2f", getFaturaLocação().getValorCaucao())+
		"Valor da taxa: " +String.format("%.2f", getFaturaLocação().getTaxa())+
		"Valor total: "+String.format("%.2f", getFaturaLocação().valorTotal());
	}

	
	
	
}
