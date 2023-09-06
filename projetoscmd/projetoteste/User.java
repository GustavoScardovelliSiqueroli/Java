package projetoteste;
import java.util.Scanner;

public class User {

    Scanner entrada = new Scanner(System.in);
    String firstName;
    String lastName;

    public void imprimirNome(){
        System.out.println("Olá, " + this.firstName + " " + this.lastName);
    }

    public void registrar(){
        System.out.print("Digite seu nome:.. ");
        this.firstName = entrada.nextLine();
        System.out.print("Digite seu ultimo nome:.. ");
        this.lastName = entrada.nextLine();
    }

}
