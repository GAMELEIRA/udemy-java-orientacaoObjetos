package entities;

public final class ProdutoImportado extends Produto {

	private double taxaAlfandega;

	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double calcularPrecoProdutoComAlfandega() {

		return super.getPreco() + this.taxaAlfandega;

	}

	@Override
	public String toString() {

		return "ProdutoImportado [nome="+ super.getNome() + " preco="
				+ this.calcularPrecoProdutoComAlfandega() +" taxaAlfandega=" + taxaAlfandega +"]";

	}

}
