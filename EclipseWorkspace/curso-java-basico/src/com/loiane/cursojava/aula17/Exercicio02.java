package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomeUsuario, senha;
		
		boolean invalido;
		
		do {
			System.out.println("Informe us�rio: ");
			nomeUsuario = scan.next();
			System.out.println("Infome a senha");
			senha = scan.next();
			
			invalido = false;
			if (nomeUsuario.equals(senha)) {
				System.out.println("Usu�rio e senha n�o podem ser iguais");
				invalido = true;
			} 
		} while (invalido);
	}
}
