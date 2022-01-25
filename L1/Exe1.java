/*
1) Dado o código da classe abaixo:
Dadas as variáveis abaixo, indique se cada uma dos comandos seguintes funciona. Se houver algum erro nesses
comandos, diga qual é esse erro (e justifique).
a) c.dados[10] = ' i ';
b) h.setIdentificacao(st, num);
c) c.setIdentificacao(12, "Outro rótulo");
d) c = new BlurayDisc();
e) h.rotulo = "Outro rótulo";
f) num = 2.34f;
g) num = h.densidade;
h) st = h.getRotulo();
i)c = new BlurayDisc(st, 234);
j) c.dados[100] = "Dado posição 100";
*/

public class Exe1 {
    public static void main(String args[]){
        BlurayDisc c;
        BlurayDisc h = new BlurayDisc("Teste", 1);
        String st = "teste";
        float num;

        //Não funciona. não pode atribuir por nao foi instanciada
        //a) c.dados[10] = ' i ';

        //Não Funciona pois o metodo está escrito errado
        //b) h.setIdentificacao(st, num);

        //Não funciona. não pode atribuir por nao foi instanciada
        //c) c.setIdentificacao(12, "Outro rótulo");

        //Não Funciona pois nao existe esse construtor
        //d) c = new BlurayDisc();

        //Não funciona pois rotulo é um atributo privado
        //e) h.rotulo = "Outro rótulo";

        //Funciona
        //f) num = 2.34f;

        //Funciona
        //g) num = h.densidade;

        //Não Funciona pois metodo é privado
        //h) st = h.getRotulo();

        //Funciona
        //i) c = new BlurayDisc(st, 234);

        //Não funciona só com o código de cima pois c não foi instanciado lá
        //j) c.dados[100] = "Dado posição 100";
    }
} 

class BlurayDisc {
    private String rotulo;
    protected int id;
    protected float densidade;
    public char[] dados;

    public BlurayDisc(String rotulo, int id) {
        setIdentificação(rotulo, id);
        this.dados = new char[4096];
    }
    public void setIdentificação(String rotulo, int id) {
        this.rotulo = rotulo;
        this.id = id;
    }
    private String getRotulo() {
        return this.rotulo;
    }
}