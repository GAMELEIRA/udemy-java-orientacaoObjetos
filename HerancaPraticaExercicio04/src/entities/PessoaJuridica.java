package entities;

public class PessoaJuridica extends Pessoa {

	private double quantidadeFuncionarios;

	public PessoaJuridica() {

	}

	public PessoaJuridica(double gastosComFuncionarios) {
		super();
		this.quantidadeFuncionarios = gastosComFuncionarios;
	}

	public PessoaJuridica(String nome, double rendaAnal, double gastosComFuncionarios) {
		super(nome, rendaAnal);
		this.quantidadeFuncionarios = gastosComFuncionarios;
	}

	public double getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(double gastosComFuncionarios) {
		this.quantidadeFuncionarios = gastosComFuncionarios;
	}

	@Override
	public double pagarImposto() {

		ImpostoPessoaJuridica imposto;

		double impostoPago;

		imposto = new ImpostoPessoaJuridica();

		return impostoPago = imposto.calculaImposto(getRendaAnual(), getQuantidadeFuncionarios());

	}

	@Override
	public String toString() {
		return "PessoaJuridica [quantidadeFuncionarios=" + quantidadeFuncionarios + ", getQuantidadeFuncionarios()="
				+ getQuantidadeFuncionarios() + ", pagarImposto()=" + pagarImposto() + ", getNome()=" + getNome()
				+ ", getRendaAnual()=" + getRendaAnual() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
