package view;

import controller.NegativosController;

public class Main {

	public static void main(String[] args) {
		NegativosController controller = new NegativosController();
		
		int[] vetor = {2, 3, -2, 4, 0, -7, -9};
		int tamanho = vetor.length;
		
		int resultado = controller.numerosNegativos(vetor, tamanho-1, 0);
		System.out.println(resultado);
		
	}
	
}
