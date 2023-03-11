package com.paulo.dio;

public class No<T> {
	
	private T conteudo;
	
	private No<T> proximoNo;

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No() {
		// TODO Auto-generated constructor stub
		this.proximoNo=null;

	}
	
	public No(T conteudo) {
		// TODO Auto-generated constructor stub
		this.proximoNo=null;
		this.conteudo=conteudo;
	}
	
	public No(No<T> proximoNo, T conteudo) {
		// TODO Auto-generated constructor stub
		
		this.proximoNo=proximoNo;
		this.conteudo=conteudo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str= "No [conteudo=" + conteudo + "]";
		
		if (proximoNo!=null) {
			str+="->"+proximoNo.toString();
		}else {
			str +="->null";
		}
		
		
		return str;
		
	}

}
