package Entidades;

import java.util.Date;

import Entidades.Enum.Sexo;

public class ClienteFisico extends Cliente{
	
	private double cpf;

	public ClienteFisico(String nomeCondutor, String email, String cnh, Date nascimentoCondutor, Sexo sexo, double cpf) {
		super(nomeCondutor, email, cnh, nascimentoCondutor, sexo);
		this.cpf=cpf;

	}
	
	
	
}
