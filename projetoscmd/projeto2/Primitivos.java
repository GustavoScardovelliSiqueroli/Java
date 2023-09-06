package projeto2;

public class Primitivos {
    public static void main(String[] args){

        boolean estaVivo = true;
        byte b = 127;
        byte c = 'c';
        char d = 'd';
        String palavra = "palavra";
        short e = 19238; //Mesma coisa que o int, mas com menos espaço.
        int f = 1231283713;
        long g = 1293123981283121312L; //^ ^ ^ só que com mais espaço.
        float h = 109999999999999999999999999999999909999.2399999990999999999999999999999999999999999f; //mesma coisa que o double, porém com menos espaço.
        double i = 88888888111109102111111111111111111111111111111111111118812321111111111111111111111111111111111111111111111111111111111111111111118888888888888888888888888888888888812312312312312312312312312312888888888888888881039120391230123091203921310239120391203901293012102931203912398172389127123123123123123888888888.12301931023912312030123901293091231203912309120391293021931;
        

        double x = 121.231;
        short y = 98;
        int z = (int) x / y; //Convertendo para int com (int)
        double w = (double) x / y;
        System.out.println(z);
        System.out.println(w);

        //para converter outras coisas basta mudar o conteúdo do parenteses. Ex: (short), (double) etc...
    
    
    
    }
}
