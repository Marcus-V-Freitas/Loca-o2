package Serviços;

public class TaxaServicoNormal implements TaxaServiço{

	@Override
	public double tax(double total) {
		return (total<=100.0)? total*0.2: total*0.15;
	}
	
	
}
