package pilha;

public class Pilha {
	
	private No entradaPilha;
	
	public Pilha() {
		// TODO Auto-generated constructor stub
		this.entradaPilha=null;
	}
	
	
	
	public No pop() {
		if (!isEmpty()) {
			No noPoped = entradaPilha;
			entradaPilha = entradaPilha.getProximo();
			
			return noPoped;
		}
		return null;
		
	}
	
	public void push(No novoNo) {
		No refAuxiliar=entradaPilha;
		
		entradaPilha=novoNo;
		
		entradaPilha.setProximo(refAuxiliar);
		
	}
	
	public No top() {
		return entradaPilha;
	}
	public boolean isEmpty() {
		return entradaPilha==null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String stringRetorno = "--------\n";
		
		stringRetorno +="Pilha \n";
		
		stringRetorno += "---------\n";
		
		No no = entradaPilha;
		
		while(true) {
			if(no !=null) {
				stringRetorno +="No[dado="+no.getDado()+"}]\n";
				no = no.getProximo();
			}else {
				break;
			}
		}
		stringRetorno+="==========\n";
		
		return stringRetorno;
	}
}
