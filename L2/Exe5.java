/*
5) Utilizando o diagrama UML da questão 1), imagine que você foi incumbido de criar uma classe nova chamada
InimigoVolatil, que é filha da classe Inimigo. Ao contrário de sua classe pai, a classe InimigoVolatil não
utiliza a propriedade vida quando os métodos getVida()e setVida()são invocados, ela usa uma combinação
das propriedades posicao e velocidade. 
O método getVida(), por exemplo, retorna a soma dos valores x e y da propriedade posicao do objeto; 
o método setVida(int v)coloca o valor de vnos atributos ae bda propriedade velocidadedo objeto. 
O método getEnergia()da classe InimigoVolatiltambém funciona de forma diferente: ele retorna o valor da propriedade vidasomada com a propriedade energia.
Implemente a classe InimigoVolatil, fazendo as alterações necessárias para que os métodos getVida(),
setVida()e getEnergia()funcionem conforme o que foi descrito
*/

public class Exe5 {
    public static void main(String args[]) {
        InimigoVolatil i1 = new InimigoVolatil();
        InimigoVolatil i2 = new InimigoVolatil();
        InimigoVolatil i3 = new InimigoVolatil();
        Inimigo i4 = new Inimigo();
        Inimigo i5 = new Inimigo();
        Inimigo i6 = new Inimigo();

        Forca v1 = new Forca();
        Forca v2 = new Forca();
        Forca v3 = new Forca();
        Forca v4 = new Forca();
        Forca v5 = new Forca();
        Forca v6 = new Forca();

        v1.setA(10);
        v1.setB(15);
        v2.setA(10);
        v2.setB(15);
        v3.setA(15);
        v3.setB(10);
        v4.setA(10);
        v4.setB(15);
        v5.setA(10);
        v5.setB(15);
        v6.setA(15);
        v6.setB(10);

        Posicao pos1 = new Posicao();
        Posicao pos2 = new Posicao();
        Posicao pos3 = new Posicao();
        Posicao pos4 = new Posicao();
        Posicao pos5 = new Posicao();
        Posicao pos6 = new Posicao();

        pos1.setX(80);
        pos1.setY(99);
        pos2.setX(200);
        pos2.setY(200);
        pos3.setX(200);
        pos3.setY(200);
        pos4.setX(80);
        pos4.setY(99);
        pos5.setX(200);
        pos5.setY(200);
        pos6.setX(200);
        pos6.setY(200);

        i1.setPosicao(pos1);
        i2.setPosicao(pos2);
        i3.setPosicao(pos3);

        i1.setVelocidade(v1);
        i2.setVelocidade(v2);
        i3.setVelocidade(v3);

        i4.setPosicao(pos4);
        i5.setPosicao(pos5);
        i6.setPosicao(pos6);

        i4.setVelocidade(v4);
        i5.setVelocidade(v5);
        i6.setVelocidade(v6);

        i2.setVida(100);
        i5.setVida(100);

        System.out.println("Inimigo Volátil getVida(): " + i1.getVida());
        System.out.println("Inimigo getVida(): " + i4.getVida());

        System.out.println(
                "Inimigo Volátil setVida()/ getA() e getB():" + i2.getVelocidade().getA() + " "
                        + i2.getVelocidade().getB());
        System.out.println(
                "Inimigo setVida()/ getA() e getB():" + i5.getVelocidade().getA() + " "
                        + i5.getVelocidade().getB());

        System.out.println("Inimigo Volátil getEnergia(): " + i3.getEnergia());
        System.out.println("Inimigo getEnergia(): " + i6.getEnergia());

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
        // to do?
        return 10f;
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

class InimigoVolatil extends Inimigo {
    @Override
    public int getVida() {
        return this.getPosicao().getX() + this.getPosicao().getY();
    }

    @Override
    public void setVida(int v) {
        this.getVelocidade().setA(v);
        this.getVelocidade().setB(v);
    }

    @Override
    public int getEnergia() {
        return this.getVida() + this.getVida();
    }
}