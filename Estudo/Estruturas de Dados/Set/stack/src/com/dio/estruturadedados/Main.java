package com.dio.estruturadedados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Carro> listCarros=new HashSet<>();
		
		listCarros.add(new Carro("ford"));
		listCarros.add(new Carro("chevrolet"));
		listCarros.add(new Carro("peugeot"));
		listCarros.add(new Carro("fiat"));

	
		System.out.println(listCarros);
		

		
		TreeSet<Carro> carros=new TreeSet<>();
		carros.add(new Carro("ford"));
		carros.add(new Carro("chevrolet"));
		carros.add(new Carro("peugeot"));
		carros.add(new Carro("fiat"));
		System.out.println(carros);



	
	}

}
