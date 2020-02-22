package entities;

public class ImpostoPessoaJuridica extends Imposto {

	public double calculaImposto(double rendaAnual, double quantidadeFuncionarios) {

		if (quantidadeFuncionarios > 10) {

			return rendaAnual * 0.14;

		}

		return rendaAnual * 0.16;

	}

	@Override
	public String toString() {
		return "ImpostoPessoaJuridica [getValorImposto()=" + getValorImposto() + ", getImpostoTotoalArrecadado()="
				+ getImpostoTotoalArrecadado() + ", calculaImposto()=" + calculaImposto() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
