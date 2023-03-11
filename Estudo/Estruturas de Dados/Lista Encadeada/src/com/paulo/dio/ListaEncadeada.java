package com.paulo.dio;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		// TODO Auto-generated constructor stub
	
		referenciaEntrada=null;
	}
	
	public int size() {
		int tamanhoLista=0;
		
		No<T> referenciaAuxiliar=referenciaEntrada;
		
		while(true) {
			if (referenciaAuxiliar==null) {
				break;
			}
			
			tamanhoLista++;
			
			if (referenciaAuxiliar.getProximoNo()==null) {
				break;
			}
			referenciaAuxiliar=referenciaAuxiliar.getProximoNo();
			
		}
		
		return tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo=new No<T>(conteudo);
		
		if (isEmpty()) {
			referenciaEntrada=novoNo;
			return;
		}
		
		No<T> no = referenciaEntrada;
		
		for (int i=0;i <size()-1;i++) {
			no=no.getProximoNo();
			
			
		}
		
		no.setProximoNo(novoNo);
	}
	
	public boolean isEmpty() {
		return referenciaEntrada==null;
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		validaIndice(index);
	
		No<T> noAuxiliar = referenciaEntrada;
	
		No<T> noRetorno = null;
		
		for (int i=0;i <=index;i++) {
			noRetorno=noAuxiliar;
			noAuxiliar=noAuxiliar.getProximoNo();
			
			
		}
		
		return noRetorno;
		

	}
	
	public void validaIndice(int index) {
		if (index >=size()) {
			int ultimoIndice=size()-1;
			throw new IndexOutOfBoundsException("Não existe conteudo no indice "+index+" desta Lista. Esta lista só vai até o indice "+ultimoIndice);
		}
		
	}
	
	public T remove(int index) {
		
		No<T> noPivo=this.getNo(index);
		
		if (index ==0) {
			referenciaEntrada=noPivo.getProximoNo();
			return noPivo.getConteudo();
		}
		
		
		No<T> noAnterior = getNo(index-1);
		
		
		noAnterior.setProximoNo(noPivo.getProximoNo());
		
		return noPivo.getConteudo();
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		
		No<T> noAuxiliar = referenciaEntrada;
		
		for (int i=0;i<this.size();i++) {
			
			
			strRetorno+="No [conteudo=" + noAuxiliar.getConteudo() + "] -->";
			
			noAuxiliar=noAuxiliar.getProximoNo();
		}
		strRetorno +="[null]";
		return strRetorno;
	}
	
}
