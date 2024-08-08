package controller;

public class SomaFatorial {

	public SomaFatorial() {
		super();
	}
	
	public int fatorial(int n) {
		//condição de parada: quando o número que está multiplicando chegar a 1,
		//pois se chegar a 0, 0*n=0.
		if(n == 1) {
			return 1;
		}
		
		//aqui multiplicamos o termo que recebemos com o resultado da chamada da
		//recursiva de n-1, até chegar a 1.
		else{
			return n * fatorial(n-1);
		}
	}
	
}
