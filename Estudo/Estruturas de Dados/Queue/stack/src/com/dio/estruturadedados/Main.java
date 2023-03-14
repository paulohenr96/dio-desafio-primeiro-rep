package com.dio.estruturadedados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Carro> queue=new LinkedList<>();
		
		queue.add(new Carro("ford"));
		queue.add(new Carro("chevrolet"));
		queue.add(new Carro("fiat"));
		
		System.out.println(queue);
		System.out.println(queue.add(new Carro("peugeot")));
		System.out.println(queue.offer(new Carro("peugeot")));

		System.out.println(queue.poll());

	}

}
