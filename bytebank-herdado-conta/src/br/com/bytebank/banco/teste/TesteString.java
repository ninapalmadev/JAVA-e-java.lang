package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		int a = 4;
		String nome = "pidonna"; //object literal
		//String outro = new String("ALura");
		System.out.println(nome);
		
		String outra = nome.replace("a", "A");
		System.out.println(outra);
		
		String maiuscula = nome.toUpperCase();
		System.out.println(maiuscula);
		
	}

}
