import java.util.Random;
public class MegaSena {

	public static void main(String[] args) {
		Random generate = new Random();
		
		
		
		/*
		int i = 0;
		while(i < 6) {	
			int nextnumber = generate.nextInt(60);
			System.out.println(nextnumber);
			i++;
		}
		*/
		
		for(int i = 0; i < 6; i++) {
			for(int o = 0; o < 6; o++) {
				int numeroaleatorio = generate.nextInt(60);
				System.out.println(numeroaleatorio);
			}
			System.out.println();
			
		}
		//for(;;) {}  <--- for infinito, como se fosse while(true){}
	}

}
