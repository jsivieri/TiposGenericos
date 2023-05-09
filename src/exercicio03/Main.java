package exercicio03;

public class Main {

	public Main() {
	
	}

	public static void main(String[] args) {
		
		Fila <Integer> filaInteger = new Fila<>();
		filaInteger.enfileirar(1);
		filaInteger.enfileirar(2);
		filaInteger.enfileirar(3);
		filaInteger.enfileirar(4);
		filaInteger.enfileirar(5);
		
		System.out.println(filaInteger.tamanho());
		filaInteger.desenfileirar();
		System.out.println(filaInteger.tamanho());
		
		

	}

}
