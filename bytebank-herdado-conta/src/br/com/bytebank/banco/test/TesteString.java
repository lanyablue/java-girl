package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
//		String vazio = "     Alura      ";
//		String outroVazio = vazio.trim();
//		
//		System.out.println(vazio.contains("Alu"));
//		System.out.println(outroVazio);
		
		String nome = "Alura"; //object literal
		//String outroNome = new String("Alura");
		
//		char c = nome.charAt(0);	
//		System.out.println(c);
//		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		String sub = nome.substring(1, 4); //string começa no index de parametro
		System.out.println(sub);
		
//		System.out.println(nome.length());
//		
//		
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		
//		char c = 'A';
//		char d = 'a';
//		
//		String outra = nome.replace(c, d);
//		//nome.toLowerCase();
//		
//		String maiuscula = nome.toUpperCase();
//		System.out.println(nome);
//		System.out.println(maiuscula);

	}

}
