package br.com.lojavirtual.main;

import br.com.lojavirtual.informatica.Teclado;

public class SistemaTeste {
	
	public static void main(String[] args) {
		Teclado tc = new Teclado();
		tc.setQtdTeclas(102);
		tc.setUSB(true);
		
		br.com.lojavirtual.instrumentos.Teclado tcm = 
				new br.com.lojavirtual.instrumentos.Teclado();
		
		tcm.setQtdSons(100);
		
		System.out.println(tc.getQtdTeclas());
		System.out.println(tc.isUSB());
		
		
	}
}
