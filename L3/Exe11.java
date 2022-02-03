/*
*/

public class Exe11 {
    public static void main(String args[]) {

    }
}

interface Voador {
    public void voa();

    public void pousa();
}

interface Corredor {
    public void corre();

    public void pula();
}

interface Nadador {
    public void nada();

    public void mergulha();
}

class Inimigo implements Voador, Corredor, Nadador {
    public void ataca() {
    }

    public void defende() {
    }

    @Override
    public void nada() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mergulha() {
        // TODO Auto-generated method stub

    }

    @Override
    public void corre() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pula() {
        // TODO Auto-generated method stub

    }

    @Override
    public void voa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pousa() {
        // TODO Auto-generated method stub

    }
}

class NPC implements Corredor {
    public int fala() {
        return 0;
    }

    @Override
    public void corre() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pula() {
        // TODO Auto-generated method stub

    }
}

class Batedor extends Inimigo {
    public void reporta() {
    }
}

class BatedorRapido extends Batedor {
    public void olhadinha() {
    }
}

class Armeiro extends Inimigo {
    public void engatilha() {
    }
}

class Auxiliar extends NPC {
    public void ajuda() {
    }
}

class Ferreiro extends NPC {
    public void forja() {
    }
}

class Prefeito implements Corredor, Nadador {
    public void manda() {
    }

    @Override
    public void nada() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mergulha() {
        // TODO Auto-generated method stub

    }

    @Override
    public void corre() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pula() {
        // TODO Auto-generated method stub

    }
}

class Service {
    public static void invocaMetodos(Inimigo v[], Inimigo base) {
        Inimigo inimigo = new Inimigo();
        NPC npc = new NPC();
        Batedor batedor = new Batedor();
        BatedorRapido batedorRapido = new BatedorRapido();
        Armeiro armeiro = new Armeiro();
        Auxiliar auxiliar = new Auxiliar();
        Ferreiro ferreiro = new Ferreiro();
        Prefeito prefeito = new Prefeito();

        for (Inimigo item : v) {
            if (item.getClass() == inimigo.getClass()) {
                chamaMetodosInimigo(item);
            }

            if (item.getClass() == batedor.getClass()) {
                chamaMetodosInimigo(item);
                Batedor b = (Batedor) item;
                b.reporta();
            }

            if (item.getClass() == batedorRapido.getClass()) {
                chamaMetodosInimigo(item);
                Batedor b = (Batedor) item;
                b.reporta();
                BatedorRapido b1 = (BatedorRapido) item;
                b1.olhadinha();
            }

            if (item.getClass() == armeiro.getClass()) {
                chamaMetodosInimigo(item);
                Armeiro a = (Armeiro) item;
                item.
            }
        }
    }

    public static void chamaMetodosInimigo(Inimigo i) {
        i.voa();
        i.pousa();
        i.corre();
        i.pula();
        i.nada();
        i.mergulha();
    }

    public static void chamaMetodosNPC(Inimigo i) {
        i.corre();
        i.pula();
    }
}