/*
5) Escreva o código dos métodos indicados na classe Circulo abaixo. Implemente também os métodos getter e
setter para que seja possível ler e colocar valor na propriedade raio dos objetos da classe. Usando a classe
Circulo, escreva um programa em Java que crie um círculo definindo o seu raio como um valor lido do teclado.
Em seguida, o programa deve imprimir o raio e também a área e a circunferência do círculo criado, que são
retornados, respectivamente, pelos métodos area e circunf.
*/
import java.util.Scanner;

public class Exe5 {
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        System.out.print("Raio:");
        int raio = in.nextInt();
        Circulo c1 = new Circulo(raio);

        System.out.println("Círculo");
        System.out.println("Raio: "+ c1.getRaio());
        System.out.println("Área: "+ c1.area());
        System.out.println("Circunferência: "+ c1.circunf());
    }
} 

class Circulo {
    private int raio;

    public int getRaio(){
        return this.raio;
    }

    public void setRaio(int raio){
        this.raio = raio;
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }
    public double circunf() {
        return Math.PI * this.raio * 2;
    }
}