package Servi�os;

import Entidades.AluguelVe�culo;
import Entidades.FaturaLoca��o;

public class Servi�oLoca��o {
	private double precoHora;
	private double precoDia;
	private TaxaServi�o taxaServico;
	
	public Servi�oLoca��o(double precoHora, double precoDia, TaxaServi�o taxa) {
		super();
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaServico = taxa;
	}
	
	public void EmitirFatura(AluguelVe�culo aluguelVe�culo) {
		long t1=aluguelVe�culo.getFim().getTime();
		long t2=aluguelVe�culo.getInicio().getTime();
		
		double horas=(t1-t2)/1000/60/60;
		double valorCaucao;
		
		if(horas<=12.0) {
			valorCaucao=Math.ceil(horas)*precoHora;
		}else {
			valorCaucao=Math.ceil(horas/24)*precoDia;
		}
		double taxa=taxaServico.tax(valorCaucao);
		aluguelVe�culo.setFaturaLoca��o(new FaturaLoca��o(valorCaucao, taxa));
		
	}
	
}
