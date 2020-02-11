package utilitario;

public class Calculadora {
	
	public static final double PI = 3.14;

	public static double calcularCircuferencia(double raio) {

		return 2 * PI * raio;

	}

	public static double calculaVolume(double raio) {

		return 4.0 * PI * raio * raio * raio / 3;

	}

}