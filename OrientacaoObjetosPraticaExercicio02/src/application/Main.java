package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

/*
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:10/02/2020
 * HORA:18:51
 * FINALIDADE DO PROGRAMA: SIMULAR O ESTOQUE DE UM PRODUTO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		char decisao;

		Scanner dados;

		Produto produto;

		produto = new Produto();

		dados = new Scanner(System.in);

			System.out.println("Informe o nome do produto:");

			produto.setNome(dados.nextLine());

			System.out.println("Informe o preço do produto:");

			produto.setPreco(dados.nextDouble());

			System.out.println("Informe a quantidade de " + produto.getNome() + ":");

			produto.setQuantidade(dados.nextInt());
			
			

			do {
			
			System.out.printf("Nome do produto: %s,%nPreco do produto: %.2f,%nQuantidade em estoque: %d %n",
					produto.getNome(), produto.getPreco(), produto.getQuantidade());

			System.out.println("Informe uma entrada ou saída no estoque:");

			produto.movimentarEstoque(dados.nextInt());

			System.out.println("Deseja sair do programa? Para sair s. Para repetir n.");

			decisao = dados.next().charAt(0);

		} while (decisao == 'n');

		dados.close();

	}

}