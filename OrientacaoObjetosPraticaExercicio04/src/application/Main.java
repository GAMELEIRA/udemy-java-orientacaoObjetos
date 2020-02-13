package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:12/02/2020
 * HORA:22:08
 * FINALIDADE DO PROGRAMA: COLETA INFORMACOES DE UM FUNCIONARIO E CALCULA SALARIO LIQUIDO E
 * PROMOCIONAL
 */

public class Main {

	public static void main(String[] args) {

		double salarioPromocional;

		Locale.setDefault(Locale.US);

		double porcentagem;

		Scanner dados;

		Funcionario funcionario;

		funcionario = new Funcionario();

		dados = new Scanner(System.in);

		System.out.println("Informe o nome do funcion�rio:");

		funcionario.setNome(dados.nextLine());

		System.out.println("Informe o sal�rio do funcion�rio:");

		funcionario.setSalarioBruto(dados.nextDouble());

		System.out.println("Informe o imposto que o funcion�rio paga:");

		funcionario.setImposto(dados.nextDouble());

		funcionario.calculaSalarioLiquido();

		System.out.printf("Nome: %s %nSal�rio Liquido: %.2f %n", funcionario.getNome(),
				funcionario.getSalarioLiquido());

		System.out.println("Informe a porcentagem:");

		porcentagem = dados.nextDouble();

		salarioPromocional = funcionario.getSalarioBruto() * (porcentagem / 100);

		System.out.println("Sal�rio promocional:" + salarioPromocional + funcionario.getSalarioBruto());

		dados.close();

	}

}
