package view;

import java.util.Scanner;
import controller.Somatorio;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Somatorio somatorio = new Somatorio();
		
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();
		
		int resposta = somatorio.somar(n);
		
		System.out.println(resposta);
		
	}
}
