/*
1) A classe abaixo representa uma pessoa. A classe está com o código de seus métodos incompleto. Escreva o código
faltante dos métodos da classe Pessoa e escreva um programa em Java que instancie um objeto da classe
Pessoa, leia do teclado as informações necessárias para preencher todas as propriedades do objeto e, por último,
imprima essas informações através do método imprimeDados().
*/
import java.util.Scanner;

public class Exe1 {
    public static void main(String args[]){

        Pessoa p1 = new Pessoa();
        Scanner in = new Scanner( System.in );

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