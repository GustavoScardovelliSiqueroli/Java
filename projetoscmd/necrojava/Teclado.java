package necrojava;
import java.util.Scanner;

public class Teclado {
    
    public static Scanner entrada = new Scanner(System.in);
    static String resp = "";
    private boolean resultSN; 


  
    public  boolean sn(){  //sn <<<<<<<<<< sn <<<<<<<<<< faz uma pergunta sim ou nao e retorna true ou falso

        System.out.println("Digite S/N:..");
        resp = entrada.nextLine();
        testeSN();
        return testeSN();
     }

     private static boolean testeSN(){
        String sn; 
        sn = resp;

        if((sn.equals("S")) | (sn.equals("s")) | (sn.equals("sim")) | (sn.equals("")) ){

            return true;
        }else{
            return false;
        }
    }

    public boolean resultSN(){ // <<<<<<<<<<<<< só retorna se o sn foi true ou falso (uso para testes)
        resultSN = testeSN();
        return resultSN;
    }



}
