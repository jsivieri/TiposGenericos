package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Conjunto<T> {
	

	private List<T> pilha = new ArrayList<>();
	
		
	public void adicionar(T elemento){
		pilha.add(elemento);
	}	
	
		public T remover(){
			return pilha.remove(pilha.size()-1);
		}

		public boolean contem(T elemento){
			if (pilha.contains(elemento)) {
				return true;
			} else {
				return false;
			}
			
		
		}	

}
