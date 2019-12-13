package Serviços;

import Entidades.AluguelVeículo;

public interface TaxaServiço {

	double taxa(AluguelVeículo aluguelVeículo, double preco);
}
