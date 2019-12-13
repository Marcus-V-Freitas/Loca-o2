package Servi�os;

import Entidades.AluguelVe�culo;

public class TaxaServicoDia implements TaxaServi�o {

	@Override
	public double taxa(AluguelVe�culo aluguelVe�culo, double precoDia) {

		double valorBasico = 0;
		long dataRetirada = aluguelVe�culo.getInicio().getTime();
		long dataPrevista = aluguelVe�culo.getFim().getTime();
		long dataRetorno = aluguelVe�culo.getRetorno().getTime();

		double horaPrevista = (double) (dataPrevista - dataRetirada) / 1000 / 60 / 60;
		double horaRetorno = (double) (dataRetorno - dataRetirada) / 1000 / 60 / 60;
		double horaDiferenca = (double) (dataRetorno - dataPrevista) / 1000 / 60 / 60;

		if (horaPrevista == horaRetorno) {
			if (horaRetorno <= 12 && horaRetorno <= 24) {
				valorBasico += Math.ceil(1) * precoDia;
			} else {
				valorBasico += Math.ceil(horaRetorno / 24) * precoDia;
			}
		} else {
			valorBasico += Math.ceil(horaRetorno / 24) * precoDia;
			valorBasico += valorBasico * Math.ceil(horaDiferenca / 24) * 0.02;
		}
		return valorBasico;
	}
}
