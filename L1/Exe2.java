/*
2) A classe abaixo representa uma compra num software de comércio. A classe está com o código de seus métodos
incompleto. Escreva o código faltante dos métodos da classe Compra e escreva um programa em Java que instancie
um objeto da classe Compra, leia do teclado as informações necessárias para preencher todas as propriedades do
objeto e, por último, imprima essas informações através do método imprimeResumo().
*/
import java.util.Scanner;

public class Exe2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        float preco = in.nextFloat();
        int quantidade = in.nextInt();
        Compra c1 = new Compra(nome, preco, quantidade);
        c1.imprimeResumo();
    }
} 

class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra(String produto, float preco, int quantidade) {
        this.nomeProduto= produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;
    }
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getPreco() {
        return this.preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }

    // Imprime todas as propriedades da classe
    public void imprimeResumo() {
        System.out.println("Compra");
        System.out.println("Nome produto: "+ this.nomeProduto);
        System.out.println("Preco produto: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
