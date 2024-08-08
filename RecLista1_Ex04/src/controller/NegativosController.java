package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	
	public int numerosNegativos(int[] vetor, int tamanho, int contador) {
		//condição de parada: quando o tamanho do vetor for menor que 0,
		//mostra o valor do contador	
		if(tamanho < 0) {
			return contador;
		}
		
		//em ambas as chamadas, coloco tamanho -1 para procurar o valor
		//negativo dentro do vetor. se o valor daquela posição for negativo,
		//adiciona 1 ao contador.
		if(vetor[tamanho] < 0) {
			contador = contador + 1;
			return numerosNegativos(vetor, tamanho-1, contador);
		}
		return numerosNegativos(vetor, tamanho-1, contador);
	}
	
	
}
