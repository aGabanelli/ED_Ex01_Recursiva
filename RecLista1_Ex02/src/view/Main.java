package view;

import controller.MenorValorVetor;

public class Main {
	public static void main(String[] args) {
		MenorValorVetor mv = new MenorValorVetor();
	
		int[] vetor = {1, 6, 2, 3, 9, 7};
		int tamanho = vetor.length;
		int menorValorVetor = vetor[tamanho-1];
		
		int resposta = mv.menorValor(vetor, tamanho, menorValorVetor);
		
		System.out.println(resposta);
		
		
		
	
	}
}
