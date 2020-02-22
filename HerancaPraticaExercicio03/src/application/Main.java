package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:20/02/2020 HORA:16:38 FINALIDADE DO
 * PROGRAMA:
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner dadosNumericos, dadosString;

		long quantidadeProdutos;

		char cui;

		String nome, dataFabricacao;

		double preco, taxaAlfandega;

		List<Produto> produtos;

		dadosString = new Scanner(System.in);

		produtos = new ArrayList<Produto>();

		dadosNumericos = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos que serão registrados:");

		quantidadeProdutos = dadosNumericos.nextLong();

		for (int i = 0; i < quantidadeProdutos; i++) {

			int cont;

			do {

				System.out.println("Informe se o produto é comum(c), usado(u) e importado(i):");

				cui = dadosString.next().charAt(0);

				dadosString.nextLine();

				cont = (cui == 'c' || cui == 'u' || cui == 'i') ? 1 : 0;

			} while (cont == 0);

			System.out.println("Informe o nome:");

			nome = dadosString.nextLine();

			System.out.println("Informe o preço:");

			preco = dadosNumericos.nextDouble();

			if (cui == 'u') {

				System.out.println("Informe a data: ");

				dataFabricacao = dadosString.nextLine();

				produtos.add(new ProdutoUsado(nome, preco, converteData(dataFabricacao)));

			} else if (cui == 'i') {

				System.out.println("Informe a taxa alfandegaria:");

				taxaAlfandega = dadosNumericos.nextDouble();

				produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));

			} else {

				produtos.add(new Produto(nome, preco));

			}

		}

		for (Produto a : produtos) {

			System.out.println(a.toString());

		}

	}

	public static Date converteData(String data) {

		SimpleDateFormat dataFormatacao;

		Date dataFormatada = null;

		dataFormatacao = new SimpleDateFormat("dd/MM/yyyy");

		try {

			dataFormatada = dataFormatacao.parse(data);

		} catch (ParseException e) {

			System.out.println("Data inválida!");

		}

		return dataFormatada;

	}

}
