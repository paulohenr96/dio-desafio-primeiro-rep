package com.bootcamp.bancopan.estruturasdedados.arvorebinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
	
	public Integer valor;
	
	public Obj(int valor) {
		// TODO Auto-generated constructor stub
		this.valor=valor;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return valor == other.valor;
	}


	@Override
	public int compareTo(Obj outro) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		if (this.valor > outro.valor)
			i=1;
		else if (this.valor< outro.valor)
			i=-1;
		return i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.valor.toString();
	}

}
