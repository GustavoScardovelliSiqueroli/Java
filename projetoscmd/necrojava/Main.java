package necrojava;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static String resp;
    static Personagem player1 = new Personagem();
    static Teclado entrada1 = new Teclado();
    static Registrador registrador = new Registrador();
    static Monstro[] monstros = new Monstro[10];
    public static void main(String[] args){


        
        List<Personagem> players = new ArrayList<>();
        int i = 0;
        while(i < 10){
            Personagem registrador = new Personagem();
            players.add(registrador);
            i++;
        }

        // players.set(0, registrador.personagem());

        System.out.println("Olá, seja bem vindo ao NECROJAVA.");

        System.out.println();
        System.out.println("Deseja criar um personagem?");
        if(entrada1.sn()){
            player1 = registrador.persongem();
        }else{
            System.out.println("Fds");
        }
        // System.out.println(entrada1.resultSN()); //testando<

        monstros[0] = registrador.monstro1();
        
        System.out.println();
        System.out.println(player1.getNome() + " você está em uma floresta, e à sua frente encontra-se um pequeno monstro..." );
        resp = entrada.nextLine();
        System.out.println("É um... " + monstros[0].getNome() + "!");
        batalha(monstros[0] ,player1 );
        

        

     }

     static void batalha(Monstro x, Personagem y){


        y.setVida(Integer.toString(y.getVida() - x.getDano()));
        System.out.println(y.getVida());
     }






}
