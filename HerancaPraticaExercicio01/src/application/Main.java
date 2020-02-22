package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:22/02/2020 
 * HORA:15:47
 * FINALIDADE DO PROGRAMA:SOLICITAR DADOS DE UM USUARIO PARA CADASTRAR UMA CONTA COMUM,
 * POUPANCA OU DE NEGOCIOS E MANIPULAR SEUS DADOS 
 */

import entities.Conta;
import entities.ContaNegocio;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Conta conta;

		ContaNegocio contaNeg;

		conta = new Conta(1001, "Alex", 0.0);

		contaNeg = new ContaNegocio(1002, "Maria", 0.0, 500);

         //UPCASTING
		Conta acc1 = contaNeg;
		
		Conta acc2 = new ContaNegocio(1003, "Bob", 0.0, 200.0);
		
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		Conta acc6 = new Conta(1006, "Alex", 1000.0);
		
		Conta acc7 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		
		acc7.realizaSaque(200);
		
		acc6.realizaSaque(200.0);
		
		Conta acc8 = new ContaNegocio(1008, "Gabriel", 1000.0, 500.0);
		
		acc8.realizaSaque(200.0);
		
		System.out.println(acc8.getSaldo());
		
		System.out.println(acc7.getSaldo());
		
		System.out.println(acc6.getSaldo());
		
		//DOWCASTING
		ContaNegocio acc4 = (ContaNegocio) acc2;
		
		//ContaNegocio acc5 = (ContaNegocio) acc3; //NAO PERMITIDO

		if (acc3 instanceof ContaNegocio){
			
			ContaNegocio acc5 = (ContaNegocio) acc3;
		
			acc5.emprestarDinheiro(200.0);
			
			System.out.println("Emprestimo!");
			
		}
		
		if(acc3 instanceof ContaPoupanca) {
			
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			
			acc5.acrescentaSaldo(1);
			
			System.out.println("Atualizado");
			
		}
			
		
	}

}
