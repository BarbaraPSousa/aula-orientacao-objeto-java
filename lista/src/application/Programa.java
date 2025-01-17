package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*Lista*/	/*nome*/    /*Clase que comp intef*/
		List<String > list = new ArrayList<>(); /*N�o aceita tipos premitivos s� replecles*/
			
		/*Adicionando coisas na Lista*/
		  list.add("Maria");
		  list.add("Alex");
		  list.add("Bob");
		  list.add("Anna");
		  
		  /*Inserino novo elemento na lista*/
		  /*fun*/ /*posicao*/ /*o que quer coloca na lista*/ 
		  list.add(    2,      "Marco");
		  
		  /*Tamanho Lista*/
		  					/*func.*/
		 System.out.println(list.size());
		 		

		  
		  /*Percorrendo a lista com For EACH*/
		  /*TIPO list*/ /*nome*/ /*lista*/
		  for(String     x :      list) {
			  System.out.println(x);
		  }
		  
			System.out.println("****");

		  /*Removendo*/
		  /*fun.*/   /*argumento a ser removido*/
		 // list.remove(1); // pode se usar o nome ou a posi��o
		  
		  /*Removendo com Predicado*/
		  /*fun*/		/*nome */		/*O que deseja remover*/		
		  list.removeIf(x -> x.charAt(0) == 'M');
		
		  for(String     x :      list) {
			  System.out.println(x);
		  }
		  
		  System.out.println("***");
		  
		  /*Entratar a Posi��o de um Elemento*/
		  									   /*Fun.*/	   /*Nome*/
		  System.out.println("Index of Bob: " + list.indexOf("Bob"));
		  
		  /*Procurando elemento que n�o esta na lista*/
		                                        /*Fun.*/	 /*Nome*/
		  System.out.println("Index of Bob: " + list.indexOf("Marco"));
		  
		  System.out.println("****");
		  
		  /*Filtrando a lista*/
		  
		  /*Redeclarar nova lista*/ /*Nome*/ /*converte Str.*//*fun.*/  /*Predicado*/		   /*Conveter para Lista novamente*/
		  List<String>               result =   list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
		  
		  for(String x :  result) {
			  System.out.println(x);
		  }
		  
		  System.out.println("****");
		  
		  /*Encontrando Elemento com o Predicado A */
		/*Variavel*/ /*Nome V*/ /*comando */  /*filtro*/                    /*funcao*/    /*retorna null se n�o tiver o p�redicado*/
		  String      name =    list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
		  System.out.println(name);
		  
		  name =    list.stream().filter(x-> x.charAt(0) == 'j').findFirst().orElse(null);
		  System.out.println(name); // casos que n�o tenha na lista
		  
		  
		sc.close();

	}

}
