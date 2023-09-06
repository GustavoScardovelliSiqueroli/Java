package manipulando;

public class Main {
    public static void main(String[] args){
        String manipulacao = "Olá mundo, esse é o novo mundo.";

        System.out.println();
        System.out.println();
        System.out.println("...........MANIPULANDO STRING...........");
        System.out.println();
        System.out.println("Monstrando a quantidade de caracteres da frase 'manipulacao' utilizando o .length() :..");
        System.out.println(manipulacao.length());
        System.out.println();
        System.out.println();
        System.out.println("A String manipulacao contem a palava 'mundo'?  ---- utilzando o .contains()");
        System.out.println(manipulacao.contains("mundo"));
        System.out.println();
        System.out.println();
        System.out.println("A onde começa a palava 'mundo' dentro da string manipulcao? ---- utilizando o .indexOf()");
        System.out.println(manipulacao.indexOf("mundo"));
        System.out.println();
        System.out.println();
        System.out.println("A onde começa a utima vez que a palava 'mundo' apareceu dentro da string manipulcao? ---- utilizando o .lastIndexOf()");
        System.out.println(manipulacao.lastIndexOf("mundo"));
        System.out.println();
        System.out.println();
        System.out.println(manipulacao.toUpperCase() + " .toUpperCase()");
        System.out.println();
        System.out.println();
        System.out.println(manipulacao.toLowerCase() + " .toLowerCase()");
        System.out.println();
        System.out.println();
        System.out.println(manipulacao.trim() + " .trim()"); //remove espaços dos cantos
        System.out.println();
        System.out.println();
        System.out.println(manipulacao.substring(10) + " .substring(10)");

    }   
    
}
