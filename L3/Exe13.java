/*
a) Escreva um método cujo protótipo é o seguinte: void update(Animal[] lista). O vetor de elementos pode
conter animais, mamíferos e morcegos. O seu método deve chamar os métodos respirar()e andar()de todos os
elementos na matriz; além disso, se o elemento for um Mamifero, o método mamar()deve ser chamado; se o
elemento for um Morcego, o método voar()deve ser chamado

Profe, vc sabe que morcegos são mamíferos, né?
*/
public class Exe13 {
    public static void main(String args[]) {

    }

    public void update(Animal[] lista) {
        Mamifero mamifero = new Mamifero();
        Morcego morcego = new Morcego();

        for (Animal item : lista) {
            item.respirar();
            item.andar();

            if (item.getClass() == mamifero.getClass()) {
                mamifero = (Mamifero) item;
                mamifero.mamar();
            } else if (item.getClass() == morcego.getClass()) {
                morcego = (Morcego) item;
                morcego.voar();
            }
        }
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
