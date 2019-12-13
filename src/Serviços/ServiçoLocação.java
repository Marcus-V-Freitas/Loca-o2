package Servi�os;

import Entidades.AluguelVe�culo;
import Entidades.FaturaLoca��o;
import Entidades.Enum.Seguro;

public class Servi�oLoca��o {

	private double preco;
	private TaxaSeguro taxaSeguro;
	private TaxaServi�o taxaServico;

	public Servi�oLoca��o(double preco, TaxaServi�o taxaServi�o, TaxaSeguro taxaSeguro) {
		this.preco = preco;
		this.taxaServico = taxaServi�o;
		this.taxaSeguro = taxaSeguro;
	}

	public void EmitirFatura(AluguelVe�culo aluguelVe�culo) {

		Seguro seguro = aluguelVe�culo.getVeiculo().getSeguro();

		double valorBasico = taxaServico.taxa(aluguelVe�culo, preco);
		double taxa = 0.0;

		if (seguro == Seguro.CDW) {
			taxa = taxaSeguro.taxa(valorBasico);
		} else {
			taxa = taxaSeguro.taxa(valorBasico);
		}

		aluguelVe�culo.setFaturaLoca��o(new FaturaLoca��o(valorBasico, taxa));

	}

}
