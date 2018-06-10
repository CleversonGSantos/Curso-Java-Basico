package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double habitantesCidadeA;
		double habitantesCidadeB;
		int anos = 0;
		double taxaCidadeA;
		double taxaCidadeB;
		boolean invalido;
		char resp;

		do {

			do {

				invalido = false;

				System.out.println("Entre com os habitantes da cidade A");
				habitantesCidadeA = scan.nextDouble();

				System.out.println("Informe Taxa de crescimento cidade A (%)");
				taxaCidadeA = scan.nextDouble();

				System.out.println("Entre com os habitantes da cidade B");
				habitantesCidadeB = scan.nextDouble();

				System.out.println("Informe Taxa de crescimento cidade B (%)");
				taxaCidadeB = scan.nextDouble();

				if (habitantesCidadeA <= 0 || habitantesCidadeB <= 0) {
					System.out.println("Quantidade de habitantes deve ser maior que zero");
					invalido = true;
				}

				if (taxaCidadeA <= taxaCidadeB) {
					System.out.println("Taxa cidade A deve ser maior que Taxa cidade B");
					invalido = true;
				}

			} while (invalido);

			taxaCidadeA = 1 + taxaCidadeA / 100;
			taxaCidadeB = 1 + taxaCidadeB / 100;

			while (habitantesCidadeA < habitantesCidadeB) {
				anos++;
				habitantesCidadeA = +habitantesCidadeA * taxaCidadeA;
				habitantesCidadeB = +habitantesCidadeB * taxaCidadeB;

				System.out.println("Habitantes cidade A: " + habitantesCidadeA);
				System.out.println("Habitantes cidade B: " + habitantesCidadeB);
				System.out.println("-------------------------------------------");
			}
			System.out.println("Anos: " + anos);

			System.out.println("Refazer Calculo? (S)");
			resp = scan.next().charAt(0);

		} while (resp == 'S' || resp == 's');
	}

}
