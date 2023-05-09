package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Mapa <valor>{
	
	
	private valor v;
	
	public Mapa() {
		
	}


	public valor getV() {
		return v;
	}



	public void setV(valor v) {
		this.v = v;
	}



	private List<valor> conjunto = new ArrayList<>();
	
	
	public void adicionar(valor v) {
		conjunto.add(v);
		
	}
	
	public void remover(int K) {
		conjunto.remove(K);
		
	}
	
	public valor obter(int K) {
		return this.conjunto.get(K);
		
	}
	

}
