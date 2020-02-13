package entities;

public class Funcionario {

	private String nome;

	private double salarioBruto;

	private double salarioLiquido;

	private double imposto;

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void calculaSalarioLiquido() {
		
		this.salarioLiquido = salarioBruto - imposto;

	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salarioBruto=" + salarioBruto + ", salarioLiquido=" + salarioLiquido
				+ ", imposto=" + imposto + "]";
	}

}
