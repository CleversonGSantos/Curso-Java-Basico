package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			
			int resto = 0;
			
			resto = i % 2;
			
			if (resto == 1) {
				System.out.println("Número impar " + i );
			}
		
		}
	}

}
