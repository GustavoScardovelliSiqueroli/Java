import java.util.Scanner;

public class Scaneamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escreva seu nome:  ");
		String name = scanner.nextLine();
		
		System.out.println("Olá, " + name + ".");
		System.out.println();
		System.out.println(System.console());
	}

}
