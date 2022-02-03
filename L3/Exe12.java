/*
9) Utilizando as classes e interfaces da questão 8, complete o código abaixo para que compile e funcione
corretamente:
*/

public class Exe12 {
    public static void main(String args[]) {
        BatedorRapido br = new BatedorRapido();
        Ferreiro f = new Ferreiro();
        Prefeito p = new Prefeito();
        Inimigo i;
        Batedor b;
        Corredor c;
        Nadador n;
        i = br; // não use "new" aqui e "i" não pode ser null.
        c = f;
        if (i.getClass() == br.getClass()) {
            b = (Batedor) i;
        }
        NPC npc = (NPC) c; // não tinha sido declado npc
        c = p;
        n = new Armeiro();
        Armeiro a = (Armeiro) n;
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
        System.out.println("Ataca");
    }

    public void defende() {
        System.out.println("Defende");
    }

    @Override
    public void nada() {
        System.out.println("Nada");
    }

    @Override
    public void mergulha() {
        System.out.println("Mergulha");
    }

    @Override
    public void corre() {
        System.out.println("Corre");
    }

    @Override
    public void pula() {
        System.out.println("Pula");
    }

    @Override
    public void voa() {
        System.out.println("Voa");
    }

    @Override
    public void pousa() {
        System.out.println("Pousa");
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
        System.out.println("Reporta");
    }
}

class BatedorRapido extends Batedor {
    public void olhadinha() {
        System.out.println("Olhadinha");
    }
}

class Armeiro extends Inimigo {
    public void engatilha() {
        System.out.println("Engatilha");
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
        Batedor batedor = new Batedor();
        BatedorRapido batedorRapido = new BatedorRapido();
        Armeiro armeiro = new Armeiro();
        // Auxiliar auxiliar = new Auxiliar();
        // Ferreiro ferreiro = new Ferreiro();
        // Prefeito prefeito = new Prefeito();
        // Não podem ser implementados pois nao são filhos de Inimigo

        for (Inimigo item : v) {
            if (base.getClass() == item.getClass()) {
                chamaMetodosInimigo(item);

                if (item.getClass() == inimigo.getClass()) {
                    continue;
                }
                if (item.getClass() == batedor.getClass()) {
                    batedor = (Batedor) item;
                    batedor.reporta();
                    continue;
                }
                if (item.getClass() == batedorRapido.getClass()) {
                    batedorRapido = (BatedorRapido) item;
                    batedorRapido.reporta();
                    batedorRapido.olhadinha();
                    continue;
                }
                if (item.getClass() == armeiro.getClass()) {
                    armeiro = (Armeiro) item;
                    armeiro.engatilha();
                    continue;
                }
            }

        }
    }

    private static void chamaMetodosInimigo(Inimigo i) {
        i.voa();
        i.pousa();
        i.corre();
        i.pula();
        i.nada();
        i.mergulha();
    }
}