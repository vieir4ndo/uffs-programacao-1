/*
10) Dada a classe abaixo:
Implemente a classe Son, sem criar propriedades e herdando da classe Father, para que o código acima gere a
seguinte saída:
*/

public class Exe10 {
    public static void main(String args[]) {
        Father f = new Father();
        Son s = new Son();
        f.setLado(2);
        f.translada(5, 6);
        System.out.println(f.debug());
        s.setLado(10);
        s.translada(10, 11);
        s.escala(0.5);
        System.out.println("Lado encolhido: " + s.getLado());
        System.out.println(s.debug());
    }
}

class Father {
    private int x, y, lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int l) {
        lado = l;
    }

    public int area() {
        return lado * lado;
    }

    public void translada(int a, int b) {
        x = a;
        y = b;
    }

    public String debug() {
        return getLado() + " (" + x + "," + y + ") = " + area();
    }
}

class Son extends Father {
    public void escala(double texto) {
        this.debug();
        this.setLado(5);
    }

    @Override
    public int area() {
        return this.getLado() * (-this.getLado());
    }
}