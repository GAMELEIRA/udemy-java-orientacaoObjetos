package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

/*
 * AUTOR:GABRIEL GAEMELEIRA DOS SANTOS
 * DATA:10/02/2020
 * HORA:14:00
 * FINALIDADE DO PROGRAMA:MOSTRAR QUAL TRIANGULO POSSUI MAIOR AREA
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double altura, base;

		Triangulo a, b;

		Scanner dados;

		a = new Triangulo();

		b = new Triangulo();

		dados = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {

			do {

				System.out.println("Informe o valor da base do tri�ngulo " + i + ":");

				base = dados.nextDouble();

				System.out.println("Informe o valor da altura do tri�ngulo: " + i + ":");

				altura = dados.nextDouble();

			} while (altura == 0 || base == 0);

			if (i == 1) {

				a.calculaArea(altura, base);

			} else {

				b.calculaArea(altura, base);

			}

		}

		if (a.getArea() > b.getArea()) {

			System.out.println("Area do tri�ngulo 1: " + a.getArea());

			System.out.println("Area do tri�ngulo 2: " + b.getArea());

			System.out.println("O tri�ngulo 1 t�m a �rea maior.");

		} else if (b.getArea() > a.getArea()) {

			System.out.println("Area do tri�ngulo 1: " + a.getArea());

			System.out.println("Area do tri�ngulo 2: " + b.getArea());

			System.out.println("O tri�ngulo 2 t�m a �rea maior.");

		} else {

			System.out.println("Area do tri�ngulo 1: " + a.getArea());

			System.out.println("Area do tri�ngulo 2: " + b.getArea());

			System.out.println("Os dois possuem �reas iguais.");

		}

		dados.close();

	}

}
