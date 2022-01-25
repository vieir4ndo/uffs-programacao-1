/*
3) Dados os códigos abaixos, qual a saída do programa Main na tela? Justifique sua resposta desenhando e
explicando a representação na memória dos elementos do programa:
*/

public class Exe3 {
    public static void main(String args[]){
        //cria três objetos, espaços na memória diferentes, e atribui lado como 2 para os objs c1 e o c2
        Quadrado c1 = new Quadrado(), c2 = new Quadrado(), c3;

        //seta o atributo lado do objeto c2 como 5
        c2.lado = 5;

        //cria o objeto f, espaço na memória, e instancia o f
        Forma f = new Forma();

        //chama o metodo imprimeQuadrado no objeto f passando o objeto c1
        //objeto c1 tem prop lado = 2
        //imprime lado = 2 e area = 4
        f.imprimeQuadrado(c1);

        //chama o metodo imprimeQuadrado no objeto f passando o objeto c2
        //objeto c2 tem valor 5 na propriedade lado
        //imprime lado = 5 e area = 25
        f.imprimeQuadrado(c2);

        //espaço na memória c3 aponta para retorno do método multi executado a partir do objeto f e recebendo os objetos c1 e c2 como parametros
        //retorna objeto quadrado com lado 10
        c3 = f.multi(c1, c2);

        //chama o metodo imprimeQuadrado no objeto f passando o objeto c3
        //objeto c3 tem valor 10 na propriedade lado
        //imprime lado = 10 e area = 100
        f.imprimeQuadrado(c3);
    }
} 

class Quadrado {
    public int lado;
    public Quadrado() {
        this.lado = 2;
    }
    public int area() {
        int r = this.lado * this.lado;
        return r;
    }
}

class Forma {
    public void imprimeQuadrado(Quadrado d) {
        System.out.println("lado = " + d.lado);
        System.out.println("area = " + d.area());
    }
    public Quadrado multi(Quadrado a, Quadrado b) {
        Quadrado q = new Quadrado();
        q.lado = a.lado * b.lado;
        return q;
    }
}
