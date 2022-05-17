package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente Felipe = new ContaCorrente(2222, 3333);
		Felipe.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calculo = new CalculadorImposto();
		
		calculo.registra(Felipe);
		calculo.registra(seguro);
		
		System.out.println(calculo.getTotalImposto());
		
	}

}
