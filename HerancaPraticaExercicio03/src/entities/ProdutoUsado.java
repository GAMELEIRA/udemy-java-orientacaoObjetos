package entities;

import java.util.Date;

public final class ProdutoUsado extends Produto {

	private Date dataFabricacao;

	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String toString() {
		return "ProdutoUsado [dataFabricacao=" + dataFabricacao + " nome=" + super.getNome() + " preco="
				+ super.getPreco() + "]";
	}

}
