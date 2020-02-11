package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:10/02/2020
 * HORA:20:59
 * FINALIDADE DO PROGRAMA: CALCULAR O PERIMETRO, AREA E DIAGONAL DE UM RETANGULO QUE TERA SUA
 * LARGURA E ALTURA INFORMADOS PELO USUARIO
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Retangulo retangulo;

		Scanner dados;

		retangulo = new Retangulo();

		dados = new Scanner(System.in);

		do {

			System.out.println("Informe o valor da altura do ret�ngulo:");

			retangulo.setAltura(dados.nextDouble());

			System.out.println("Informe o valor da largura do ret�ngulo:");

			retangulo.setLargura(dados.nextDouble());

			if (retangulo.getAltura() == retangulo.getLargura()) {

				System.out.println("O ret�ngulo deve possuir valores de base e altura diferentes!");

			}

		} while (retangulo.getAltura() == retangulo.getLargura());

		retangulo.calculaArea();

		retangulo.calculaPerimetro();

		retangulo.calculaDiagonal();
		
		System.out.println(retangulo.toString());

		dados.close();

	}

}
