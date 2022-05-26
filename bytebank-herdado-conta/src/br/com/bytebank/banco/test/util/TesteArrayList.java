package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// generics
		ArrayList<Conta> list = new ArrayList<Conta>(); //só guarda referencias do tipo conta
		
		Conta cc = new ContaCorrente(22,11);
		list.add(cc);
		
		Conta cc2 = new ContaCorrente(22,12);
		list.add(cc2);
		
		System.out.println(list.size());
		Conta ref = list.get(0);
		System.out.println(ref.getNumero());
		
		list.remove(0);
		System.out.println(list.size());
		
		
		Conta cc3 = new ContaCorrente(22,121);
		list.add(cc3);
		Conta cc4 = new ContaCorrente(22,212);
		list.add(cc4);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------");
		for (Conta conta : list) {
			System.out.println(conta);
		}
		
		
	}

}
