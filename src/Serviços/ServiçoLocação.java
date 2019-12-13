package Serviços;

import Entidades.AluguelVeículo;
import Entidades.FaturaLocação;
import Entidades.Enum.Seguro;

public class ServiçoLocação {

	private double preco;
	private TaxaSeguro taxaSeguro;
	private TaxaServiço taxaServico;

	public ServiçoLocação(double preco, TaxaServiço taxaServiço, TaxaSeguro taxaSeguro) {
		this.preco = preco;
		this.taxaServico = taxaServiço;
		this.taxaSeguro = taxaSeguro;
	}

	public void EmitirFatura(AluguelVeículo aluguelVeículo) {

		Seguro seguro = aluguelVeículo.getVeiculo().getSeguro();

		double valorBasico = taxaServico.taxa(aluguelVeículo, preco);
		double taxa = 0.0;

		if (seguro == Seguro.CDW) {
			taxa = taxaSeguro.taxa(valorBasico);
		} else {
			taxa = taxaSeguro.taxa(valorBasico);
		}

		aluguelVeículo.setFaturaLocação(new FaturaLocação(valorBasico, taxa));

	}

}
