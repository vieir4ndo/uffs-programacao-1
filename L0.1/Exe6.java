/*
6) Dado o código da classe abaixo:
*/

public class Exe6 {
    public static void main(String args[]){
        letraa();
        letrab();
        letrac();
    }

    public static void letraa(){
        //letra a - a) Informe o que o programa abaixo imprimirá na tela, monstrando a representação de memória que o programa terá ao final da execução da main.
        //cria espaços de memoria q1 e q2
        Quadrado q1, q2;
        // instancia q1 com x = 2 e y = 4
        q1 = new Quadrado(2, 4);
        // instancia q2 com x = 5 e y = 6
        q2 = new Quadrado(5, 6);
        //atribui lado do objeto q1 como 10
        q1.lado = 10;
        
        //atribui x do objeto q1 como 2
        q1.x = 2;
        
        //atribui y do objeto q1 como 3
        q1.y = 3;

        //chama o metodo imprime para o objeto q1
        //imprime x= 2 e y = 3
        q1.imprime();

        //chama o metodo imprime para o objeto q2
        //imprime x= 5 e y = 6
        q2.imprime();
    }

    public static void letrab(){
        //letra b - Informe o que o programa abaixo imprimirá na tela, monstrando a representação de memória que o programa terá ao final da execução da main.
        //cria espaços de memoria q1 e q2
        Quadrado q1, q2;
        //cria espaços de memoria i e a com os valores 3 e 4 respectivamente
        int i = 3, a = 4;
        //instancia objeto q1 com x = 8 e y = 5
        q1 = new Quadrado(8, 5);
        //objeto q2 agora aponta para espaço de memoria do objeto q1
        q2 = q1;
        //a recebe (copia) valor de i
        a = i;
        //atributo lado do objeto q1 recebe 10 
        q1.lado = 10;
        //atributo x do objeto q1 recebe 2  (ja que q2 é ponteiro de q1) 
        q2.x = 2;
        //atributo y do objeto q1 recebe 3 (ja que q2 é ponteiro de q1) 
        q2.y = 3;

        //imprime objeto q1  x = 2 e y = 3 (ja que q2 é ponteiro de q1) 
        q2.imprime();
        //imprime objeto q1  x = 2 e y = 3
        q1.imprime();
    }

    public static void letrac(){
        //letra c - c) Informe o que o programa abaixo imprimirá na tela, monstrando a representação de memória que o programa terá ao final da execução da main.
        //cria espaços de memoria q1, q2 e q3
        Quadrado q1, q2, q3;

        //instancia q1 e props x = 4 e y = 7
        q1 = new Quadrado(4, 7);
        //q2 aponta para obj q1
        q2 = q1;
        //q3 aponta para obj q2 que aponta para obj q1
        q3 = q2;

        //imprime objeto q1 x = 4 e y =7 
        q1.imprime();
        //imprime objeto q1 x = 4 e y =7 (ja que q2 é ponteiro de q1)
        q2.imprime();
        //prop lado do obj q1 recebe 10
        q1.lado = 10;
        // prop x do objeto q1 recebe 2(ja que q3 é ponteiro de q1)
        q3.x = 2;
        //prop y do obj q1 recebe 3(ja que q3 é ponteiro de q1)
        q3.y = 3;
        //imprime objeto q1 x = 2 e y =3 (ja que q3 é ponteiro de q1)
        q3.imprime();

    }
} 

class Quadrado {
    public int lado;
    public int x;
    public int y;

    public Quadrado (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprime() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
    }
}