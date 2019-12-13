package Entidades;

import java.util.Date;

import Entidades.Enum.Sexo;

public abstract class Cliente {
	private String nomeCondutor;
	private String email;
	private String cnh;
	private Date nascimentoCondutor;
	private Sexo sexo;

	public Cliente(String nomeCondutor, String email, String cnh, Date nascimentoCondutor, Sexo sexo) {
		super();
		this.nomeCondutor = nomeCondutor;
		this.email = email;
		this.cnh = cnh;
		this.nascimentoCondutor = nascimentoCondutor;
		this.sexo = sexo;
	}

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Date getNascimentoCondutor() {
		return nascimentoCondutor;
	}

	public void setNascimentoCondutor(Date nascimentoCondutor) {
		this.nascimentoCondutor = nascimentoCondutor;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
