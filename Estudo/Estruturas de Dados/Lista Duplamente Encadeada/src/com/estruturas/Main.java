package com.estruturas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDuplamenteEncadeada<String> minhaListaEncadeada=new ListaDuplamenteEncadeada<>();
		
		minhaListaEncadeada.add("c1");
		minhaListaEncadeada.add("c2");
		minhaListaEncadeada.add("c3");
		minhaListaEncadeada.add("c4");
		minhaListaEncadeada.add("c5");
		minhaListaEncadeada.add("c6");
		minhaListaEncadeada.add("c7");
		minhaListaEncadeada.add("c8");

		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(3);
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.add(3, "c9");
		System.out.println(minhaListaEncadeada);

	}

}
