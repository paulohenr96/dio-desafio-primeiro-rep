package aula.no;

public class No {
	
	
	private String conteudo;
	private No proximo;
	
	
	public No(String conteudo) {
		super();
		this.conteudo = conteudo;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	
}
