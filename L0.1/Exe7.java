/*
7) Dada a classe abaixo, que possui vários construtores com diferentes assinaturas:
*/

public class Exe7 {
    public static void main(String args[]){
     letraA();
    }

    public static void letraA(){
        //a) Informe o que o programa abaixo imprimirá na tela, monstrando a representação de memória que o programa terá ao final da execução da main.
        //Cria dois objetos Compra c1 e c2 . instancia o c2 com terceiro construtor
        Compra c1, c2 = new Compra("Livro java");
        //Cria objeto c3
        Compra c3;
        //Instancia objeto c3 com primeiro construtor
        c3 = new Compra("Arroz", 2.5f, 3);
        //Não imprime nada
    }
    public static void letraB(){
        //b) Informe o que o programa abaixo imprimirá na tela, monstrando a representação de memória que o programa terá ao final da execução da main.
         //Cria um objeto Compra c1 e instancia o c1 com segundo construtor
         //Cria um objeto Compra c2 e instancia o c2 com terceiro construtor
        Compra c1 = new Compra("Feijão", 5.6f), c2 = new Compra("Livro");
        //Cria um objeto Compra c3 e instancia o c3 com primeiro construtor
        Compra c3 = new Compra("Arroz", 2.5f, 3);
        //Não imprime nada
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
}
