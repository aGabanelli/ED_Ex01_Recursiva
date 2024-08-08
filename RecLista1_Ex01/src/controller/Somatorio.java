package controller;

public class Somatorio {

	public Somatorio(){
		super();
	}
	
	public int somar(int numero) {
		
// 		Condição de parada: retorna 0 se o numero for negativo ou zero.
		if(numero < 0){
			return 0;
		}
		
//		Relação de chamada: soma numero ao resultado da chamada recursiva com numero-1.
		else {
			return numero + somar(numero-1);
		}
	}	
}
