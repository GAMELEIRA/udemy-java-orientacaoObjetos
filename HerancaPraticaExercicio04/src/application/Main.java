package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:22/02/2020
 * HORA:12:00
 * FINALIDADE DO PROGRAMA:REALIZAR O CADASTRO DE PESSOAS FISICAS E JURIDICAS E CALCULAR IMPOSTOS
 */

public class Main {

	public static void main(String[] args) {

		Scanner dadosString, dadosNumericos;

		List<Pessoa> pessoa;

		String nome;

		double rendaAnual, gastosComFuncionarios, gastosComSaude, totalImpostos = 0;

		char fj;

		long contribuintes;

		dadosNumericos = new Scanner(System.in);

		dadosString = new Scanner(System.in);

		pessoa = new ArrayList<Pessoa>();

		System.out.println("Informe a quantidade de contribuintes:");

		contribuintes = dadosNumericos.nextLong();

		for (int i = 0; i < contribuintes; i++) {

			do {

				System.out.println("É pessoa fisica(f) ou pessoa juridica(j)?");

				fj = dadosString.next().charAt(0);
				
				dadosString.nextLine();

				System.out.println("Informe o nome da pessoa:");

				nome = dadosString.nextLine();

				System.out.println("Informe sua renda anual:");

				rendaAnual = dadosNumericos.nextDouble();

				if (fj == 'f') {

					System.out.println("Informe o gastos com saúde:");

					gastosComSaude = dadosNumericos.nextDouble();

					pessoa.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));

				} else if (fj == 'j') {

					System.out.println("Informe os gastos com funcionários:");

					gastosComFuncionarios = dadosNumericos.nextDouble();

					pessoa.add(new PessoaJuridica(nome, rendaAnual, gastosComFuncionarios));

				}

			} while (!(fj == 'j' || fj == 'f'));

		}
		

		for (Pessoa a : pessoa) {

			System.out.println(a.toString());
			
			totalImpostos += a.pagarImposto();
		
		}
		
		System.out.println("Total a ser pago: " + totalImpostos);
			
	}
}
