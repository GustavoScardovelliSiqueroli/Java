package ordenacao;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] ordem = new String[]{ "b", "c" , "a"};
		String[] desordem = new String[]{ "b", "c" , "a"};
		int[] teste = new int[]{4, 6, 7, 2, 1, 3, 2, 6, 8};
		
		// Arrays.sort(ordem); //ordena o array automaticamente <<<<

		for(int i = 0; i < Array.getLength(ordem); i++){		
			System.out.println(ordem[i]);
		}

		System.out.println(Arrays.toString(ordem)); //Arrays.toString() <<<<< retorna o array como string

		System.out.println(Arrays.toString(teste));
		System.out.println(ordem == desordem); //compara se os arrays apontam para o mesmo conteúdo, no mesmo local

		System.out.println(Arrays.equals(desordem, ordem)); //Compara o conteúdo dos arrays

		//////////////////////////////////////////////////////

		String[] arrayteste;
		arrayteste = new String[10];
		System.out.println(Arrays.toString(arrayteste));

		System.out.println();
		
		// String[] contagem = new String[]{ "1" , "2" , "3"};
		Arrays.fill(arrayteste, "bucetinha");
		System.out.println(Arrays.toString(arrayteste));

	}

}
