package entities;

public class Retangulo {

	private double largura;

	private double altura;

	private double area;

	private double perimetro;

	private double diagonal;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public void calculaArea() {

		setArea(getAltura() * getLargura());

	}

	public void calculaPerimetro() {

		setPerimetro(2 * (getAltura() + getLargura()));

	}

	public void calculaDiagonal() {

		setDiagonal(Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getLargura(), 2)));

	}

	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro
				+ ", diagonal=" + diagonal + "]";
	}

}
