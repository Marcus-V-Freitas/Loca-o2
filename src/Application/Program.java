package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entidades.AluguelVeículo;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Veículo;
import Entidades.Enum.Combustível;
import Entidades.Enum.Cor;
import Entidades.Enum.Seguro;
import Exceptions.DominioException;
import Serviços.ServiçoLocação;
import Serviços.TaxaSeguro;
import Serviços.TaxaSeguroCDW;
import Serviços.TaxaSeguroSLI;
import Serviços.TaxaServicoDia;
import Serviços.TaxaServicoKm;

public class Program {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

			System.out.println("Digite a placa do carro: ");
			String placa = sc.nextLine();

			System.out.println("Digite o renavam do carro: ");
			String renavam = sc.nextLine();

			System.out.println("Modelo carro: ");
			String modelo = sc.nextLine();

			System.out.println("Digite a marca do modelo: ");
			String marca = sc.nextLine();

			System.out.println("Digite a cor do carro");
			Cor cor = Cor.valueOf(sc.next().toUpperCase());

			System.out.println("Digite o seguro do carro");
			Seguro seguro = Seguro.valueOf(sc.next().toUpperCase());
			TaxaSeguro taxaSeguro = (seguro == Seguro.CDW) ? new TaxaSeguroCDW() : new TaxaSeguroSLI();

			System.out.println("Digite o combustível: ");
			Combustível combustível = Combustível.valueOf(sc.next().toUpperCase());

			System.out.println("Aluguel por Dia ou quilometragem: (D/K)");
			char respostas = sc.next().toUpperCase().charAt(0);

			if (respostas == 'D') {

				System.out.println("preço do dia: ");
				double preco = sc.nextDouble();

				sc.nextLine();
				System.out.println("Dia e hora do inicio: ");
				Date inicio = sdf.parse(sc.nextLine());

				System.out.println("Dia e hora da previsão deretorno: ");
				Date fim = sdf.parse(sc.nextLine());

				System.out.println("Dia e hora do retorno: ");
				Date retorno = sdf.parse(sc.nextLine());

				AluguelVeículo aluguel = new AluguelVeículo(inicio, fim, retorno,
						new Veículo(placa, renavam, new Modelo(modelo, new Marca(marca)), cor, seguro, combustível));

				ServiçoLocação servico = new ServiçoLocação(preco, new TaxaServicoDia(), taxaSeguro);

				servico.EmitirFatura(aluguel);

				System.out.println(aluguel);

			} else if (respostas == 'K') {

				System.out.println("preço da Km: ");
				double preco = sc.nextDouble();

				System.out.println("quilometragem inicial: ");
				double inicialKm = sc.nextDouble();

				System.out.println("quilometragem final: ");
				double finalKm = sc.nextDouble();

				AluguelVeículo aluguel = new AluguelVeículo(inicialKm, finalKm,
						new Veículo(placa, renavam, new Modelo(modelo, new Marca(marca)), cor, seguro, combustível));

				ServiçoLocação servico = new ServiçoLocação(preco, new TaxaServicoKm(), taxaSeguro);

				servico.EmitirFatura(aluguel);

				System.out.println(aluguel);

			} else {
				System.out.println("Não válido");
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Valor digitado é inválido.");
		} catch (IllegalArgumentException e) {
			System.out.println("Valor digitado não está disponível para escolha.");
		} catch (ParseException e) {
			System.out.println("Formato digitado é inválido.");
		} catch (DominioException e) {
			System.out.println(e.getMessage());
		} finally {
		}
	}

}
