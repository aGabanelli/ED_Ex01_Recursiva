package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public double somaFracao(int n) {
		
		//condição de parada: quando n = 0, retorna o valor de resposta
		if (n == 0) {
			return 1;
		}
		
		//a chamada é feita somando a divisao de 1/n com o resultado da 
		//recursiva de n-1
		else {
			return (1/n) + somaFracao(n-1);
		}
	}
	
}
