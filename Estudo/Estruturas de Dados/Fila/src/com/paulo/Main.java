package com.paulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila<String> minhaFila=new Fila();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		
		System.out.println(minhaFila);
	
		minhaFila.enqueue("quinto");
		minhaFila.deQueue();
		System.out.println(minhaFila.first());


	}

}
