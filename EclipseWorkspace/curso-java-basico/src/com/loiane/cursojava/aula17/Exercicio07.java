package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		num2 = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + "º número: ");
			num1 = scan.nextInt();
			
			if (num1 > num2) {
				num2 = num1;
			}
		}
		
		System.out.println("O maior número digitado é :" + num2);
	}

}
