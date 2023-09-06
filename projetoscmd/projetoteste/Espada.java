package projetoteste;
import java.util.Scanner;

public class Espada {
    
    Scanner entrada = new Scanner(System.in);
    String resp;
    String nome;
    int forca;
    int tamanho;
    String lore;
    private String usuario;
    

    public void registrar(){
        System.out.print("Digite o nome:.. ");
        this.resp = entrada.nextLine();
        while(resp.equals("")){
            System.out.println("*obrigatório*");
            System.out.print("Digite o nome:.. ");
            this.resp = entrada.nextLine();
        }
            this.nome = this.resp;
       
        System.out.print("Digite a força:.. ");
        this.resp = entrada.nextLine();
        this.forca =Integer.parseInt(resp);
        System.out.print("Digite o tamanho:.. ");
        this.resp = entrada.nextLine();
        this.tamanho =Integer.parseInt(resp);
        System.out.print("Digite a lore:.. ");
        this.lore = entrada.nextLine();

        System.out.println("");
        
        System.out.println(this.nome);
        System.out.println(this.forca);
        System.out.println(this.tamanho);
        System.out.println(this.lore);
        System.out.println("teste");

    }

    public void setUsuario(String usuario){
        this.usuario = usuario.toUpperCase();  //variável usuario da classe (this.) Espada recebe o valor usuario do void tudo maiúsculo
    }

    public String getUsuario(){
        return usuario;
    }

    
}
