/*
3) O código abaixo foi feito por um membro da sua equipe, que alegou que o resultado é modular e encapsulado. A
classe FlxSprite, segundo seu colega, não pode ser alterada pois é código legado da aplicação. Ele mostrou a
você alguns casos de uso da classe FlxSprite: casos #1, #2 e #3 (veja eles abaixo). Você argumentou que a classe FlxSprite não parecia encapsulada ou modular, e que uma alternativa seria criar uma nova classe, chamada
Character, que herda de FlxSpritee faz a inicialização de todos os atributos no momento da instanciação.
*/

public class Exe3 {
    public static void main(String args[]) {
        Character c1 = new Character("", "", true, 10, 10);
    }
}

class FlxObject {
    private String label;

    public FlxObject(String h) {
        setLabel(h);
    }

    public void setLabel(String h) {
        label = h;
    }
}

class FlxSprite extends FlxObject {
    private String graphic;
    private boolean alive;
    public int x, y;

    public FlxSprite(String j) {
        super(j);
    }

    void setAlive(boolean b) {
        alive = b;
    }

    void loadGraphics(String n) {
        graphic = n;
    }

    void reset(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Character extends FlxSprite {

    public Character(String label, String graphic, boolean alive, int x, int y) {
        super(label);
        this.setAlive(alive);
        this.loadGraphics(graphic);
        this.reset(x, y);
    }
}