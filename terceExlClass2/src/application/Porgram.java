/*Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e
quantidade no estoque). Em seguida:
� Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no
estoque)
� Realizar uma entrada no estoque e mostrar novamente os dados do produto
� Realizar uma sa�da no estoque e mostrar novamente os dados do produto*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Porgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.print("Upedate price: " + product.getPrice());
		System.out.println();
		
		System.out.println();
		System.out.print("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.print("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.print("Updated data: " + product);
		sc.close();
	}
}