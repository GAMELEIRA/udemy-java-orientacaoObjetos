package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:17/02/2020
 * HORA:20:12
 * FINALIDADE DO PROGRAMA:SIMULAR A ENTRADA DE DADOS DE UM FUNCIONÁRIO E CALCULAR O SEU GRANHO 
 * MENSAL E ANUAL CONFORME QUANTIDADE DE CONTRATOS INFORMADOS PELO USUARIO
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalho;
import entities.enums.NivelTrabalho;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner dados;

		SimpleDateFormat sdf;
		
		Trabalho trabalho;

		String departamento, funcao, nome, nivel;

		Departamento departament;

		double salario;

		int quantidadeContratos;
		
		sdf = new SimpleDateFormat("dd/MM/yyyy");

		trabalho = new Trabalho();

		dados = new Scanner(System.in);

		System.out.println("Informe o departamento em que você trabalha:");

		departamento = dados.nextLine();

		System.out.println("Informe o nome");

		nome = dados.nextLine();

		System.out.println("Informe o seu nivel: ");

		nivel = dados.nextLine();

		System.out.println("Informe sua base de salario ");

		salario = dados.nextDouble();

		departament = new Departamento(departamento);

		trabalho = new Trabalho(nome, NivelTrabalho.valueOf(nivel), salario, departament);

		System.out.println("Quantos contratos ele irá ter?");

		quantidadeContratos = dados.nextInt();

		for (int i = 1; i <= quantidadeContratos; i++) {

			System.out.println("Informe os dados do contrato " + i);
			
			System.out.print("Data (dd/MM/yyyy");
			
			Date dataContrado = sdf.parse(dados.next());
			
			System.out.println("Informe o valor recebido por hora: ");
			
			double valorPorHora = dados.nextDouble();
			
			System.out.println("Duracao horas: ");
			
			int horas = dados.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrado, valorPorHora, horas);
			
			trabalho.adicionaContrato(contrato);
			
		}
	
		System.out.println("");
		
		System.out.println("Informe o mês:");
		
		dados.nextLine();
		
		String mesAno = dados.nextLine();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Name: " + trabalho.getNome());
		
		System.out.println("Departamento: " + trabalho.getDepartamento().getNome());
		
		System.out.println("Quanto ganhou este mes:" + mesAno + ": " + trabalho.calculaQuantoGanhou(mes, ano));
		
		dados.close();

	}

}
