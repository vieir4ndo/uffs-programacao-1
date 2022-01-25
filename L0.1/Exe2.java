/*
2) Dado o código da classe abaixo, implemente os métodos getter e setter necessários para que os atributos da
classem possam ser lidos e alterados quando um objeto for instanciado. Além disso, implemente o método
carregaDoTeclado(), que, quando for chamado, faz a leitura do teclado de uma string e um inteiro cujos valores
são colocados nos atributos do objeto executando o método.

*/

import java.util.Scanner;

public class Exe2 {
    public static void main(String args[]){

        Autor a = new Autor();

        a.carregaDoTeclado();

        System.out.println("Nome: "+a.getNome()+" Id: "+a.getId());
    }
} 
class Autor {

        private String nome;
        private int id;

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getNome(){
            return this.nome;
        }

        public int getId(){
            return this.id;
        }

        public void carregaDoTeclado(){
            Scanner in = new Scanner( System.in );
            System.out.println("Digite o nome do autor:");
            this.nome = in.nextLine();

            System.out.println("Digite o id do autor:");
            this.id = in.nextInt();
        }
    }