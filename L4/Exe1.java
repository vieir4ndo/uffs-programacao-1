/*
1) Qual a saída gerada pelo código abaixo? Justifique sua resposta.
*/

public class Exe1 {
    public static void main(String args[]) {
        try {
            int j = -2;
            try {
                analisa(j);
            } catch (ERecurso a) {
                System.out.println("Recurso!");
            } catch (EMove a) {
                System.out.println("Move!");
            } catch (ECaminho a) {
                // CAI NESSA EXCEÇÃO PQ O J É -2 e é ela que o analise dispara
                System.out.println("Caminho!");
            } catch (EGeral a) {
                System.out.println("Geral!");
            } finally {
                j = 9;
            }
            analisa(j);
        } catch (ECaminho a) {
            System.out.println("Caminho!");
        } catch (EMove a) {
            System.out.println("Move!");
        } catch (ERecurso a) {
            System.out.println("Recurso!");
        } catch (Exception a) {
            // CAI NESSA EXCEÇÃO PQ O J É 9 E NÃO TEMOS TRATAMENTO PARA EXCEÇÃO EGeral nesse
            // try
            System.out.println("Excecao!");
        }
    }

    public static void analisa(int i) throws EGeral {
        if (i < 0) {
            throw new ECaminho();
        }
        if (i == 0) {
            throw new ERecurso();
        }
        if (i == 9) {
            throw new EGeral();
        }
    }
}

class EGeral extends Exception {
}

class EMovimento extends EGeral {
}

class ERecurso extends EGeral {
}

class ECaminho extends EMovimento {
}

class EMove extends EMovimento {
}
