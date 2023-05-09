package exercicio05;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		ConjuntoOrdenado <String> conjuntoString = new ConjuntoOrdenado<>();
		conjuntoString.adicionar("Televisão");
		conjuntoString.adicionar("Geladeira");
		conjuntoString.adicionar("Microondas");
		conjuntoString.adicionar("Sofá");
		conjuntoString.adicionar("Fogão");
		
		System.out.println(conjuntoString.obter(1));
		System.out.println(conjuntoString.obter(3));
		
		conjuntoString.remover("Geladeira");
		
		System.out.println(conjuntoString.obter(1));
		System.out.println(conjuntoString.obter(3));
		

	}

}
