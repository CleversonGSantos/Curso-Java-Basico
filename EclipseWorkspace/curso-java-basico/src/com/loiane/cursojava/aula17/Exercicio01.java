package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean invalido;
		
		int nota;
		do {
			System.out.println("Informe uma nota entre 0 e 10: ");
			nota = scan.nextInt();
			invalido = false;
			if (nota < 0 || nota > 10) {
				System.out.println("Valor inválido: " + nota);
				invalido = true;
			}
		} while (invalido);
	}

}
