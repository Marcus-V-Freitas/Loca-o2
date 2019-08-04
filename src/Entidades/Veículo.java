package Entidades;
import Entidades.Enum.Combustível;
import Entidades.Enum.Cor;

public class Veículo {
	
	private String placa;
	private String renavam;
	private Modelo modelo;
	private Cor cor;
	private double quilometragem;
	private Combustível combustivel;
	private double valorLocacao;
	
	
	public Veículo(String placa, String renavam, Modelo modelo, Cor cor, double quilometragem,
			Combustível combustivel, double valorLocacao) {
		super();
		this.placa = placa;
		this.renavam = renavam;
		this.modelo = modelo;
		this.cor = cor;
		this.quilometragem = quilometragem;
		this.combustivel = combustivel;
		this.valorLocacao = valorLocacao;
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
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public Combustível getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustível combustivel) {
		this.combustivel = combustivel;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
}
	

