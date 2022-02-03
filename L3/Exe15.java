/*
12) Utilizando as classes e interfaces da questão 10 e dado o código da classe abaixo:
a) Sem fazer alteração na classe NaoPodeAlterar, podendo alterar (editar métodos, criar novos, etc) quaisquer
outras classes, contanto que todos os métodos gerem saída (não vazia) e contenham uma única chamada a
System.out.println()(ou derivados), sem utilização de \nnas strings, faça as alterações necessárias para que
a seguinte saída seja produzida pelo programa:
b) O conceito utilizado para realizar essas ações é o override e o overload de métodos. De forma clara e sintetizada,
defina o que é cada um desses conceitos.

*/

public class Exe15 {
    public static void main(String args[]) {
        Animal a = new Animal();
        Mamifero m = new Mamifero();
        Morcego o = new Morcego();
        a.respirar();
        m.mamar();
        m.respirar(2);
        o.voar();
        o.andar(3.14f);
        o.voar();
        m.respirar();
    }
}

interface Rastreador {
}

class Animal {
    private int idade, tamanho;

    public void respirar() {
        System.out.println("Respirando");
    }

    public void andar() {
        System.out.println("Andando");
    }
}

class Mamifero extends Animal {
    public void mamar() {
        System.out.println("Mamando");
    }

    public void respirar(int i) {
        super.respirar();
        System.out.println("Respira mamífero " + i);
    }

    @Override
    public void respirar() {
        super.respirar();
        System.out.println("Respirando mamifero");
    }
}

class Morcego extends Mamifero implements Rastreador {
    private float sonar;

    public void voar() {
        System.out.println("Voando");
    }

    public void andar(float f) {
        super.andar();
        System.out.println("Morcego andando no ar por " + f);
    }
}

/*
 * b
 * 
 * Override é usando quando temos um metodo com mesma assinatura na classe filha
 * e pai e queremos que um deles sobreescreva o outro método, ou seja, que ele
 * seja chamado ao incovar o método, entãousamos a tag @Override
 * Já Overload é a prática de criar métodos com mesmo nome porém com algumas
 * diferenças sutis em sua assinatura, ou seja, com número e tipo de parâmetros
 * distintos, acredito que até tipos de retorno sejam considerados. (?)
 * 
 */