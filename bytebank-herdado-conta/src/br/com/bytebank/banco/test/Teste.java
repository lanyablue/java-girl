package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		GuardadorRef guardador = new GuardadorRef();
		
		Conta cc = new ContaCorrente(22,11);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,12);
		guardador.adiciona(cc2);
		
		System.out.println("blablabla");
		
		
	}


}
