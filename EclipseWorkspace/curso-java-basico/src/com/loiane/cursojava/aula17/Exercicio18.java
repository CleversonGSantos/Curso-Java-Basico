package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double numPrimo, max, divisor = 2, resultado = 0;
		boolean fim = true;
		
		
		System.out.println("Informe um n�mero primo ");
		numPrimo = scan.nextDouble();
		max = numPrimo /2;
		
		do {
			resultado = numPrimo % divisor;
			if (divisor > max) {
				fim = false;
				System.out.println("� um n�mero primo");
			}
			if (resultado == 0) {
				System.out.println("N�o � um n�mero primo");
				System.out.println("� divis�vel por " + divisor);
				fim = false;
			}
			divisor++;
		} while (fim);
	}

}
