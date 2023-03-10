package com.paulo;

public class Fila {

	private No refEntradaFila;
	
	public Fila() {
		// TODO Auto-generated constructor stub
		
		this.refEntradaFila=null;
	}
	
	
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refEntradaFila);
		
		refEntradaFila=novoNo;
	}
	
	public No first() {
		if (!isEmpty()) {
			No primeiroNo=refEntradaFila;
			
			while (true) {
				if (primeiroNo.getRefNo() !=null) {
					primeiroNo=primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	public No deQueue() {
		if (!isEmpty()) {
			No primeiroNo=refEntradaFila;
			No noAuxiliar=refEntradaFila;
			
			while (true) {
				if (primeiroNo.getRefNo() !=null) {
					noAuxiliar=primeiroNo;
					primeiroNo=primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
		}
		return null;
	}
	
	
	
	
	public boolean isEmpty() {
		return refEntradaFila==null;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		String stringRetorno="";
		
		
		No noAuxiliar=refEntradaFila;
		
		if (refEntradaFila!=null)
		{
			while(true) {
				stringRetorno += "[Np{objeto="+noAuxiliar.getObject()+"}]----->";
				if (noAuxiliar.getRefNo() !=null) {
					noAuxiliar=noAuxiliar.getRefNo();

				}else {
					stringRetorno+="null";
					break;
				}
				
			}
			
			
			
		}else {
			stringRetorno="null";
		}
		
		return stringRetorno;
	}
	
	
	
}
