package com.loiane.cursojava.aula17;

public class Exercicio04 {

	public static void main(String[] args) {
		double habitantesCidadeA = 80000;
		double habitantesCidadeB = 200000;
		int anos = 0;
		double taxaCidadeA = 1.03;
		double taxaCidadeB = 1.015;
		
		while (habitantesCidadeA < habitantesCidadeB) {
			anos++;
			habitantesCidadeA =+ habitantesCidadeA * taxaCidadeA;
			habitantesCidadeB =+ habitantesCidadeB * taxaCidadeB;
			
			System.out.println("Habitantes cidade A: " + habitantesCidadeA);
			System.out.println("Habitantes cidade B: " + habitantesCidadeB);
			System.out.println("-------------------------------------------");
		}
		System.out.println("Anos: " + anos);
		
	}

}
