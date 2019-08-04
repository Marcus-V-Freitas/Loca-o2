package Serviços;

import Entidades.AluguelVeículo;
import Entidades.FaturaLocação;

public class ServiçoLocação {
	private double precoHora;
	private double precoDia;
	private TaxaServiço taxaServico;
	
	public ServiçoLocação(double precoHora, double precoDia, TaxaServiço taxa) {
		super();
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaServico = taxa;
	}
	
	public void EmitirFatura(AluguelVeículo aluguelVeículo) {
		long t1=aluguelVeículo.getFim().getTime();
		long t2=aluguelVeículo.getInicio().getTime();
		
		double horas=(t1-t2)/1000/60/60;
		double valorCaucao;
		
		if(horas<=12.0) {
			valorCaucao=Math.ceil(horas)*precoHora;
		}else {
			valorCaucao=Math.ceil(horas/24)*precoDia;
		}
		double taxa=taxaServico.tax(valorCaucao);
		aluguelVeículo.setFaturaLocação(new FaturaLocação(valorCaucao, taxa));
		
	}
	
}
