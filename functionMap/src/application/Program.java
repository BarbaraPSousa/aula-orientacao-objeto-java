/*Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); instanc intef
		//List<String> names = list.stream().map(Product:: staticUpperCaseName).collect(Collectors.toList()); metodo estatico
		//List<String> names = list.stream().map(Product:: nonStsticUpperCaseName).collect(Collectors.toList()); metodo n�o estatico
		
		/*Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList()); func declarada */
		
		List<String> names = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());//exp inline
		
		names.forEach(System.out:: println);//impimindo na tela
	}
}
