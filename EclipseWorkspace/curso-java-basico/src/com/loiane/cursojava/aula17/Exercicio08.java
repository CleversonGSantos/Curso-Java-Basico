package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		num2 = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + "º número: ");
			num1 = scan.nextInt();
			
			num2 += num1;
		
		}
		
		System.out.println(" A soma dos números é :" + num2);
		System.out.println(" A média dos números é :" + num2 / 5);
	}

}
