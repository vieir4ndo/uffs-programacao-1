/*
3) Utilizando as classes e interfaces da questão 1), implemente o método 
void processa(Entidade e[], int dx, int dy). 
Uma Entidade, no contexto da aplicação na qual esse método está inserido, faz parte de um
sistema que descreve um campo de guerra, composto por soldados, estruturas de combate, etc, todos posicionados
utilizando uma grade (plano Cartesiano). 
Para que o sistema funcione, processa() é chamado uma vez por
segundo, e sua função é atualizar todas as entradas do vetor (através do método atualiza()de cada objeto). Além
de atualizar a entrada, se ela for uma construção, o método produzir()dela deve ser invocado também; se a
entrada for um Arqueiro, Cavaleiro, Bombeiro ou Trabalhador, ela deve ser movida para a posição
informada por dxe dy(utilizando-se os métodos moveX()e moveY()). Se a entrada em questão for uma Unidade
e ela estiver morta (estahMorta() retornou true), essa unidade deve ser posicionada na origem (0,0),
utilizando-se o método posiciona().
*/

public class Exe3 {
    public static void main(String args[]) {

    }

    // primeiro, onde fica o método que é pra implementar?
    // segundo, entidade nao tem atualiza nem o objeto que tem atualiza
    // não faz sentido

    public void processa(Entidade e[], int dx, int dy) {
        for (Entidade entidade : e) {

        }
    }
}

abstract class Entidade {
    public int x, y;

    public abstract void posiciona(int x, int y);
}

interface Movel {
    public void moveX(int q);

    public void moveY(int q);
}

interface Atualizavel {
    public void atualiza();
}

interface Serializavel {
    public int[] serializa();

    public void deserializa(int[] v);
}

interface Combativel {
    public boolean podeCombater(Combativel c)
}

class Unidade extends Entidade implements Movel, Atualizavel {
    public void atacar() {
    }

    public float distanciaBase() {
    }

    public boolean estahMorta() {
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

class Construcao extends Entidade implements Atualizavel {
    public void produzir() {
    }

    @Override
    public void atualiza() {
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

class Trabalhador extends Unidade {
    public void executaTarefa() {

    };
}

class Arqueiro extends Infantaria {
    public void atiraFlecha() {

    };
}

class Cavaleiro extends Infantaria {
    public void cavalga() {

    };
}

class Bombeiro extends Infantaria {
    public void explode() {

    };
}

class Ferraria extends Construcao {
    public void carrega() {

    };
}

class Quartel extends Construcao {
    public void treina() {

    };
}