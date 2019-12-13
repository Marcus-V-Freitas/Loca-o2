package Entidades;

public class Modelo {
	private String nomeModelo;
	private Marca marca;

	public Modelo(String nomeModelo, Marca marca) {
		super();
		this.nomeModelo = nomeModelo;
		this.marca = marca;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
