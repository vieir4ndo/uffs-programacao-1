interface Pausavel { public void pausa(); public void continua(); }
interface Comparavel { public boolean igual(Comparavel c); }
interface Clonavel { public Clonavel clona(); }
class App implements Pausavel, Comparavel, Clonavel {
public void roda() { }
public void destroi() { }
}
class Processo implements Pausavel {
public void fork();
}
class Gui extends App { public void mostra(){} }
class Hud extends Gui { public void atualiza(){} }
class Mouse extends Gui { public void posiciona(){} }
class Compacta extends App { public void recebe(){} }
class Copia extends Compacta { public void copia(){} }
class Thread extends Processo { public boolean acao(){} }
class Disco implements Pausavel, Comparavel, Clonavel { }