package com.paulo;

public class No {
	
	
	private Object object;
	
	private No refNo;

	public No(Object object) {
		this.refNo=null;
		this.object = object;
	}
	public No() {
		// TODO Auto-generated constructor stub
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
}
