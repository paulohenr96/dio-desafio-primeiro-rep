package aula.no;

public class No<T>{
	
	
	private T conteudo;
	private No proximo;
	
	
	public No(T conteudo) {
		super();
		this.conteudo = conteudo;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	
}
