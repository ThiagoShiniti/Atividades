package Atividades;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	//Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) 
	// utilizando a f�rmula de Bhaskara. 
	// Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.println("\nDigite o valor de a:");
		int a = sc.nextInt();
		
		System.out.println("\nDigite o valor de b:");
		int b = sc.nextInt();
		
		System.out.println("\nDigite o valor de c:");
		int c = sc.nextInt();
	
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta �:" + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
		
		sc.close();
		
		
	}

			
}
