package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:22/02/2020 
 * HORA:17:08
 * FINALIDADE DO PROGRAMA:CALCULAR AS AREAS DAS FIGURAS GEOMATRICAS
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Forma> forma;

		double altura, largura, raio;

		int quantidadeFiguras;

		char rc;

		Cor corFigura;

		Scanner dadosNumericos, dadosString;

		forma = new ArrayList<Forma>();

		dadosNumericos = new Scanner(System.in);

		dadosString = new Scanner(System.in);

		System.out.println("Informe a quantidade de figuras:");

		quantidadeFiguras = dadosNumericos.nextInt();

		for (int i = 1; i <= quantidadeFiguras; i++) {

			System.out.println("Informe a figura:" + i);

			System.out.println("Retangulo ou circulo (r/c)");

			rc = dadosString.next().charAt(0);

			System.out.println("Informe a cor da figura: (BLACK/BLUE/RED)");

			corFigura = Cor.valueOf(dadosString.next());

			if (rc == 'r') {

				System.out.println("Altura:");

				altura = dadosNumericos.nextDouble();

				System.out.println("Largura:");

				largura = dadosNumericos.nextDouble();

				forma.add(new Retangulo(corFigura, altura, largura));

			} else {

				System.out.println("Informe o raio do circulo:");

				raio = dadosNumericos.nextDouble();
				
				forma.add(new Circulo(corFigura, raio));
				
			}

		}
		
		System.out.println();
		
		System.out.println("Area das formas:");
		
		for(Forma f : forma) {
			
			System.out.println(f.area());
			
		}

		dadosString.close();

		dadosNumericos.close();

	}

}
