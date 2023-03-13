package com.estruturadedados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaCircular<String> listaCircular=new ListaCircular<>();
		listaCircular.add("teste 1");
		listaCircular.add("teste 2");
		listaCircular.add("teste 3");
		listaCircular.add("teste 4");
		listaCircular.add("teste 5");
		listaCircular.add("teste 6");
		listaCircular.add("teste 7");
		listaCircular.add("teste 8");
		
		
		System.out.println(listaCircular);
		
		
		for (int i=0;i<343;i++) {
			System.out.print(listaCircular.get(i)+"->");
		}
	}

}
