package com.loiane.cursojava.aula19;

public class Aula19Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		
		vetorB[0] = vetorA[0] * 2;
		vetorB[1] = vetorA[1] * 2;
		vetorB[2] = vetorA[2] * 2;
		vetorB[3] = vetorA[3] * 2;
		vetorB[4] = vetorA[4] * 2;
		vetorB[5] = vetorA[5] * 2;
		vetorB[6] = vetorA[6] * 2;
		vetorB[7] = vetorA[7] * 2;
		
		System.out.println("valor " + vetorB[0]);
		System.out.println("valor " + vetorB[1]);
		System.out.println("valor " + vetorB[2]);
		System.out.println("valor " + vetorB[3]);
		System.out.println("valor " + vetorB[4]);
		System.out.println("valor " + vetorB[5]);
		System.out.println("valor " + vetorB[6]);
		System.out.println("valor " + vetorB[7]);
	}

}
