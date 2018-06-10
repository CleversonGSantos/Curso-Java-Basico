package com.loiane.cursojava.aula17;

import java.util.Scanner;
public class Exercicio17a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int fatorial;
		
		System.out.println("Informe o número para calculo do Fatorial ");
		fatorial = scan.nextInt();
		
		for (int i = fatorial - 1; i > 1 ; i-- ) {
			fatorial = fatorial * i;
		}
		
		System.out.println("Resultado: " + fatorial);
	}

}
