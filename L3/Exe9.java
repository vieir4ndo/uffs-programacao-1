/*
*/

public class Exe9 {
    public static void main(String args[]) {
        Personagem a = new Personagem(1, 2, 3, "Joao");
        Personagem b = new Personagem(2, 6, 8, "Mari");
        System.out.println(a.serializa()); // id=1;x=2;y=3;nome=Joao
        System.out.println(b.serializa()); // id=2;x=6;y=8;nome=Mari
        b.carrega(a);
        System.out.println(b.serializa()); // id=1;x=2;y=3;nome=Joao
    }
}

interface Serializavel {
    // Retorna uma string com o nome e o valor de todas as propriedades
    // do objeto. Ex. se a classe possuir as propriedades "campo", "valor" e "id",
    // todos inteiros e com valor 1, o método retornaria: "campo=1;valor=1;id=1".
    public String serializa();

    // Altera o valor das propriedades do objeto conforme o objeto "s" informado
    public void carrega(Serializavel s);
}

class Personagem implements Serializavel {
    private int id, x, y;
    private String nome;

    public Personagem(int id, int x, int y, String nome) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    @Override
    public String serializa() {
        return "id=" + this.id + ";x=" + this.x + ";y=" + this.y + ";nome=" + this.nome;
    }

    @Override
    public void carrega(Serializavel s) {
        Personagem p = (Personagem) s;
        this.id = p.id;
        this.x = p.x;
        this.y = p.y;
        this.nome = p.nome;
    }
}