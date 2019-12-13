package Entidades;

import Entidades.Enum.Combustível;
import Entidades.Enum.Cor;
import Entidades.Enum.Seguro;
import Exceptions.DominioException;

public class Veículo {

	private String placa;
	private String renavam;
	private Modelo modelo;
	private Cor cor;
	private Seguro seguro;
	private Combustível combustivel;

	public Veículo(String placa, String renavam, Modelo modelo, Cor cor, Seguro seguro, Combustível combustivel)throws DominioException {
		verificarPlaca(placa);
		verificarRenavam(renavam);
		this.placa = placa;
		this.renavam = renavam;
		this.modelo = modelo;
		this.cor = cor;
		this.seguro = seguro;
		this.combustivel = combustivel;
	}

	private static void verificarPlaca(String placa) throws DominioException {
		if (placa.length() != 7) {
			throw new DominioException("Placa inválida: formato xxx-0000");
		}
		if (!placa.substring(0, 3).matches("[a-zA-Z]+")) {
			throw new DominioException("Placa inválida: formato xxx-0000");
		}
		if (!placa.substring(3).matches("[0-9]*")) {
			throw new DominioException("Placa inválida: formato xxx-0000");
		}
	}

	private static void verificarRenavam(String renavam) throws DominioException {
		if (renavam.length() != 11) {
			throw new DominioException("Renavam inválido: formato 000.000.000.00");
		}
		if (!renavam.matches("[0-9]*")) {
			throw new DominioException("Renavam inválido: formato 000.000.000.00");
		}
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Combustível getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustível combustivel) {
		this.combustivel = combustivel;
	}

}
