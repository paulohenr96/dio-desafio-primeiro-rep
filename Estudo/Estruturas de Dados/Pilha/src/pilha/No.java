package pilha;

public class No {

	private int dado;
	private No proximo=null;
	public No(int dado) {
		// TODO Auto-generated constructor stub
		this.setDado(dado);
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
}
