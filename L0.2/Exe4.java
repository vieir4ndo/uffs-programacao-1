/*
4) Implemente os métodos int area(), int perimetro() e double diagonal() para a classe Retangulo
do Exercício 3). Estes métodos devem retornar, respectivamente, a área, o perímetro e a diagonal de um retângulo
representado pela classe. Usando a classe Retangulo, escreva um programa em Java que crie retângulos e
imprima as suas dimensões, as suas áreas, os seus perímetros e as suas diagonais.

*/

public class Exe4 {
    public static void main(String args[]){

        Retangulo r1 = new Retangulo(10, 5);
        Retangulo r2 = new Retangulo(5, 7);

        r1.imprimeDimensoes();
        r2.imprimeDimensoes();

        System.out.println("Retângulo 1");
        System.out.println("Área: "+ r1.area());
        System.out.println("Perímetro: "+ r1.perimetro());
        System.out.println("Diagonal: "+ r1.diagonal());

        System.out.println("Retângulo 2");
        System.out.println("Área: "+ r2.area());
        System.out.println("Perímetro: "+ r2.perimetro());
        System.out.println("Diagonal: "+ r2.diagonal());
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

    public int area(){
        return this.altura*this.base;
    } 

    public int perimetro(){
        return this.altura*2 + this.base*2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.altura,2) + Math.pow(this.base,2));
    }
}
