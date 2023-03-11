package com.paulo.dio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste2");
		minhaListaEncadeada.add("teste3");
		minhaListaEncadeada.add("teste4");

		System.out.println(minhaListaEncadeada);
		
		String remove = minhaListaEncadeada.remove(2);
		System.out.println(remove);
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada);


	}

}
