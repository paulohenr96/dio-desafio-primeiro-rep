package com.dio.estruturadedados;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
	
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Carro(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}

//	@Override
//	public int compareTo(Carro o) {
//		// TODO Auto-generated method stub
//		if (this.marca.length()<o.marca.length())
//			return -1;
//	
//		return 1;
//	}
//	
	
	@Override
	public int compareTo(Carro o) {
		// TODO Auto-generated method stub
		return this.getMarca().compareTo(o.marca);
	}
	
}
