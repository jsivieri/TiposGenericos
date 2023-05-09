package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Fila <T>{

private List<T> pilha = new ArrayList<>();
	
	public void enfileirar(T elemento){
		pilha.add(elemento);
	}

	public T desenfileirar(){
		pilha.remove(0);
		return pilha.get(0);
	}	
	
	public int tamanho(){
		return pilha.size();
	}

}
