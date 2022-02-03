/*
Implemente o método maiusculizaPrimeiraLetra(Sinal[] s). O vetor recebido como parâmetro pode conter
objetos Letra e Ponto. Um objeto Letrarepresenta uma letra (ex. a), enquanto um objeto Pontorepresenta uma
pontuação (ex.: !ou .). O método percorre o vetor, colocando todas as primeiras letras de cada frase em maiúsculo.
Ex. oi teste. mais uma frase. gera como saída Oi teste. Mais uma frase.
*/

public class Exe8 {
    public static void main(String args[]) {
        Sinal t[] = new Sinal[100];
        t[0] = new Letra("a");
        t[1] = new Letra("b");
        t[2] = new Ponto("!");
        Letra h = (Letra) t[1];
        h.maiusculiza();
        System.out.println(t[0].simbolo + t[1].simbolo + t[2].simbolo); // Imprime "aB!"

        Sinal[] texto = { new Letra("o"), new Letra("i"), new Letra("e"), new Ponto("!"), new Ponto(" "),
                new Letra("e"),
                new Letra("u"), new Ponto(","), new Ponto(" "), new Letra("a"), new Letra("m"), new Letra("o"),
                new Ponto(" "),
                new Letra("p"), new Ponto("."), new Letra("o"), new Ponto("."), new Letra("o"), new Ponto(".") };
        Service.maiusculizaPrimeiraLetra(texto);

        for (Sinal item : texto) {
            System.out.print(item.simbolo);
        }
        System.out.println();
    }
}

class Sinal {
    public String simbolo;

    public Sinal(String c) {
        this.simbolo = c;
    }
}

class Ponto extends Sinal {
    public Ponto(String c) {
        super(c);
    }
}

class Letra extends Sinal {
    public Letra(String c) {
        super(c);
    }

    public void maiusculiza() {
        String[] alphaMinusculo = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] alphaMaiusculo = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        for (int i = 0; i < 26; i++) {
            if (this.simbolo == alphaMinusculo[i] || this.simbolo == alphaMaiusculo[i]) {
                this.simbolo = alphaMaiusculo[i];
            }
        }
    }
}

class Service {
    public static void maiusculizaPrimeiraLetra(Sinal[] s) {
        Letra l = new Letra("a");
        Ponto p = new Ponto(".");
        int i;

        Letra l1 = (Letra) s[0];
        l1.maiusculiza();
        s[0] = l1;

        for (i = 1; i < s.length; i++) {
            if (s[i].getClass() == l.getClass() && s[i - 1].getClass() == p.getClass()) {

                Letra l2 = (Letra) s[i];
                l2.maiusculiza();
                s[i] = l2;
            }
        }
    }
}