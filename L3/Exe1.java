
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
    public boolean podeCombater(Combativel c);
}

class Unidade extends Entidade implements Movel, Atualizavel {
    public void atacar() {
    }

    public float distanciaBase() {
        return 2f;
    }

    public boolean estahMorta() {
        return false;
    }

    public void atualiza() {

    }

    public void moveX(int q) {

    }

    public void moveY(int q) {

    }

    public void posiciona(int x, int y) {

    }
}

class Construcao extends Entidade implements Atualizavel {
    public void produzir() {
    }

    public void atualiza() {

    }

    public void posiciona(int x, int y) {

    }
}

class Infantaria extends Unidade implements Combativel {
    public void caminha() {
    }

    public boolean podeCombater(Combativel c) {
        return false;
    }
}

class Trabalhador extends Unidade {
    public void executaTarefa() {
    }
}

class Arqueiro extends Infantaria {
    public void atiraFlecha() {
    }
}

class Cavaleiro extends Infantaria {
    public void cavalga() {
    }
}

class Bombeiro extends Infantaria {
    public void explode() {
    }
}

class Ferraria extends Construcao {
    public void carrega() {
    }
}

class Quartel extends Construcao {
    public void treina() {
    }
}

