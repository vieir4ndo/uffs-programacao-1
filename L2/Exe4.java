/*
4) Dadas as classes abaixo, mostre o que será impresso na tela quando o programa Mainfor executado
 */

public class Exe4 {
    public static void main(String args[]) {
        Sprite s = new Sprite(1, 2);
        MovieClip m = new MovieClip(5.5f);
        MovieBlock b = new MovieBlock(7.3f);
        // 1 2
        System.out.println(s.resumo());

        // 1 2
        s.imprime();

        //x = 22
        //Negativo!
        m.negativo();

        //x = 22
        m.inverte();

        //Movie: 12 22 5.5
        m.imprime();

        //Movie: 12 22 5.5
        //Soi
        m.oi();

        //b.x = 40
        System.out.println("b.x = " + b.getX());

        //Block: resumo 7.3
        //Block 40
        b.imprime();

        //b inverte
        //Negativo!
        b.negativo();
    }
}

class Sprite {
    private int x;
    public int scaleY;
    public Sprite(int x, int s) {
        this.x = x;
        this.scaleY = s;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int i) {
        this.x = i;
    }
    public void oi() {
        imprime();
        System.out.println("Soi");
    }
    public void inverte() {
        this.x = this.scaleY;
        System.out.println("x = " + getX());
    }
    public String resumo() {
        return x + " " + scaleY;
    }
    public void imprime() {
        System.out.println(getX() + " " + scaleY);
    }
}

class MovieClip extends Sprite {
    private float alpha;
    public MovieClip(float h) {
        super(10, 22);
        alpha = h;
        setX(12);
    }
    public void negativo() {
        inverte();
        alpha = 0;
        System.out.println("Negativo!");
    }
    public String resumo() {
        return "Movie: " + super.resumo();
    }
    public void imprime() {
        System.out.println(resumo() + " " + alpha);
    }
}

class MovieBlock extends MovieClip {
    public MovieBlock(float h) {
        super(h);
        setX(40);
    }
    public String resumo() {
        return "Block: resumo";
    }
    public void imprime() {
        super.imprime();
        System.out.println("Block " + getX());
    }
    public void inverte() {
        setX(900);
        System.out.println("b inverte");
    }
}