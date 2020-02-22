package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:16/02/2020
 * HORA:14:30
 * FINALIDADE DO PROGRAMA: APRENDER A TRABALHAR COM DATAS
 */

public class Main {

	public static void main(String[]args) throws ParseException {
		
		Calendar cal;
		
		SimpleDateFormat sdf1, sdf2;
		
		Date y1, y2, x1;
		
		//PEGA O VALOR ATUAL DE DATA
		cal = Calendar.getInstance();
	
		System.out.println();
		
		//FORMATO DE DATA DIA, MES E ANO
		sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		//FORMATO DE DATA DIA, MES E ANO HORA, MINUTO E SEGUNDO
		sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//INSTANCIA A DATA COM A DATA ATUAL
		x1 = new Date();
		
		//CONVERTE UM TIPO STRING NO FORMATO DE DATA ESPECIFICADO NA INSTANCIA SIMPLEDATEFORMAT
		y1 = sdf1.parse("16/02/2020");
		
		System.out.println(y1);
	
		y2 = sdf2.parse("16/02/2020 15:42:07");
	
		cal.setTime(y2);
		
		cal.add(Calendar.HOUR_OF_DAY, 3);
		
		y2 = cal.getTime();
		
		System.out.println(sdf2.format(y1));
		
		System.out.println(y2);
		
		//CONVERTE PARA O FORMATO SIMPLEDATEFORMAT
		System.out.println(sdf1.format(x1));
		
	}
	
}
