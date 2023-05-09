package exercicio04;


public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {

		Mapa <String> mapaString = new Mapa<>();
		mapaString.adicionar("João");
		mapaString.adicionar("Maria");
		mapaString.adicionar("Laura");
		mapaString.adicionar("Marcos");
		mapaString.adicionar("Lucas");
		
		System.out.println(mapaString.obter(1));
	
	}

}
