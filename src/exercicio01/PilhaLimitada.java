package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class PilhaLimitada <T>{

	public PilhaLimitada() {
		// TODO Auto-generated constructor stub
	}
		
	private List<T> pilha = new ArrayList<>();
	
	public void empilhar(T elemento){
		pilha.add(elemento);
	}

		public T topo(){
		return pilha.get(pilha.size()-1);
		}	
		
		public T desempilhar(){
			return pilha.remove(pilha.size()-1);
		}

		public boolean estaVazia(){
		return pilha.isEmpty();
		}	
		
		
		

}
