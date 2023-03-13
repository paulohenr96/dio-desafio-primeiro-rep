package com.estruturadedados;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	
	public ListaCircular() {
		// TODO Auto-generated constructor stub
		this.cauda=null;
		this.tamanhoLista=0;
		this.cabeca=null;
	}
	
	
	
	public void add(T conteudo) {
		No<T> novoNo=new No<>(conteudo);
		
		if (isEmpty()) {
			this.cabeca=novoNo;
			this.cauda=this.cabeca;
			this.cabeca.setNoProximo(cauda);
		}else{
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda=novoNo;
		}
		
		this.tamanhoLista++;
	}
	
	
	public void remove(int index) {
		
		if (index >= this.tamanhoLista) {
			throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
		}
		
		No<T> noAuxiliar =this.cauda;
		
		if (index ==0) {
			this.cauda=this.cauda.getNoProximo();
			
			this.cabeca.setNoProximo(this.cauda);
		}else if (index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		}else {
			for (int i =0;i<index-1 ; i++) {
				noAuxiliar=noAuxiliar.getNoProximo();
				
				
			}
			
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		
		this.tamanhoLista--;
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		if (this.isEmpty())
				throw new IndexOutOfBoundsException("A lista está fazia");
		
		
		if (index == 0) {
			return this.cauda;
		}
		
		No<T> noAuxiliar = this.cauda;
		
		for (int i=0;(i<index)&&(noAuxiliar!=null);i++) {
			noAuxiliar=noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	
	public boolean isEmpty() {
		return tamanhoLista==0;
	}
	
	
	
	public int size() {
		return this.tamanhoLista;
	}



	@Override
	public String toString() {
		String strRetorno="";
		
		No<T> noAuxiliar = this.cauda;
		
		for (int i=0;i<size();i++) {
			
			strRetorno+=("{No[conteudo="+noAuxiliar.getConteudo()+"]}==>");
			
			noAuxiliar=noAuxiliar.getNoProximo();
		}
		strRetorno += isEmpty()?"[]":"[Retorno Ao Inicio]";
		return strRetorno;
	}
	
	
	
}
