package aula.no;

public class Main {

	
	public static void main (String[] args) {
		No<String> no1= new No("conteudo no 1");
		
		No<String> no2= new No("conteudo no 2");

		No<String> no3= new No("conteudo no 3");
		
		No<String> no4= new No("conteudo no 4");

		
		no1.setProximo(no2);
		no2.setProximo(no3);
		no3.setProximo(no4);

		System.out.println(no1);
		System.out.println(no1.getProximo());
		System.out.println(no1.getProximo().getProximo());
		System.out.println(no1.getProximo().getProximo().getProximo());

		

	}
}
