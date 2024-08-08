package view;

import java.util.Scanner;

import controller.SomaController;

public class Main {

	public static void main(String[] args) {
		SomaController controller = new SomaController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int n = scanner.nextInt();
		
		double resposta = controller.somaFracao(n);
		
		System.out.println(resposta);
		
	}
	
}
