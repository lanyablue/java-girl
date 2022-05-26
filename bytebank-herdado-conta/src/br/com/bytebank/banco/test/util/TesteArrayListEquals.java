package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		
		ArrayList<Conta> list = new ArrayList<Conta>(); 
		
		Conta cc = new ContaCorrente(22,11);
		list.add(cc);
		
		Conta cc2 = new ContaCorrente(22,12);
		list.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		
		boolean existe = list.contains(cc3);
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : list) {
			if (conta == cc3) {
				System.out.println("Já tenho essa conta");
			}
		}
		
		
	}

}
