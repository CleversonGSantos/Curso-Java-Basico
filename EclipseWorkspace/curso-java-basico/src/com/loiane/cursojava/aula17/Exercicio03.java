package com.loiane.cursojava.aula17;

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		char sexo, estadoCivil;
		boolean invalido = false;
		
		do {
			System.out.println("Digite seu nome ");
			nome = scan.next();
			System.out.println("Digite sua idade ");
			idade = scan.nextInt();
			System.out.println("Digite seu salário ");
			salario = scan.nextDouble();
			System.out.println("Digite seu nome sexo (f/m) ");
			sexo = scan.next().charAt(0);
			System.out.println("Digite seu estado civil (s/c/v/d) ");
			estadoCivil = scan.next().charAt(0);
			
			if (nome.length() <= 3) {
				System.out.println("Nome inferior a 3 caracteres");
				invalido = true;
			}
			if (idade < 0 || idade > 150) {
				System.out.println("Idade deve ser entre 0 e 150");
				invalido = true;
			}
			if (salario <= 0) {
				System.out.println("Salário deve ser maior que zero");
				invalido = true;
			}
			if (sexo != 'f' && sexo != 'm') {
				System.out.println("Sexo informado inválido");
				invalido = true;
			}
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				System.out.println("Estado Civil informado inválido");
				invalido = true;
			}
			
		} while (invalido);
		
	}

}
