package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;

public class GuardadorRef {

	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorRef() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
}
