package Atividades;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		System.out.println("Calculo de área de um Triângulo\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base do triângulo:");
		double base = sc.nextDouble();
		
		System.out.println("Digite o tamanho da altura do triângulo:");
		double altura = sc.nextDouble();
		
		double area = (base * altura)/2;
		
		System.out.printf("Um triângulo com %.2f cm de base e %.2f cm de altura é igual a: %.2f cm²",base,altura,area);
		
		sc.close();
		
	}

}
