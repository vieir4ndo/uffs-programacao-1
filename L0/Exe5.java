/*
5) Faça um programa em Java imprima na tela a seguinte frase:
1 Java atrapalha muita gente
2 Java atrapalham atrapalham muita gente
3 Java atrapalham atrapalham atrapalham muita gente
4 Java atrapalham atrapalham atrapalham atrapalham muita gente
…
100 Java atrapalham atrapalham ... atrapalham atrapalham muita gente
*/

public class Exe5 {
    public static void main(String args[]){
    String texto;
    for (int i=1; i<101; i++){
        texto = (i) +" Java";
        for (int j=1; j<=i; j++){
            texto += " atrapalham ";
        }
        texto += "muita gente \n";
        System.out.println(texto);
    }
} 
}