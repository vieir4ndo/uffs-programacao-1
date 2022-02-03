/*
Implemente o método Media media(Numero[] s). O vetor recebido como parâmetro pode conter objetos
NumeroComume NumeroImaginario. O valor de um número comum é obtido através do método getValor(), ao
passo que o valor de um número imaginário é obtido através do método getValorCompleto(). Implemente o
método media()para que retorne um objeto Media, sendo que sua propriedade comunsterá a média dos valores
dos números comuns existentes no vetor, e a propriedade imaginariosterá a média dos valores dos números
imaginários existentes no vetor.
*/

public class Exe10 {
    public static void main(String args[]) {
        NumeroComum n1 = new NumeroComum(1);
        NumeroComum n2 = new NumeroComum(2);
        NumeroComum n3 = new NumeroComum(3);

        NumeroImaginario n4 = new NumeroImaginario(4, 4);
        NumeroImaginario n5 = new NumeroImaginario(5, 5);
        NumeroImaginario n6 = new NumeroImaginario(6, 6);

        Numero[] n = { n1, n2, n3, n4, n5, n6 };

        Media m = Service.media(n);
        System.out.println("A média comuns é " + m.comuns);
        System.out.println("A média imaginários é " + m.imaginarios);
    }
}

class Numero {
}

class NumeroComum extends Numero {
    private int valor;

    public NumeroComum() {
    }

    public NumeroComum(int val) {
        this.valor = val;
    }

    public int getValor() {
        return valor;
    }
}

class NumeroImaginario extends Numero {
    private int valorReal;
    private int i;

    public NumeroImaginario(int val, int i) {
        this.valorReal = val;
        this.i = i;
    }

    public int getValorCompleto() {
        return valorReal + i;
    }
}

class Media {
    public double comuns;
    public double imaginarios;
}

class Service {
    public static Media media(Numero[] s) {
        Media m = new Media();
        NumeroComum nc = new NumeroComum();
        int contC = 0, contI = 0;

        for (Numero item : s) {
            if (item.getClass() == nc.getClass()) {
                contC++;
                NumeroComum temp = (NumeroComum) item;
                m.comuns = (m.comuns + temp.getValor());
            } else {
                contI++;
                NumeroImaginario temp2 = (NumeroImaginario) item;
                m.imaginarios = (m.imaginarios + temp2.getValorCompleto());
            }
        }

        m.comuns = m.comuns / contC;
        m.imaginarios = m.imaginarios / contI;

        return m;
    }
}