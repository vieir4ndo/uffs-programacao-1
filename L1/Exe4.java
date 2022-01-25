/*
4) Dado o código abaixo, qual a saída do programa na tela? Justifique sua resposta desenhando e explicando a
representação na memória dos elementos do programa:
*/

public class Exe4 {
    public static void main(String args[]){
        double d = 2.7;
        Box b = new Box();
        b.doMinus(d);
        //imprime 2.7
        System.out.println(d);
        //imprime Box: 9 0.0.
        System.out.println(b.explain());
    }
} 
class Box {
    public double d;
    private int i;

    public void doMinus(double d) {
        d = d - 10; // fica -7 algo, mas se perde pq o param e a prop tem mesmo nome 
        i = 9;
    }

    public String explain() {
        return "Box: " + this.i + " " + this.d;
    }
}