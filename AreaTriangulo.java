package Atividades;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		System.out.println("Calculo de �rea de um Tri�ngulo\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base do tri�ngulo:");
		double base = sc.nextDouble();
		
		System.out.println("Digite o tamanho da altura do tri�ngulo:");
		double altura = sc.nextDouble();
		
		double area = (base * altura)/2;
		
		System.out.printf("Um tri�ngulo com %.2f cm de base e %.2f cm de altura � igual a: %.2f cm�",base,altura,area);
		
		sc.close();
		
	}

}
