abstract class Entidade { public int x,y; public abstract void posiciona(int x,int y);}
interface Movel { public void moveX(int q); public void moveY(int q); }
interface Atualizavel { public void atualiza(); }
interface Serializavel { public int[] serializa(); public void deserializa(int[] v); }
interface Combativel { public boolean podeCombater(Combativel c) }
class Unidade extends Entidade implements Movel, Atualizavel {
public void atacar() { }
public float distanciaBase() { }
public boolean estahMorta() { }
}
class Construcao extends Entidade implements Atualizavel {
public void produzir() { }
}
class Infantaria extends Unidade implements Combativel { public void caminha(); }
class Trabalhador extends Unidade { public void executaTarefa(); }
class Arqueiro extends Infantaria { public void atiraFlecha(); }
class Cavaleiro extends Infantaria { public void cavalga(); }
class Bombeiro extends Infantaria { public void explode(); }
class Ferraria extends Construcao { public void carrega(); }
class Quartel extends Construcao { public void treina(); }