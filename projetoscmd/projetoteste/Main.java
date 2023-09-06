package projetoteste;
import java.util.Scanner;
// import projetoteste.User;

import javax.print.event.PrintJobListener;

public class Main{
    public static void main(String[]args){


        User primeiro = new User();
        Espada diabo = new Espada();

        Espada[] espadas = new Espada[3];

        for(int i = 0; i < espadas.length; i++){
            Espada atual = new Espada();
            atual.registrar();
            espadas[i] = atual;
            
            System.out.println(espadas[i].nome);
        }
     
     
     
     
     
        // espadas[0] = new Espada();
        // espadas[0].registrar();
        
        // espadas[1] = new Espada();
        // espadas[1].registrar();
        
        // espadas[2] = new Espada();
        // espadas[2].registrar();


        

        // primeiro.registrar();
        // primeiro.imprimirNome();

        // diabo.registrar();
        // diabo.setUsuario("penis");
        // System.out.println(diabo.getUsuario());




    }
}