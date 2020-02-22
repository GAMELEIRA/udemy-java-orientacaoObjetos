package entities;

public class Funcionario {

	private String nome;

	private double hora;

	private double valorPorHora;
	
	public Funcionario() {
	}

	public Funcionario(String nome, double hora, double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double realizarPagamento() {

		return hora * valorPorHora;

	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", hora=" + hora + ", valorPorHora=" + valorPorHora + "]" + "[pagamento="+this.realizarPagamento()+"]";
	}
}
