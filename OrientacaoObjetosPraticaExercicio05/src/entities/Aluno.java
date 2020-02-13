package entities;

import java.util.Locale;

public class Aluno {

	private String nome;

	float nota1, nota2, nota3, media;

	boolean promovido;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public void geraAprovacao() {

		Locale.setDefault(Locale.US);

		media = nota1 + nota2 + nota3;

		promovido = (media > 60) ? true : false;

	}

	public float calcularEsforcoFaltante() {

		if (media <= 60) {

			return 60 - media;

		} else {

			return 0.00f;

		}

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", media=" + media
				+ ", promovido=" + promovido + "]";
	}

}
