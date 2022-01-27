import java.lang.reflect.Method;

/*
2) Utilizando as interfaces da questão 1), escreva o código completo para uma classe chamada Elemento. 
Essa classe possui 2 atributos públicos inteiros (seriale nivel), 
é filha de Entidadee 
implementa as interfaces Serializavel e Combativel. 

Os métodos serializa() e deserializa()da interface Serializavel
formam um par: o primeiro retorna um vetor de inteiros contendo uma entrada para cada propriedade do objeto,

o segundo recebe um vetor desse tipo e reconstroi o objeto, atribuindo cada uma das entradas do vetor recebido de
volta para a sua respectiva propriedade. Ex.: supondo uma classe com dois atributos inteiros, com valores 33e 9, o vetor produzido seria {33, 9}. 
O método podeCombater()da interface Combativelrecebe um Combativel
como parâmetro e retorna truese o objeto que está executando o método pode combater com o objeto recebido
como parâmetro, ou false caso contrário. Um Elemento pode combater apenas contra um Arqueiro ou
Cavaleiro. Exemplo:
*/

public class Exe2 {
    public static void main(String args[]) {
        Elemento a, b, c;
        a = new Elemento();
        a.serial = 20;
        // ... // Todas as demais propriedades de "a" também recebem 20.
        b = new Elemento();
        System.out.println(b.serial); // Imprime 0
        int s[] = a.serializa();
        b.deserializa(s);
        System.out.println(b.serial); // Imprime 20
        // ... // A impressão das demais propriedades de "b" também geram a saída 20.
    }
}

abstract class Entidade {
    public int x, y;

    public abstract void posiciona(int x, int y);
}

interface Serializavel {
    public int[] serializa();

    public void deserializa(int[] v);
}

interface Combativel {
    public boolean podeCombater(Combativel c);
}

class Elemento extends Entidade implements Serializavel, Combativel {
    public int serial;
    public int nivel;

    public int[] serializa() {
        int[] retorno = { this.serial, this.nivel };

        return retorno;
    }

    public void deserializa(int[] v) {
        this.serial = v[0];
        this.nivel = v[1];
    }

    public void posiciona(int x, int y) {
    }

    public boolean podeCombater(Combativel c) {
        Cavaleiro b = new Cavaleiro();
        Arqueiro a = new Arqueiro();

        return c.getClass() == a.getClass() || c.getClass() == b.getClass();
    }

}

interface Movel {
    public void moveX(int q);

    public void moveY(int q);
}

interface Atualizavel {
    public void atualiza();
}

class Unidade extends Entidade implements Movel, Atualizavel {
    public void atacar() {
    }

    public float distanciaBase() {
        return x;
    }

    public boolean estahMorta() {
        return false;
    }

    @Override
    public void atualiza() {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveX(int q) {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveY(int q) {
        // TODO Auto-generated method stub

    }

    @Override
    public void posiciona(int x, int y) {
        // TODO Auto-generated method stub

    }
}

class Infantaria extends Unidade implements Combativel {
    public void caminha() {

    };

    @Override
    public boolean podeCombater(Combativel c) {
        // TODO Auto-generated method stub
        return false;
    }
}

class Arqueiro extends Infantaria {
    public void atiraFlecha() {

    };
}

class Cavaleiro extends Infantaria {
    public void cavalga() {

    };
}
