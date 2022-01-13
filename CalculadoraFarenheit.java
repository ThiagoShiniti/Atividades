package Atividades;

import java.util.Scanner;

public class CalculadoraFarenheit {

	public static void main(String[] args) {
		System.out.println("Conversor de Farenheit__________________________________");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite o valor em Celcius:");
		int temp1 = sc.nextInt();
		
		int conversor = (temp1 * 9/5) + 32;
		
		System.out.printf("%d° em Celcius é: %d° Farenheit", temp1, conversor);
		
		sc.close();
	}
}
