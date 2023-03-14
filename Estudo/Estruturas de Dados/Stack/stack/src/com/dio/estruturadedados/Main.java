package com.dio.estruturadedados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Carro> stackCarros= new Stack<>();
		
		stackCarros.push(new Carro("ford"));
		stackCarros.push(new Carro("chevrolet"));
		stackCarros.push(new Carro("fiat"));
		
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);

	}

}
