package exercicio02;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		
		
		Conjunto <Integer> conjuntoInteger = new Conjunto<>();
		conjuntoInteger.adicionar(1);
		conjuntoInteger.adicionar(2);
		conjuntoInteger.adicionar(3);
		
		
		System.out.println(conjuntoInteger.contem(2));
		System.out.println(conjuntoInteger.contem(5));
	}

}
