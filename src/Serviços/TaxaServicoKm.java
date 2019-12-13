package Serviços;

import Entidades.AluguelVeículo;

public class TaxaServicoKm implements TaxaServiço {

	@Override
	public double taxa(AluguelVeículo aluguelVeículo, double precoKm) {
		double valorBasico = 0.0;
		double previstaKm = aluguelVeículo.getPrevistaKm();
		double retornoKm = aluguelVeículo.getTotalKm();
		if (previstaKm == retornoKm) {
			valorBasico = retornoKm * precoKm;
		} else {
			double diferenca = retornoKm - previstaKm;
			valorBasico = (retornoKm * precoKm) + (diferenca * 2);
		}
		return valorBasico;
	}

}
