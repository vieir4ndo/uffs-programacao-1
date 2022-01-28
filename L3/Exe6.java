/*
6) Utilizando as interfaces citadas na questão 5), escreva o código completo para uma classe chamada Linha. Essa
classe possui 3 atributos públicos inteiros (id, tempoe prioridade) e implementa as interfaces Comparavel e
Clonavel. O método igual()da interface Comparaveldeve ser implementado de tal forma que retorna true
somente se o parâmetro passado for uma instância de Linhae o valor do atributo id for igual para os dois objetos
Linha(o que invocou o método e o que foi passado como parâmetro). 
O método clona() deve ser implementado
de forma a produzir um novo objeto que seja uma réplica (clone) do objeto que invocou o método. Veja o exemplo
abaixo:
*/

public class Exe6 {
    public static void main(String args[]){
       Linha a, b, c;
        a = new Linha(); a.id = 1; a.tempo = 10; a.prioridade = 11;
        b = new Linha(); b.id = 2; b.tempo = 20; b.prioridade = 22;
        c = new Linha(); c.id = 1; c.tempo = 30; c.prioridade = 33;
        Linha e = (Linha)b.clona();
        System.out.println( a.igual(b) ); // Imprime false
        System.out.println( a.igual(c) ); // Imprime true
        System.out.println( e.igual(a) ); // Imprime false
        System.out.println( e.igual(b) ); // Imprime true
        System.out.println( e == b ); // Imprime false
        System.out.println( e.id + " " + e.tempo); // Imprime 2 20
    }
} 

interface Comparavel {
    public boolean igual(Comparavel c);
}

interface Clonavel {
    public Clonavel clona();
}

class Linha implements Comparavel, Clonavel {
    public int id;
    public int tempo;
    public int prioridade;

    public Linha(){}

    public boolean igual(Comparavel c){
        if (this.getClass() == c.getClass()){
            Linha obj = (Linha)c;
            if (this.id == obj.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public Clonavel clona(){
        Linha obj = new Linha();
        obj.id = this.id; 
        obj.tempo = this.tempo; 
        obj.prioridade = this.prioridade;
        return obj;
    }
}