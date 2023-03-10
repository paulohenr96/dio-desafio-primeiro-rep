package com.paulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila minhaFila=new Fila();
		
		minhaFila.enqueue(new No("primeiro"));
		minhaFila.enqueue(new No("segundo"));
		minhaFila.enqueue(new No("terceiro"));
		minhaFila.enqueue(new No("quarto"));
		
		System.out.println(minhaFila);
	
		minhaFila.enqueue(new No("quinto"));
		minhaFila.deQueue();
		System.out.println(minhaFila.first());


	}

}
