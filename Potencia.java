package Atividades;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		
		System.out.println("Potencia elevada ao quadrado² e ao cubo³\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		double num = sc.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("O valor de %.2f ao quadrado é %.2f e ao cubo é %.2f", num, quadrado, cubo);
		
		sc.close();
		
		
	}

}
