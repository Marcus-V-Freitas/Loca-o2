package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.AluguelVeículo;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Veículo;
import Entidades.Enum.Combustível;
import Entidades.Enum.Cor;
import Serviços.ServiçoLocação;
import Serviços.TaxaServicoNormal;


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
		
		System.out.println("Digite o combustível: ");
		Combustível combustível=Combustível.valueOf(sc.next());
		
		System.out.println("quilometragem: ");
		double quilometragem=sc.nextDouble();
		
		System.out.println("Valor da locacao: ");
		double valorLocacao=sc.nextDouble();
		sc.nextLine();
		System.out.println("Dia e hora do inicio: ");
		Date inicio=sdf.parse(sc.nextLine());
		
		System.out.println("Dia e hora do retorno: ");
		Date fim=sdf.parse(sc.nextLine());
		
		System.out.println("Digite o preço da horas: ");
		Double precoHora=sc.nextDouble();
		
		System.out.println("Digite o preço do dia: ");
		Double precoDia=sc.nextDouble();
		
		AluguelVeículo aluguel=new AluguelVeículo(inicio, fim, new Veículo(placa, renavam,
		new Modelo(modelo,new Marca(marca)), cor, quilometragem, combustível, valorLocacao));
		
		ServiçoLocação servico=new ServiçoLocação(precoHora, precoDia, new TaxaServicoNormal());
		
		servico.EmitirFatura(aluguel);
		
		System.out.println(aluguel);

	}

}
