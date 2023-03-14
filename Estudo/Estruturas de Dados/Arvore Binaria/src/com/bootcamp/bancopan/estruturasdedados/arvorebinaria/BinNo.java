package com.bootcamp.bancopan.estruturasdedados.arvorebinaria;

public class BinNo<T extends Comparable<T>> {

	private T conteudo;
	
	private BinNo<T> noEsq;
	private BinNo<T> noDir;
	
	public BinNo(T conteudo) {
		// TODO Auto-generated constructor stub
		this.conteudo=conteudo;
		noEsq=noDir=null;

	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNo<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(BinNo<T> noEsq) {
		this.noEsq = noEsq;
	}

	public BinNo<T> getNoDir() {
		return noDir;
	}

	public void setNoDir(BinNo<T> noDir) {
		this.noDir = noDir;
	}
	
	
}
