package Servi�os;

public class TaxaServicoNormal implements TaxaServi�o{

	@Override
	public double tax(double total) {
		return (total<=100.0)? total*0.2: total*0.15;
	}
	
	
}
