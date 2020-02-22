package entities;

public abstract class Imposto {

	private double valorImposto;

	private double impostoTotoalArrecadado;

	public Imposto() {

	}

	public Imposto(double valorImposto, double impostoTotoalArrecadado) {
		this.valorImposto = valorImposto;
		this.impostoTotoalArrecadado = impostoTotoalArrecadado;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public double getImpostoTotoalArrecadado() {
		return impostoTotoalArrecadado;
	}

	public void setImpostoTotoalArrecadado(double impostoTotoalArrecadado) {
		this.impostoTotoalArrecadado = impostoTotoalArrecadado;
	}

	public double calculaImposto() {

		return 0;

	}

	@Override
	public String toString() {
		return "Imposto [valorImposto=" + valorImposto + ", impostoTotoalArrecadado=" + impostoTotoalArrecadado + "]";
	}

}
