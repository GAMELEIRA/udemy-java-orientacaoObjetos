package application;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:22/02/2020
 * HORA:17:02
 * FINALIDADE DO PROGRAMA:REALIZAR COMENTARIOS COM INFORMACOES DE UM POST
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class Main {

	public static void main(String[]args) throws ParseException {
		
		Comentario c1, c2;
		
		Post post;
		
		SimpleDateFormat sdf;
		
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		c1 = new Comentario("Passeando por ai...");
		
		c2 = new Comentario("Eu te amo!");
		
		post = new Post(sdf.parse("21/06/2018 13:05:44"),"Conhecendo um novo amor.", "Será que encontrei meu amor na faculdade?", 12);
		
		post.adicionaComentario(c1);

		post.adicionaComentario(c2);
		
		System.out.println(c1);
		
		System.out.println(c2);
			
		System.out.println(post);
		
	}
	
}
