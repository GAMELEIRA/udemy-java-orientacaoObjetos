package entities;

public class Conta {
	
	private int numeroConta;
	
	private String titular;
	
	protected double saldo;
	
	public Conta() {}

	public Conta(int numeroConta, String titular, double saldo) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void realizaSaque(double valorSaque) {
		
		saldo -=valorSaque + 5.0;
		
	}
	
	public void acrescentaSaldo(double valor) {
		
		saldo += valor;
	
	}
}

