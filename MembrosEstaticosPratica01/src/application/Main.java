package application;

import java.util.Locale;
import java.util.Scanner;

import utilitario.Calculadora;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:11/02/2020
 * HORA:16:35
 * FINALIDADE DO PROGRAMA:APRESENTAR O VALOR DE UMA CIRCUFERENCIAE E DO VOLUME DE UMA ESFERA
 * PARA UM RAIO INFORMADO PELO USUÁRIO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double raio, circuferencia, volume;

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Informe o valor do raio:");

		raio = dados.nextDouble();

		circuferencia = Calculadora.calcularCircuferencia(raio);

		volume = Calculadora.calculaVolume(raio);

		System.out.println("Circuferência: " + circuferencia + " Volume:" + volume);

		System.out.println("PI: " + Calculadora.PI);

		dados.close();

	}

}
