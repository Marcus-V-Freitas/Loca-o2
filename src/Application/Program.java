package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.AluguelVe�culo;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Ve�culo;
import Entidades.Enum.Combust�vel;
import Entidades.Enum.Cor;
import Servi�os.Servi�oLoca��o;
import Servi�os.TaxaServicoNormal;


public class Program {

	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc=new Scanner(System.in);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Digite a placa do carro: ");
		String placa=sc.nextLine();
		
		System.out.println("Digite o renavam do carro: ");
		String renavam=sc.nextLine();
		
		System.out.println("Modelo carro: ");
		String modelo=sc.nextLine();
		
		System.out.println("Digite a marca do modelo: ");
		String marca=sc.nextLine();
		
		System.out.println("Digite a cor do carro");
		Cor cor=Cor.valueOf(sc.next());
		
		System.out.println("Digite o combust�vel: ");
		Combust�vel combust�vel=Combust�vel.valueOf(sc.next());
		
		System.out.println("quilometragem: ");
		double quilometragem=sc.nextDouble();
		
		System.out.println("Valor da locacao: ");
		double valorLocacao=sc.nextDouble();
		sc.nextLine();
		System.out.println("Dia e hora do inicio: ");
		Date inicio=sdf.parse(sc.nextLine());
		
		System.out.println("Dia e hora do retorno: ");
		Date fim=sdf.parse(sc.nextLine());
		
		System.out.println("Digite o pre�o da horas: ");
		Double precoHora=sc.nextDouble();
		
		System.out.println("Digite o pre�o do dia: ");
		Double precoDia=sc.nextDouble();
		
		AluguelVe�culo aluguel=new AluguelVe�culo(inicio, fim, new Ve�culo(placa, renavam,
		new Modelo(modelo,new Marca(marca)), cor, quilometragem, combust�vel, valorLocacao));
		
		Servi�oLoca��o servico=new Servi�oLoca��o(precoHora, precoDia, new TaxaServicoNormal());
		
		servico.EmitirFatura(aluguel);
		
		System.out.println(aluguel);

	}

}
