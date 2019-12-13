package Entidades;

import java.util.Date;

import Entidades.Enum.Sexo;

public class ClienteJuridico extends Cliente{
	
	private double cnpj;
	private String nomeFantasia;

	public ClienteJuridico(String nomeCondutor, String email, String cnh, Date nascimentoCondutor, Sexo sexo, double cnpj, String nomeFantasia) {
		super(nomeCondutor, email, cnh, nascimentoCondutor, sexo);
		this.cnpj=cnpj;
		this.nomeFantasia=nomeFantasia;
	}

}
