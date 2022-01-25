/*
1) Dado o código da classe abaixo, faça um programa que instancie um objeto Autor e leia do teclado os dados
necessários para preencher todos atributos do objeto instanciado.
*/

import java.util.Scanner;

public class Exe1 {

    public static void main(String args[]){

        Scanner in = new Scanner( System.in );
        
        Autor a = new Autor();

        System.out.println("Digite o nome do autor:");
        a.nome = in.nextLine();

        System.out.println("Digite o id do autor:");
        a.id = in.nextInt();

        System.out.println("Nome: "+a.nome+" Id: "+a.id);
     
    }
} 
class Autor {
    public String nome;
    public int id;
}