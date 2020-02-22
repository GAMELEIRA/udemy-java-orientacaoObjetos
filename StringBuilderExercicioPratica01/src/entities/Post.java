package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	
	private String titulo;
	
	private String conteudo;
	
	private Integer lilkes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {}

	public Post(Date momento, String titulo, String conteudo, Integer lilkes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.lilkes = lilkes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLilkes() {
		return lilkes;
	}

	public void setLilkes(Integer lilkes) {
		this.lilkes = lilkes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void adicionaComentario(Comentario comentario) {
		
		this.comentarios.add(comentario);
		
	}
	
	public void removeComentario(Comentario comentario) {
		
		
		this.comentarios.remove(comentario);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb;
		
		sb = new StringBuilder();
		
		sb.append(getTitulo() + "\n");
		
		sb.append(getLilkes() + "\n");
		
		sb.append("- LIKES -");
		
		sb.append(sdf.format(momento) + "\n");
		
		sb.append("Comentários: \n");
		
		for(Comentario c : comentarios) {
			
			sb.append(c.getTexto());
			
		}
		
		return sb.toString();
		
	}


}
