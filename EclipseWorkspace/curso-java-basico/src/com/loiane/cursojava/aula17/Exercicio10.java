package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, temp;
		
		System.out.println("Informe 2 n�mero inteiros separados por espa�o");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i < num2 - 1; ) {
			i++;
			System.out.println("numero " + i );
		}
	}
}
