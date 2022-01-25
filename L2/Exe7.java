/*
7) Utilize o diagrama UML abaixo. Escreva os métodos construtores necessários para as classes para que um objeto Jogadorpossa ser instanciado e tenha todas as suas propriedades inicializadas através de parâmetros informados (vide exemplo abaixo). Você não pode criar métodos que não sejam construtores (como getters e setters), apenas usar os já existentes.
*/

public class Exe7 {
    public static void main(String args[]) {
        String h[] = { "", "" };
        int vida = 0, energia = 0, x = 0, y = 0, id = 0;
        Jogador j = new Jogador(vida, energia, x, y, id, h);
        j.getId();
    }
}

class Basico {
    private int id;
    private String[] rotulos;

    public Basico(int id, String[] rotulos) {
        this.id = id;
        this.rotulos = rotulos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getRotulos() {
        return this.rotulos;
    }

    public void setRotulos(String[] rotulos) {
        this.rotulos = rotulos;
    }
}

class Entidade extends Basico {
    private int energia;
    private Posicao posicao;

    public Entidade(int energia, int x, int y, int id, String[] rotulos) {
        super(id, rotulos);
        this.posicao = new Posicao(x, y);
        this.energia = energia;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int e) {
        this.energia = e;
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

class Jogador extends Entidade {
    private int vida;

    public Jogador(int vida, int energia, int x, int y, int id, String[] rotulos) {
        super(energia, x, y, id, rotulos);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}