package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(13);
		System.out.println(false);
		
		Object cc = new ContaCorrente(1313, 313);
		ContaPoupanca cp = new ContaPoupanca(3131, 1313);
		Cliente cliente = new Cliente();
		
		System.out.println(cc.toString()); //object imprime o toString() naturalmente 
		System.out.println(cp);
		
		println(cliente);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	
	static void println(Object referencia) {}
}
