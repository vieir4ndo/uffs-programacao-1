/*
5) O código abaixo contem as propriedades que descrevem um post de um blog. Não há o código dos métodos.
Escreva o código dos métodos necessários para ambas as classes e escreva um programa que instancie um objeto
Post, leia do teclado as informações necessárias para preencher todas as propriedades do objeto e, por último,
imprima essas informações através do método imprimeResumo(). As classes devem conter métodos
getters/setters.

*/
import java.util.Scanner;

public class Exe5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o texto do post");
        String texto = in.nextLine();

        System.out.println("Informe o nome do autor");
        String nomeAutor = in.nextLine();

        System.out.println("Informe o id do autor");
        int idAutor = in.nextInt();

        Autor a1 = new Autor(nomeAutor, idAutor);
        Post p1 = new Post(a1, texto);

        p1.imprimeResumo();
    }
} 

class Autor {
    private String nome;
    private int id;

    public Autor(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

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
}
class Post{
    private Autor autor;
    private String texto;

    public Post(Autor autor, String texto){
        this.autor = autor;
        this.texto = texto;
    }

     public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public String getTexto(){
        return this.texto;
    }
    
    public void imprimeResumo() {
        System.out.println("Post");
        System.out.println("Id autor: " + this.autor.getId());
        System.out.println("Nome autor: " + this.autor.getNome());
        System.out.println("Texto: " + this.texto);
    }
}
