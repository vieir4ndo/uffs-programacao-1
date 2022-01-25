/*
4) Dada a classe Compra do exercício 7), implemente os métodos getter e setter para que seja possível ler e
colocar valores nas propriedades dos objetos dessa classe.
*/

public class Exe4 {
    public static void main(String args[]){
     Compra c = new Compra();

     System.out.println(c.getNome()+c.getPreco()+c.getQuantidade());

     c.setNome("Teste");
     c.setPreco(10.6f);
     c.setQuantidade(10);
     
     System.out.println(c.getNome()+c.getPreco()+c.getQuantidade());
    }
} 

class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra(String produto, float preco, int quantidade) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Compra(String produto, float preco) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Compra(String produto) {
        this.nomeProduto = produto;
        this.preco = 5.0f;
        this.quantidade = 0;
    }

    public Compra() {
        this.nomeProduto = "Nenhum";
        this.preco = 2.0f;
        this.quantidade = 0;
    }

    public void setNome(String nome){
        this.nomeProduto = nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nomeProduto;
    }

    public float getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
}
