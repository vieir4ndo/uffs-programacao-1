/*
11) Utilize o diagrama UML abaixo:

Para a classe Personagemassuma que a propriedade itens(e seus getters/setter) não existe mais. Escreva os
métodos construtores necessários para as classes para que o trecho de código abaixo funcione e inicialize todas as
propriedades dos objetos instanciados. Você não pode criar métodos que não sejam construtores (como getters e
setters), apenas usar os já existentes.
*/

public class Exe11 {
    public static void main(String args[]) {
        int x = 5, y = 6, ouro = 10, vida = 500;
        Entidade e = new Entidade(x, y, vida);
        Entidade e2 = new Entidade(); // inicializa todas os atributos com zero
        Personagem p = new Personagem(ouro, vida, x, y);
        Personagem p2 = new Personagem(ouro, vida); // inicializa a posição em (0,0)
    }
}

class Entidade {
    private int vida;
    private Posicao posicao;

    public Entidade() {
        this.vida = 0;
        this.posicao = new Posicao(0, 0);
    }

    public Entidade(int x, int y, int vida) {
        this.posicao = new Posicao(x, y);
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int e) {
        this.vida = e;
    }

    public Posicao getPosicao() {
        return this.posicao;
    }

    public void setPosicao(Posicao p) {
        this.posicao = p;
    }
}

class Posicao {
    private int x;
    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Item {
    private String nome;
    public int custo;

    public Item(String nome, int custo) {
        this.nome = nome;
        this.custo = custo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Personagem extends Entidade {
    private int ouro;
    private Item[] itens;

    public Personagem(int ouro, int vida, int x, int y) {
        super(x, y, vida);
        this.ouro = ouro;
        this.itens = new Item[] {
                new Item("", 0)
        };
    }

    public Personagem(int ouro, int vida) {
        super(0, 0, vida);
        this.ouro = ouro;
        this.itens = new Item[] {
                new Item("", 0)
        };
    }

    public int getOuro() {
        return this.ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public Item[] getItens() {
        return this.itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}