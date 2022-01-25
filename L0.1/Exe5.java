/*
5) Dado o código da classe abaixo, implemente pelo menos três métodos construtores que instanciem objetos da
classe recebendo 1, 2 e três parâmetros, respectivamente. Em seguida, crie um programa que instancia 3 objetos
da classe, cada um deles usando um dos construtores criados anteriormente.
*/

public class Exe5 {
    public static void main(String args[]){
        Pessoa p1 = new Pessoa("Matheus"), p2 = new Pessoa("Fernando", 70.5), p3 = new Pessoa("Isabella", 20.5, 7);
    }
} 

class Pessoa {
    private String nome;
    private double peso;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
        this.peso = 0;
        this.idade = 0;
    }
    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
        this.idade = 0;
    }
        public Pessoa(String nome, double peso, int idade){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
}