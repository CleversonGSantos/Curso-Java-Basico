package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int expoente;
		double base, resultado;
		
		System.out.println("Informe a base");
		base = scan.nextDouble();
		
		System.out.println("Informe a expoente");
		expoente = scan.nextInt();
		
		resultado = base;
		
		for (int i = 1; i <= expoente ; i++ ) {
			resultado = resultado * base;
		}
		System.out.println("Resultado: " + resultado);
	}

}
