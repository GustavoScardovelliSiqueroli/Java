package arraysdinamicos;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá, dick penis coco merdakkkadas aaa merda merda merda bosta");
		List<String> teste = new ArrayList<>();
		//como adicionar elementos nele ^
		
		teste.add("coco");
		teste.add("pinto");
		teste.add("merrda");
		teste.add("bosta");
		
		System.out.println(teste.toString());
		
		for(int i = 0 ; i < teste.size() ; i++) {
			System.out.println(teste.get(i));
		}
		
		int index = teste.indexOf("bosta");
		System.out.println(index); //indexOf mostra o index  dentro da lista do objeto refenciado no parâmentro.
		
		Collections.sort(teste);
		System.out.println(teste.toString());
		
		for(String buceta : teste) {
			System.out.println("eu faço merda na callç");
			System.out.println(buceta);
		}
		
		User Gustavo = new User("Gustavo", "Scardovelli");
		User Maria = new User("Maria", "Fertrim");
		
		System.out.println(Gustavo.getID());
		System.out.println(Maria.getID());
		
		System.out.println(User.testeUsavel());
		System.out.println("Quantos usuários tem no servidor???");
		System.out.println(User.getQuantidadeUsers());
		
	}

}
