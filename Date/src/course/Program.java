package course;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		/*Trabalhando com Data*/
		
		/*decl obj*/     /*variavel*/					  /*inf String format*/
		SimpleDateFormat   sdf1 =    new SimpleDateFormat("dd/MM/yyyy");//Os "MM" sepre em caixa alta
		SimpleDateFormat   sdf2 =    new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//variavel com dia mes e ano e minutoe e segundo
		SimpleDateFormat   sdf3 =    new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		java.util.Date y1 =  sdf1.parse("04/05/2021"); // parse recebe um dado no formato String e converte respeitando o formato declarado.
		java.util.Date y2 = sdf2.parse("04/05/2021 16:02:00");
		java.util.Date y3 = Date.from(Instant.parse("2020-05-04T17:46:03Z"));
		
		/*Estanciando data com hora atual*/
		
        /*Class*/   /*Variavel */	/*intancia da fun.*/	 
		Date          x1 =      new Date(System.currentTimeMillis());/*pega o instante do sistema e converte para mili segundo*/
		Date 		  x2 = 		new Date(0);
		Date 		  x3 =      new Date(1000L * 60L * 60L *5L); //Multiplica mil por 60 2x + 5horas, o "L" que dizer que Long
		
		
		/*Imprimo com data atual*/
		
		System.out.println("x1: " + sdf2.format(x1)); 
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("**************");
		
		/*Imprimo no formato padrao do Java*/
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("**************");
		
		/*Imprimo no formato padr�o do Java*/
							/*Variavel tem uma opera��o de formata��o*/
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("**************");
		
		/*Imprimindo com ISO */
		System.out.println("x1: " + sdf3.format(x1)); 
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

		/*Impimindo com a formata��o do Java*/
		System.out.println("**************");
		System.out.println("x1: " + (x1)); 
		System.out.println("x2: " + (x2));
		System.out.println("x3: " + (x3));
		System.out.println("y1: " + (y1));
		System.out.println("y2: " + (y2));
		System.out.println("y3: " + (y3));
		
		
	}

}
