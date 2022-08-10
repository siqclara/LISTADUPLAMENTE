package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Kamila");
		lista.adicionaNoComeco("Helena");
	
		System.out.println(lista.toString());
		
		lista.adicionarFinal("João");
		lista.adicionarFinal("Teste");
		
		
		System.out.println(lista.toString());
		
		lista.adicionaPorPosicao(9, "Celina");
		
		System.out.println(lista.toString());
		
		lista.removerDoComeco();
		
		System.out.println(lista.toString());


}
}