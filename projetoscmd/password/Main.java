package password;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        String password = "1";
        System.out.println("Digite sua senha:..");
        String pass = entrada.nextLine();
        System.out.println(pass.equals(password));
    }
}
