package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoOrdenado <T extends Comparable<T>>{

	public ConjuntoOrdenado() {
		
	}
	
	private List<T> pilha = new ArrayList<>();
	
	public void adicionar(T elemento) {
		pilha.add(elemento);
	}
	
	public void remover(T elemento) {
		pilha.remove(elemento);
	}
	
	public T obter(int indice) {
		return pilha.get(indice);
	}

}
