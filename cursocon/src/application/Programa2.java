/*Fazer um programa para ler um n�mero inteiro N e os dados (nome e
pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o pre�o m�dio dos produtos.*/


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa2 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; // criando vetores com a class
		
		for(int i = 0; i< vect.length ; i++) { // percorrendo todos os vetores da classe
			sc.nextLine(); // consumir quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); // aponta os produtos criado na classe
		}
		double soma = 0.0;
		for(int i = 0; i< vect.length ; i++) { // fazendo a soma
			soma += vect[i].getPrice();
		}
		double media = soma / vect.length; // vect.length quer dizer a contidade de elemento do vetor
		
		System.out.printf("AVERAGE PRICE = %.2f%n", media);		
		
		sc.close();
	}
}
