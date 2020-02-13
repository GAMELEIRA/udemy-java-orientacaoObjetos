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

		System.out.println("Informe o nome do funcionário:");

		funcionario.setNome(dados.nextLine());

		System.out.println("Informe o salário do funcionário:");

		funcionario.setSalarioBruto(dados.nextDouble());

		System.out.println("Informe o imposto que o funcionário paga:");

		funcionario.setImposto(dados.nextDouble());

		funcionario.calculaSalarioLiquido();

		System.out.printf("Nome: %s %nSalário Liquido: %.2f %n", funcionario.getNome(),
				funcionario.getSalarioLiquido());

		System.out.println("Informe a porcentagem:");

		porcentagem = dados.nextDouble();

		salarioPromocional = funcionario.getSalarioBruto() * (porcentagem / 100);

		System.out.println("Salário promocional:" + salarioPromocional + funcionario.getSalarioBruto());

		dados.close();

	}

}
