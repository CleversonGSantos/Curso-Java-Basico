package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, par = 0, impar = 0;
		
		for (int i = 1; i <= 10 ; i++ ) {
			
			System.out.println("Informe o " + i + "� numero");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		System.out.println("Quantidade n�meros pares: " + par);
		System.out.println("Quantidade n�meros impares: " + impar);
	}

}
