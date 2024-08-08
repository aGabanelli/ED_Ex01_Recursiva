package controller;

public class MenorValorVetor {

	public MenorValorVetor() {
		super();
	}
	
	public int menorValor(int[] vetor, int tamanho, int menor) {
		//condição de parada: quando a posição do vetor for igual a 0
		if(tamanho == 0) {
			return menor;
		}
		
		//substitui o valor de menor, se o valor do vetor na posição-1 for menor
		if(vetor[tamanho-1] < menor) {
			menor = vetor[tamanho-1];
		}
		//relaçãp de chamada: a chamada é feita diminuindo o valor do tamanho
		return menorValor(vetor, tamanho-1, menor);
	}
}