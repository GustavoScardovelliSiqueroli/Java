package necrojava;
import java.util.Scanner;

public class Registrador {
    
    private String resp;
    Scanner entrada = new Scanner(System.in);

    public Personagem persongem(){
        Personagem registrador = new Personagem();

        System.out.print("Digite o nome do seu personagem:.. ");
        resp = entrada.nextLine();
        while(resp.equals("")){
            System.out.println("Você não digitou nada...");
            System.out.print("Digite o nome do seu personagem:.. ");
            resp = entrada.nextLine(); 
        }
        
      
        registrador.setNome(resp); 
        registrador.setVida("100");
        registrador.setDano("10");
        System.out.println("Personagem registrado com sucesso!");
        return registrador;
    }

    public Monstro monstro1(){
        Monstro registrador = new Monstro();
        
        registrador.setNome("Aranha pequena");
        registrador.setDano("2");
        registrador.setVida("10");
        return registrador;
    }
}
