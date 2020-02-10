package entities;

public class Triangulo {

	private double altura;

	private double base;

	private double area;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calculaArea(double altura, double base) {

		this.area = altura * base / 2;

	}

}