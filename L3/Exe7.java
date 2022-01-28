/*
*/

public class Exe7 {
    public static void main(String args[]){
        Num n[] = new Num[3];
        Avo a[] = new Avo[3];
        n[0] = new Filho();
        a[0] = new Filho();
        n[1] = new Pai();
        a[1] = new Pai();
        n[2] = new Parente(); 
        a[2] = new Parente();
        System.out.println("n num = " + (n[0].num() + n[1].num() + n[2].num()));
        //Imprime "n num = 3+2+1 pq os metodos num das classes filho, pai e parente (que vem de avo) retornam esses valores"
        System.out.println("a num = " + (a[0].num() + a[1].num() + a[2].num()));
        //Imprime "a num = 3+2+1 pq os metodos num das classes filho, pai e parente (que vem de avo) retornam esses valores"
        System.out.println("a outro= " + (a[0].outro() + a[1].outro() + a[2].outro()));
        //Imprime "a outro = 3+2+4 pq os metodos num das classes filho, pai e parente retornam esses valores"
    }
} 
interface Num {
    public int num();
}
abstract class Avo implements Num {
    public int num() { return 1; }
    abstract public int outro();
}
class Pai extends Avo {
    public int num() { return 2; }
    public int outro() { return 2; }
}
class Filho extends Pai {
    public int num() { return 3; }
    public int outro() { return 3; }
}
class Parente extends Avo {
public int outro() { return 4; }
}
