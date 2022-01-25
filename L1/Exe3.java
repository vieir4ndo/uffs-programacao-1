/*
3) Dado o código das classes abaixo, qual será a saída do programa na tela? Justifique
*/

public class Exe3 {
    public static void main(String args[]){
        //A saida será goodbye hello pois informamos um inteiro pro construtor
        // e nesse construtor ele chama o construtor que recebe uma string uenviando hello como parametro
        //analogamente o construtor por string chama o construtor sem parametros que imprime goodbyna tela
        // e em sequencia, ainda no construtor por string é impresso a string enviar, ou seja, hello
        Tester t = new Tester(5);
    }
} 

class Tester {
    private int var;

    public Tester(double var) { 
        this.var = (int)var; 
    }

    public Tester(int var) { 
        this("hello");
    }

    public Tester() {
        System.out.println("good­bye"); 
    }

    public Tester(String s) {
        this();
        System.out.println(s);
    }
}
