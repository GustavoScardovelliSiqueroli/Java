
public class Main {

	public static void main(String[] args) {
		System.out.println("Olá, Java.");
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		if(args[0].equals("somar")) {
			soma(x, y);	
		}else if(args[0].equals("subtrair")){
			subtracao(x,y);
		}else if(args[0].equals("mutiplicar")){
			mutiplicacao(x,y);
		}else if(args[0].equals("dividir")&(y != 0)){
			divisao(x,y);
		}else {
			System.out.println("Palavra não reconhecida");
			System.out.println(args[0]);
		}
		

		

		

	}
	
	static void soma(int x, int y) {
		System.out.println(x + y);
		
	}
	
	static void subtracao(int x, int y) {
		System.out.println(x - y);
		
	}
	
	static void mutiplicacao(int x, int y) {
		System.out.println(x * y);
	}
	
	static void divisao(int x, int y) {
		System.out.println(x / y);
	}

}
