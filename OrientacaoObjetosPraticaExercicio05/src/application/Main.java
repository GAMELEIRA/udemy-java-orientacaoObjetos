package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS DATA:13/02/2020 HORA:16:29 FINALIDADE DO
 * PROGRAMA: CAPTURAR A INFORMAÇÃO DE UM ESTUDANTE, CALCULAR SUA MEDIA E O
 * ESFORCO NECESSARIO PARA PASSAR DE ANO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner dados;

		Aluno aluno;

		aluno = new Aluno();

		dados = new Scanner(System.in);

		System.out.println("Informe o nome do aluno:");

		aluno.setNome(dados.nextLine());

		for (int i = 1; i <= 3; i++) {

			System.out.println("Informe a nota " + i);

			if (i == 1) {

				aluno.setNota1(dados.nextFloat());

			} else if (i == 2) {

				aluno.setNota2(dados.nextFloat());

			} else {

				aluno.setNota3(dados.nextFloat());

			}

		}
		
		aluno.geraAprovacao();
		
		System.out.println(aluno.toString());

		System.out.println("Esforço necessário: " + aluno.calcularEsforcoFaltante());
		
		dados.close();
	}

}
