package entities;

public class ImpostoPessoaFisica extends Imposto {

	public double calculaImposto(double rendaAnual, double gastosComSaude) {

		if (rendaAnual < 20000) {

			return rendaAnual * 0.15 - gastosComSaude * 0.50;

		} else if (rendaAnual > 20000) {

			return rendaAnual * 0.25 - gastosComSaude * 0.50;

		}

		return 0;
			
	}

	@Override
	public String toString() {
		return "ImpostoPessoaFisica [getValorImposto()=" + getValorImposto() + ", getImpostoTotoalArrecadado()="
				+ getImpostoTotoalArrecadado() + ", calculaImposto()=" + calculaImposto() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
