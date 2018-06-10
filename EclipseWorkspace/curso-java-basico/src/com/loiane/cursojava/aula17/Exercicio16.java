package com.loiane.cursojava.aula17;

public class Exercicio16 {

	public static void main(String[] args) {
		int temp = 0, prox = 0, serie = 1;
		
		System.out.println("Informe a quantidade da sequencia de Fibonacci até > 500");

		System.out.print(temp + " " + serie);
		
		for (; temp <= 500 ; ) {
			temp = prox + serie;
			System.out.print(" " + temp);
			prox = serie;
			serie = temp;
		}
	}

}
