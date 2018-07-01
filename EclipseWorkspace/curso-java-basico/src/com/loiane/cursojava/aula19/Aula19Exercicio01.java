package com.loiane.cursojava.aula19;

public class Aula19Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		
		vetorB = vetorA;
		
		System.out.println("valor " + vetorB[0]);
		System.out.println("valor " + vetorB[1]);
		System.out.println("valor " + vetorB[2]);
		System.out.println("valor " + vetorB[3]);
		System.out.println("valor " + vetorB[4]);

	}

}
