package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		
		System.out.println("Informe um número para a tabuada");
		num1 = scan.nextInt();
		
		for (int i = 1; i <= 10 ; i++ ) {
			System.out.println(num1 + " x " + i  + " = " + num1 * i);
		}
		
	}

}
