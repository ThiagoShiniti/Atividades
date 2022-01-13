package Atividades;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		System.out.println("Calcule seu IMC __________");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nQual o seu peso?");
		double peso = sc.nextDouble();
		
		System.out.println("\nQual a sua altura?");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("\nSeu IMC é: %.2s", imc);
				
		sc.close();
	}

}
