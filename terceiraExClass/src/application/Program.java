/*Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
possui a maior �rea.
A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a
seguinte (f�rmula de Heron):*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre radius: ");
		
		double radius = sc.nextDouble();
		
		double c = Triangle.circumference(radius);
		
		double v = Triangle.volume(radius);
		
		System.out.printf("Circumfrence: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI voalue:: %.2f%n", Triangle.PI);
	
		
		sc.close();

	}
	
}
