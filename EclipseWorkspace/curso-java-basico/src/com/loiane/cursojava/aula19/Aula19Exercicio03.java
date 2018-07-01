package com.loiane.cursojava.aula19;

public class Aula19Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		vetorA[00] = 01;
		vetorA[01] = 02;
		vetorA[02] = 03;
		vetorA[03] = 04;
		vetorA[04] = 05;
		vetorA[05] = 06;
		vetorA[06] = 07;
		vetorA[07] = 8;
		vetorA[8]  = 9;
		vetorA[9]  = 10;
		vetorA[10] = 11;
		vetorA[11] = 12;
		vetorA[12] = 13;
		vetorA[13] = 14;
		vetorA[14] = 15;
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("valor " + vetorB[i]);
		}
		
	}

}
