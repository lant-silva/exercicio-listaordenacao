package view;
import model.Lista;
public class Main {
	public static void main(String[] args) throws Exception {
		
		int[] vetor = {3,5,8,12,9,7,6,2,3,7,16};
		Lista lista = new Lista();
		lista.vectorInit(vetor, lista); // metodo adicionado por meio da biblioteca de listas
		coletarMaiores(lista);
		
	}
	public static void coletarMaiores(Lista lista) throws Exception {
		for(int i=0;i<lista.size();i++) {
			for(int j=i+1;j<lista.size();j++) {
				if(lista.get(i)> lista.get(j)) {
					int aux = lista.get(j);
					lista.add(lista.get(i), j);
					lista.remove(j+1);
					lista.add(aux, i);
					lista.remove(i+1);
				}			
			}
		}
		
		int maior = lista.get(lista.size()-1);
		int segundoMaior = lista.get(lista.size()-2);
		System.out.println("Maior valor da lista: "+maior);
		System.out.println("Segundo maior valor da lista: "+segundoMaior);
		lista.printList(lista);
	}
}
