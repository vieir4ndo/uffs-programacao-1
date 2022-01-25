/*
8) Dado o código abaixo, qual a saída do programa na tela? Justifique sua resposta desenhando e explicando a
representação na memória dos elementos do programa:
*/

class Exe8 {
    public static void main(String[] args) {
        //cria dois objetos a e b da classe Sprite e inicializa ambos com o construtor padrao do java
        Sprite a = new Sprite(), b = new Sprite();
        //chama o metodo clona no objeto a passando o obj b como parametro
        //o id do objeto a muda para 3
        //imprime texto Sprite 2,0 3
        a.clona(b);
        //chama o metodo clona no objeto b passando o obj a
        //o id do objeto b muda para 3
        //imprime texto Sprite 2.0, 3
        b.clona(a);
        //atribui 90 ao value do objeto b
        b.value = 90;
        //imprime texto Sprite 0.0, 3 (já value nunca foi atribuido para a)
        a.print();
        //imprime texto Sprite 90.0, 3
        b.print();
    }
}
class Sprite {
    public double value;
    public int id;

    public void clona(Sprite s) {
        Sprite h = new Sprite();
        h.value = 2;
        h.id = 3;
        s = h;
        id = h.id;
        h.print();
    }

    public void print() {
        System.out.println("Sprite " + value + ", " + id); 
    }
}