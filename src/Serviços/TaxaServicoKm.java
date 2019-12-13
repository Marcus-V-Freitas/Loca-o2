package Servi�os;

import Entidades.AluguelVe�culo;

public class TaxaServicoKm implements TaxaServi�o {

	@Override
	public double taxa(AluguelVe�culo aluguelVe�culo, double precoKm) {
		double valorBasico = 0.0;
		double previstaKm = aluguelVe�culo.getPrevistaKm();
		double retornoKm = aluguelVe�culo.getTotalKm();
		if (previstaKm == retornoKm) {
			valorBasico = retornoKm * precoKm;
		} else {
			double diferenca = retornoKm - previstaKm;
			valorBasico = (retornoKm * precoKm) + (diferenca * 2);
		}
		return valorBasico;
	}

}
