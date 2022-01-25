/*
2) Implemente um construtor para a classe Pessoa do Exercício 1). O construtor deve atribuir valores a todas as
propriedades do objeto que está sendo instanciado. Escreva um programa em Java que faça o seguinte.
Primeiramente, o programa instancia um objeto da classe Pessoa e imprime os valores das propriedades do objeto
usando o método imprimeDados(). Em seguida, o programa lê do teclado as informações necessárias para
modificar todas as propriedades do objeto instanciado e imprime novamente os valores das propriedades do objeto
usando o método imprimeDados().
*/
import java.util.Scanner;

public class Exe2 {
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        Pessoa p1 = new Pessoa("Matheus", 22, 65.5f);
        p1.imprimeDados();

        System.out.println("Digite o nome da pessoa:");
        p1.setNome(in.nextLine());

        System.out.println("Digite o peso da pessoa:");
        p1.setPeso(in.nextFloat());

        System.out.println("Digite a idade da pessoa:");
        p1.setIdade(in.nextInt());     

        p1.imprimeDados();
    }
} 

class Pessoa {
    private String nome;
    private int idade;
    private float peso;

    public Pessoa(
        String nome,
        int idade,
        float peso
    ){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Imprime todas as propriedades da classe
    public void imprimeDados() {
        System.out.println("Pessoa");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Idade: "+ this.idade);
    }
} 