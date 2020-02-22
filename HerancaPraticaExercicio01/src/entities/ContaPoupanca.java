package entities;

public final class ContaPoupanca extends Conta {

	private double taxaJuro;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numeroConta, String titular, double saldo, double taxaJuro) {
		super(numeroConta, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void atualizaTaxaJuro() {
		
		saldo += saldo * taxaJuro;
		
	}
	
	@Override
	public final void realizaSaque(double valor) {
		
		saldo -= valor;
		
	}
}
