package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:22/02/2020
 * HORA:15:58
 * FINALIDADE DO PROGRAMA:CADASTRAR FUNCIONARIOS E CALCULAR SEUS RESPECTIVOS SALARIOS
 * PARA AQUELES QUE SAO TERCEIROS OU COMUNS
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Funcionario func;

		List<Funcionario> funcionario;

		Scanner dadosString, dadosNumericos;

		String nome;

		double valorPorHora, hora, adicionalParaTerceiro;

		int quantidadeFuncionarios;

		char sn;

		dadosString = new Scanner(System.in);

		dadosNumericos = new Scanner(System.in);

		funcionario = new ArrayList<Funcionario>();

		System.out.println("Informe a quantidade de funcionários:");

		quantidadeFuncionarios = dadosNumericos.nextInt();

		for (int i = 1; i <= quantidadeFuncionarios; i++) {

			System.out.println("Funcionário " + i + " informações:");

			System.out.println("Funcionário é terceirizado? (y/n)");

			sn = dadosString.next().charAt(0);
			
			dadosString.nextLine();

			System.out.println("Informe o nome: ");

			nome = dadosString.nextLine();

			System.out.println("Informe a quantidade de horas trabalhadas:");

			hora = dadosNumericos.nextDouble();

			System.out.println("Informe o valor ganho por hora:");

			valorPorHora = dadosNumericos.nextDouble();

			if (sn == 'y') {

				System.out.println("Valor adicional para funcionário terceirizado:");

				adicionalParaTerceiro = dadosNumericos.nextDouble();

				func = new FuncionarioTerceirizado(nome, hora, valorPorHora, adicionalParaTerceiro);

				func.realizarPagamento();
				
				funcionario.add(func);

			} else {

				func = new Funcionario(nome, hora, valorPorHora);

				func.realizarPagamento();
				
				funcionario.add(func);

			}

		}

		System.out.println("");
		
		System.out.println("Pagamento:");
		
		for(Funcionario f: funcionario) {
			
			System.out.println(f.toString());
			
		}
		
		dadosNumericos.close();

		dadosString.close();

	}

}
