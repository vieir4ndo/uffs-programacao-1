/*
1) Dado o diagrama UML abaixo:
Implemente os seguintes métodos:
a) int contaPossiveisCandidatos(Inimigo i[])- método estático pertencente à classe Services(crie
essa classe também). Retorna o número de objetos do vetor que tenham: posição xou ymaiores que 100, energia
menor ou igual a 50e velocidadecom tamanho igual a 200.

b) Inimigo achaAlvoMaisProximo(Inimigo i[])- método pertencente à classe Inimigo. O método itera no
vetor de inimigos recebido como parâmetro, retornando o inimigo cujas componentes x,yda posição E as
componentes a,bda velocidade sejam iguais aos do objeto que invocou o método.

*/

import java.util.Arrays;

public class Exe1 {
    public static void main(String args[]) {
        Inimigo i1 = new Inimigo();
        Inimigo i2 = new Inimigo();
        Inimigo i3 = new Inimigo();

        Forca v1 = new Forca();
        Forca v2 = new Forca();
        Forca v3 = new Forca();

        v1.setA(10);
        v1.setB(15);

        v2.setA(10);
        v2.setB(15);

        v3.setA(15);
        v3.setB(10);

        Posicao pos1 = new Posicao();
        Posicao pos2 = new Posicao();
        Posicao pos3 = new Posicao();

        pos1.setX(80);
        pos1.setY(99);

        pos2.setX(200);
        pos2.setY(200);

        pos3.setX(200);
        pos3.setY(200);

        i1.setPosicao(pos1);
        i2.setPosicao(pos2);
        i3.setPosicao(pos3);

        i1.setVelocidade(v1);
        i2.setVelocidade(v2);
        i3.setVelocidade(v3);

        Inimigo[] arr = { i2, i3 };

        Inimigo maisprox = i1.achaAlvoMaisProximo(arr);

        if (maisprox == i2) {
            System.out.println("Achou!");
        }

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = i1;

        System.out.println("Possíveis inimigos:" + Services.contaPossiveisCandidatos(arr));
    }
}

class Posicao {
    private int x;
    private int y;

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

class Entidade {
    private int id;
    private Posicao posicao;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public Posicao getPosicao() {
        return this.posicao;
    }

    public void setPosicao(Posicao p) {
        this.posicao = p;
    }
}

class Forca {
    private int a;
    private int b;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double tamanho() {
        return 201f;
    }
}

class Boid extends Entidade {
    private int energia;
    private Forca velocidade;

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int e) {
        this.energia = e;
    }

    public Forca getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(Forca f) {
        this.velocidade = f;
    }
}

class Inimigo extends Boid {
    private int vida;

    public int getVida() {
        return this.vida;
    }

    public void setVida(int v) {
        this.vida = v;
    }

    public Inimigo achaAlvoMaisProximo(Inimigo i[]) {
        for (Inimigo item : i) {
            if (this.getVelocidade().getA() == item.getVelocidade().getA()
                    && this.getVelocidade().getB() == item.getVelocidade().getB()) {
                return item;
            }
        }
        return null;
    }
}

class Services {

    public static int contaPossiveisCandidatos(Inimigo i[]) {
        int cont = 0;
        for (Inimigo item : i) {
            if ((item.getPosicao().getX() > 100 || item.getPosicao().getY() > 100) && (item.getEnergia() <= 50)
                    && (item.getVelocidade().tamanho() > 200)) {
                cont++;
            }
        }
        return cont;
    }

}