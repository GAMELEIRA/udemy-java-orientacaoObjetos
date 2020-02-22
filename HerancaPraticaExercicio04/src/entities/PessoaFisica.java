package entities;

public class PessoaFisica extends Pessoa {

	private double gastosComSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(double gastosComSaude) {
		super();
		this.gastosComSaude = gastosComSaude;
	}

	public PessoaFisica(String nome, double rendaAnal, double gastosComSaude) {
		super(nome, rendaAnal);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double pagarImposto() {

		ImpostoPessoaFisica imposto;

		double impostoPago;

		imposto = new ImpostoPessoaFisica();

		return impostoPago = imposto.calculaImposto(getRendaAnual(), getGastosComSaude());

	}

	@Override
	public String toString() {
		return "PessoaFisica [gastosComSaude=" + gastosComSaude + ", getGastosComSaude()=" + getGastosComSaude()
				+ ", pagarImposto()=" + pagarImposto() + ", getNome()=" + getNome() + ", getRendaAnual()="
				+ getRendaAnual() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}