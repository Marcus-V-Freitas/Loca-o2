package Entidades;
import Entidades.Enum.Combust�vel;
import Entidades.Enum.Cor;

public class Ve�culo {
	
	private String placa;
	private String renavam;
	private Modelo modelo;
	private Cor cor;
	private double quilometragem;
	private Combust�vel combustivel;
	private double valorLocacao;
	
	
	public Ve�culo(String placa, String renavam, Modelo modelo, Cor cor, double quilometragem,
			Combust�vel combustivel, double valorLocacao) {
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
	public Combust�vel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combust�vel combustivel) {
		this.combustivel = combustivel;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
}
	

