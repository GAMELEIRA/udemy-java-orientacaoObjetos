package entities;

import entities.enums.Cor;

public class Retangulo extends Forma {

	private double altura;
	
	private double largura;
	
	public Retangulo() {}
	
	public Retangulo(Cor cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double area() {
	
		return altura * largura;
	
	}

}
