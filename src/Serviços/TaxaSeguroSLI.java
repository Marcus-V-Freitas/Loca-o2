package Serviços;

public class TaxaSeguroSLI implements TaxaSeguro {

	@Override
	public double taxa(double valorBasico) {
		return valorBasico *= 1.08;
	}
}
