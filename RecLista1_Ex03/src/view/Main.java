package view;

import java.util.Scanner;
import controller.SomaFatorial;

public class Main {
	public static void main(String[] args) {
		SomaFatorial fat = new SomaFatorial();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		System.out.println("Fatorial: " + fat.fatorial(numero));
		
	}
}
