package entities;

public class Comentario {
	
	private String texto;

	public Comentario() {}
			
	public Comentario(String nome) {
		this.texto = nome;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Comentario [texto=" + texto + "]";
	}
}
