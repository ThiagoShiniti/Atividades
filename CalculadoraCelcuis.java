package Atividades;

import java.util.Scanner;

public class CalculadoraCelcuis {

	public static void main(String[] args) {
		System.out.println("Conversor de Celcius__________________________________");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite o valor em Farenheit:");
		int temp1 = sc.nextInt();
		
		int conversor = (temp1 - 32) * 5/9;
		
		System.out.printf("%d° em Celcius é: %d°", temp1, conversor);
		
		sc.close();
	}
}
