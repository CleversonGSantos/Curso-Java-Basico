package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double numPrimo, max, divisor = 2, resultado = 0;
		boolean fim = true;
		
		
		System.out.println("Informe um número primo ");
		numPrimo = scan.nextDouble();
		max = numPrimo /2;
		
		do {
			resultado = numPrimo % divisor;
			if (divisor > max) {
				fim = false;
				System.out.println("É um número primo");
			}
			if (resultado == 0) {
				System.out.println("Não é um número primo");
				System.out.println("É divisível por " + divisor);
				fim = false;
			}
			divisor++;
		} while (fim);
	}

}
