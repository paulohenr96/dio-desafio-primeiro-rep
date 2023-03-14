package com.dio.estruturadedados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Carro> listCarros=new ArrayList<Carro>();
		
		listCarros.add(new Carro("ford"));
		listCarros.add(new Carro("chevrolet"));
		listCarros.add(new Carro("peugeot"));
		listCarros.add(new Carro("fiat"));

	
		System.out.println(listCarros);
		System.out.println(listCarros.get(2));
		
		System.out.println(listCarros.remove(2));
		System.out.println(listCarros);



	
	}

}
