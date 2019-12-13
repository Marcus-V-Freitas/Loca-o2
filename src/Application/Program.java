package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entidades.AluguelVe�culo;
import Entidades.Marca;
import Entidades.Modelo;
import Entidades.Ve�culo;
import Entidades.Enum.Combust�vel;
import Entidades.Enum.Cor;
import Entidades.Enum.Seguro;
import Exceptions.DominioException;
import Servi�os.Servi�oLoca��o;
import Servi�os.TaxaSeguro;
import Servi�os.TaxaSeguroCDW;
import Servi�os.TaxaSeguroSLI;
import Servi�os.TaxaServicoDia;
import Servi�os.TaxaServicoKm;

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

			System.out.println("Digite o combust�vel: ");
			Combust�vel combust�vel = Combust�vel.valueOf(sc.next().toUpperCase());

			System.out.println("Aluguel por Dia ou quilometragem: (D/K)");
			char respostas = sc.next().toUpperCase().charAt(0);

			if (respostas == 'D') {

				System.out.println("pre�o do dia: ");
				double preco = sc.nextDouble();

				sc.nextLine();
				System.out.println("Dia e hora do inicio: ");
				Date inicio = sdf.parse(sc.nextLine());

				System.out.println("Dia e hora da previs�o deretorno: ");
				Date fim = sdf.parse(sc.nextLine());

				System.out.println("Dia e hora do retorno: ");
				Date retorno = sdf.parse(sc.nextLine());

				AluguelVe�culo aluguel = new AluguelVe�culo(inicio, fim, retorno,
						new Ve�culo(placa, renavam, new Modelo(modelo, new Marca(marca)), cor, seguro, combust�vel));

				Servi�oLoca��o servico = new Servi�oLoca��o(preco, new TaxaServicoDia(), taxaSeguro);

				servico.EmitirFatura(aluguel);

				System.out.println(aluguel);

			} else if (respostas == 'K') {

				System.out.println("pre�o da Km: ");
				double preco = sc.nextDouble();

				System.out.println("quilometragem inicial: ");
				double inicialKm = sc.nextDouble();

				System.out.println("quilometragem final: ");
				double finalKm = sc.nextDouble();

				AluguelVe�culo aluguel = new AluguelVe�culo(inicialKm, finalKm,
						new Ve�culo(placa, renavam, new Modelo(modelo, new Marca(marca)), cor, seguro, combust�vel));

				Servi�oLoca��o servico = new Servi�oLoca��o(preco, new TaxaServicoKm(), taxaSeguro);

				servico.EmitirFatura(aluguel);

				System.out.println(aluguel);

			} else {
				System.out.println("N�o v�lido");
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Valor digitado � inv�lido.");
		} catch (IllegalArgumentException e) {
			System.out.println("Valor digitado n�o est� dispon�vel para escolha.");
		} catch (ParseException e) {
			System.out.println("Formato digitado � inv�lido.");
		} catch (DominioException e) {
			System.out.println(e.getMessage());
		} finally {
		}
	}

}
