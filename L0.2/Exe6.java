/*
6) Implemente os seguintes dois métodos para a classe Retangulo do Exercício 3). 
O método void aumenta(int valor) deve modificar o retângulo somando valor a ambas as suas dimensões. 
O método void aumentaParaConterCirculo(Circulo circulo) recebe como parâmetro um círculo representado pela
classe Circulo do Exercício 5). Este método deve modificar o retângulo de modo que o círculo recebido caiba
dentro do retângulo modificado. Para modificar o retângulo, deve ser usado o método aumenta.

Usando as classes Retangulo e Circulo, escreva um programa em Java que crie um retângulo e um círculo, use os métodos aumenta e aumentaParaConterCirculo e imprima as dimensões do retângulo antes e depois da utilização dos
métodos acima.
*/

public class Exe6 {
    public static void main(String args[]){

        Retangulo r1 = new Retangulo(5, 10);
        r1.imprimeDimensoes();

        r1.aumenta(5);

        r1.imprimeDimensoes();

        Circulo c1 = new Circulo(12);

        r1.aumentaParaConterCirculo(c1);

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

    public int area(){
        return this.altura*this.base;
    } 

    public int perimetro(){
        return this.altura*2 + this.base*2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.altura,2) + Math.pow(this.base,2));
    }

    public void aumenta(int valor){
        this.altura = this.altura + valor;
        this.base = this.base + valor;
    }

    public void aumentaParaConterCirculo(Circulo c){
        if (c.getRaio() > this.base || c.getRaio() > this.altura){
            int diferencaBaseRaio = c.getRaio() - this.base;
            int diferencaAlturaRaio = c.getRaio() - this.altura;

            if (diferencaAlturaRaio > diferencaBaseRaio){
                this.aumenta(diferencaAlturaRaio);
            }
            else {
                this.aumenta(diferencaBaseRaio);
            }
        }
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