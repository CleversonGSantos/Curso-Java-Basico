package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, temp = 0, prox = 0, serie = 1;
		
		System.out.println("Informe a quantidade da sequencia de Fibonacci");
		num = scan.nextInt();

		System.out.print(temp + " " + serie);
		
		for (int i = 1; i <= num ; i++ ) {
			temp = prox + serie;
			System.out.print(" " + temp);
			prox = serie;
			serie = temp;
		}
	}

}
