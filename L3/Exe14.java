/*
11) Dada a classe abaixo e considerando as classes da questão 10:
Escreva uma classe chamada Contador que tenha um método estático que receba como parâmetro um vetor que
possa conter em suas entradas qualquer classe, inclusive aquelas que ainda não foram criadas. O método deve contar
quantas entradas do vetor são instâncias da classe Animal, quantas são Mamifero, quantas são Morcegoe quantas
não são nenhuma dessas. O método deve retornar um objeto Contagemcom as informações que obteve analisando o
vetor.
*/

public class Exe14 {
    public static void main(String args[]) {

    }
}

class Contagem {
    public int animais, mamiferos, morcegos, desconhecidos;
}

class Contador {
    public static Contagem metodo(Object[] lista) {
        Contagem c = new Contagem();
        Mamifero mamifero = new Mamifero();
        Morcego morcego = new Morcego();

        for (Object item : lista) {

            if (item.getClass() == mamifero.getClass()) {
                c.animais++;
                c.mamiferos++;
            } else if (item.getClass() == morcego.getClass()) {
                c.animais++;
                c.morcegos++;
            } else {
                c.desconhecidos++;
            }
        }
        return c;
    }
}

interface Rastreador {
}

class Animal {
    private int idade, tamanho;

    public void respirar() {
    }

    public void andar() {
    }
}

class Mamifero extends Animal {
    public void mamar() {
    }
}

class Morcego extends Mamifero implements Rastreador {
    private float sonar;

    public void voar() {
    }
}
