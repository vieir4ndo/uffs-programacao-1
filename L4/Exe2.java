/*
2) Dado o código abaixo:
a) Implemente a classe Gerenciador, com o método analisa(). Se a string passada como parâmetro possuir
tamanho igual a zero, o método levanta a exceção TokenDesconhecido;se a string possuir tamanho igual a 5, o
método levanta a exceção ComandoMalFormado. Para todos os outros casos, o método não levanda exceção alguma.

b) Suponha que o método analisa()levantou a exceção ComandoMalFormado durante a execução do código
acima, qual será a saía do programa? Justifique sua resposta.
No codigo que eu fiz a saida seria "Comando Mal Formado!", no código inicial, se compilasse, seria "Erro Sintaxe!", pois comando mal formado é filho de erro sintaxe

*/

public class Exe2 {
    public static void main(String args[]) {
        // CÓDIGOS COMENTADOS POIS JAVA ACUSA ERRO, primeiro catch nao permitia os dois
        // na sequencia, e os ultimos dois nunca eram throw no codigo
        try {
            Gerenciador g = new Gerenciador();
            String s = "";
            // s é instanciado com alguma informação
            g.analisa(s);
            // } catch (ErroSintaxe a) {
            // System.out.println("Erro Sintaxe!");
        } catch (TokenDesconhecido b) {
            System.out.println("Token Desconhecido!");
        } catch (ComandoMalFormado c) {
            System.out.println("Comando Mal Formado!");
        } catch (ErroSintaxe a) {
            System.out.println("Erro Sintaxe!");
            // } catch (ValorInvalido d) {
            // System.out.println("Valor Invalido!");
            // } catch (ErroExecucao e) {
            // System.out.println("Erro Execucao!");
        }
    }
}

class Gerenciador {
    public void analisa(String string) throws ErroSintaxe {
        int length = string.length();

        // Se a string passada como parâmetro possuir tamanho igual a zero, o método
        // levanta a exceção TokenDesconhecido;
        if (length == 0) {
            throw new TokenDesconhecido();
        }
        // Se a string possuir tamanho igual a 5, o método levanta a exceção
        // ComandoMalFormado.
        if (length == 5) {
            throw new ComandoMalFormado();
        }
        // Para todos os outros casos, o método não levanda exceção alguma
    }
}

class ErroInterpretador extends Exception {
}

class ErroSintaxe extends ErroInterpretador {
}

class ErroExecucao extends ErroInterpretador {
}

class TokenDesconhecido extends ErroSintaxe {
}

class ComandoMalFormado extends ErroSintaxe {
}

class ValorInvalido extends ErroExecucao {
}