package Servi�os;

public class TaxaSeguroCDW implements TaxaSeguro {

	@Override
	public double taxa(double valorBasico) {
		return valorBasico *= 0.62;
	}
}
