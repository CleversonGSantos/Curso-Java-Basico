package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, temp;
		
		System.out.println("Informe 2 número inteiros separados por espaço");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		temp = 0;
		for (int i = num1; i < num2 - 1; ) {
			i++;
			temp += i;
			System.out.println("numero " + i );
		}
		
		System.out.println("A soma dos números é " + temp);
	}

}
