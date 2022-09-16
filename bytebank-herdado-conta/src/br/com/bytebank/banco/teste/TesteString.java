package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		int a = 4;
		String nome = "pidonna"; //object literal
		//String outro = new String("ALura");
		System.out.println(nome);
		System.out.println(nome.contains("nn"));
		
		String outra = nome.replace('a', 'A');
		System.out.println(outra);
		
		char nova = nome.charAt(2);
		System.out.println(nova);
		
		int pos = nome.indexOf("nn");
		System.out.println(pos);
		
		String maiuscula = nome.toUpperCase();
		System.out.println(maiuscula);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
	}

}
