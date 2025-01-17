/*Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e
quantidade no estoque). Em seguida:
� Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no
estoque)
� Realizar uma entrada no estoque e mostrar novamente os dados do produto
� Realizar uma sa�da no estoque e mostrar novamente os dados do produto
quantidade no estoque). Em seguida:
� Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no
estoque)
� Realizar uma entrada no estoque e mostrar novamente os dados do produto
� Realizar uma sa�da no estoque e mostrar novamente os dados do produto*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.nome = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity: ");
		prod.quantity = sc.nextInt();
		
		System.out.println("Products data: " + prod);
		System.out.println();
		
		System.out.print("Entre the number of product to be in stoc: ");
		int quantity = sc.nextInt();
		prod.addProduct(quantity);
		System.out.println();
		System.out.print("Enter product data: " + prod);
		System.out.println();
		System.out.print("Entre the number of product to be remove from stoc: ");
		quantity = sc.nextInt();
		prod.removeProdut(quantity);
		System.out.print("Enter product data: " + prod);
		
		
		
	
		sc.close();

	}

}
