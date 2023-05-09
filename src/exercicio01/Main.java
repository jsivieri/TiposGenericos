package exercicio01;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		PilhaLimitada <Integer> pilhaInteger = new PilhaLimitada<>();

   
        pilhaInteger.empilhar(1);
        pilhaInteger.empilhar(2);
        pilhaInteger.empilhar(3);
        pilhaInteger.empilhar(4);
        pilhaInteger.empilhar(5);
        pilhaInteger.empilhar(6);
        pilhaInteger.empilhar(7);

        System.out.println(pilhaInteger.topo());
        
        pilhaInteger.desempilhar();
        
        
        System.out.println(pilhaInteger.desempilhar());
        System.out.println(pilhaInteger.topo());
	}

}
