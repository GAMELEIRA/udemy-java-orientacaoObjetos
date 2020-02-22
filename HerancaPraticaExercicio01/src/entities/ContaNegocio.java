package entities;

public final class ContaNegocio extends Conta {

	private double limite;

	public ContaNegocio() {
		super();
	}

	public ContaNegocio(int numeroConta, String titular, double saldo, double limite) {
		super(numeroConta, titular, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void emprestarDinheiro(double valorEmprestimo) {

		if (limite <= valorEmprestimo) {

			acrescentaSaldo(valorEmprestimo);
		}
	}
	
	@Override
	public final void realizaSaque(double valor) {
		
		super.realizaSaque(valor);
		
		saldo -= 2.0;
		
	}

}
