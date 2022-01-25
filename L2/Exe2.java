/*
2) Uma das habilidades mais importantes para se programar no paradigma de orientação a objetos é a capacidade de criar as classes com base na interpretação e abstração de uma cena/ambiente. Imaginando que você recebeu a tarefa de modelar um jogo de Xadrez, faça o diagrama UML com as classes, métodos e atributos necessários para cumprir a tarefa.  Uma peça pode estar vida ou morta e pode se mover pelo tabuleiro; 
o tabuleiro deve ser capaz de informar qual peça está numa determinada posição (com base na linha e coluna informadas), bem como informar quantas peças estão vivas (ou mortas).
*/

public class Exe2 {
    public static void main(String args[]) {

    }
}

class Tabuleiro {

    private Posicao[] posicoes = new Posicao[64];

    public Peca getPecaPorPosicao(int x, int y) {
        for (Posicao item : this.posicoes) {
            if (item.getX() == x && item.getY() == y) {
                return item.getPeca();
            }
        }
        return null;
    }

    public int getPecasVivas() {
        int cont = 0;
        for (Posicao item : this.posicoes) {
            if (item.getPeca().getViva()) {
                cont++;
            }
        }
        return cont;
    }
}

class Posicao {
    private int x;
    private int y;
    private Peca peca;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Peca getPeca() {
        return this.peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public void moverPara(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Peca {
    private boolean viva;

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public boolean getViva() {
        return this.viva;
    }
}