interface Pausavel {
    public void pausa();

    public void continua();
}

interface Comparavel {
    public boolean igual(Comparavel c);
}

interface Clonavel {
    public Clonavel clona();
}

class App implements Pausavel, Comparavel, Clonavel {
    public void roda() {
    }

    public void destroi() {
    }

    @Override
    public Clonavel clona() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean igual(Comparavel c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void pausa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void continua() {
        // TODO Auto-generated method stub

    }
}

class Processo implements Pausavel {
    public void fork() {
    };

    @Override
    public void pausa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void continua() {
        // TODO Auto-generated method stub

    }
}

class Gui extends App {
    public void mostra() {
    }
}

class Hud extends Gui {
    public void atualiza() {
    }
}

class Mouse extends Gui {
    public void posiciona() {
    }
}

class Compacta extends App {
    public void recebe() {
    }
}

class Copia extends Compacta {
    public void copia() {
    }
}

class Thread extends Processo {
    public boolean acao() {
        return false;
    }
}

class Disco implements Pausavel, Comparavel, Clonavel {

    @Override
    public Clonavel clona() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean igual(Comparavel c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void pausa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void continua() {
        // TODO Auto-generated method stub

    }
}