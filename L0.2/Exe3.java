/*
3) Escreva o código dos métodos indicados na classe Retangulo abaixo. 
Implemente também os métodos getter e setter para que seja possível ler e colocar valores nas propriedades dos objetos da classe.
Usando a classe Retangulo, escreva um programa em Java que crie um retângulo com base 7 e altura 4 e imprima os valores das suas dimensões através do método imprimeDimensoes(). Além disso, o programa deve ler do teclado as informações necessárias para modificar as duas dimensões do retângulo criado e imprimir novamente as suas
dimensões através do método imprimeDimensoes().
*/
import java.util.Scanner;

public class Exe3 {
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        Retangulo r1 = new Retangulo(7,4);
        r1.imprimeDimensoes();

        System.out.println("Digite a base do retângulo:");
        r1.setBase(in.nextInt());
        System.out.println("Digite a altura do retângulo:");
        r1.setAltura(in.nextInt());

        r1.imprimeDimensoes();
    }
} 

class Retangulo {
    private int base;
    private int altura;

    public void setBase(int base){
        this.base = base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getBase(){
        return this.base;
    }

    public int getAltura(){
        return this.altura;
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void imprimeDimensoes() {
        System.out.println("Retângulo");
        System.out.println("Altura: " + this.altura);
        System.out.println("Base: " + this.base);
    }
}
