/*
7) Dadas as classes abaixo:
Implemente o método estático getVariavelByNome() na classe Dicionario. Esse método recebe como
parâmetro uma Stringe retorna um objeto do tipo Var. O método procura dentro do vetor tabela por uma
entrada cujo campo nome seja igual à String passada como parâmetro. Se encontrar um objeto Varque tenha o nome
igual ao parâmetro, retorna esse objeto, caso contrário retorna null.

*/

public class Exe7 {
    public static void main(String args[]){
        Var test = Dicionario.getVariavelByNome("teste2");
        Var test1 = Dicionario.getVariavelByNome("teste");

        System.out.println(test.getValor());
        System.out.println(test1.getValor());
    }
} 
class Var {
    public int valor;
    public String nome;

    public Var(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor(){
        return this.valor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}

class Dicionario {
    public static Var tabela[] = {
        new Var(20, "teste"),
        new Var(10, "teste2"),
        new Var(15, "teste3")
    };

    public static Var getVariavelByNome(String nome){

        for(Var item : tabela){
            if (item.nome == nome){
                return item;
            }
        }
        return null;
    }
}