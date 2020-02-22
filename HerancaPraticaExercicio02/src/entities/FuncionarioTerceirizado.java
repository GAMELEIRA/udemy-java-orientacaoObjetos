package entities;

public class FuncionarioTerceirizado extends Funcionario {

	private double cobrancaAdicional;

	public FuncionarioTerceirizado() {
	}

	public FuncionarioTerceirizado(String nome, double hora, double valorPorHora, double cobrancaAdicional) {
		super(nome, hora, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}

	@Override
	public double realizarPagamento() {

		return super.realizarPagamento() + cobrancaAdicional * 1.1;
		

	}

	@Override
	public String toString() {

		return "FuncionarioTerceirizado [nome=" + super.getNome() + "]" + "[hora=" + super.getHora() + "]"
				+ "[valorPorHora" + getValorPorHora() + "]" + "[cobrancaAdicional=" + cobrancaAdicional + "]"
				+ "[pagamento=" + this.realizarPagamento() + "]";

	}

}
