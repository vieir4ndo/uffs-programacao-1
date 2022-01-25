/*
7) Um número primo é aquele que é divisível apenas por 1 e por ele mesmo. Nesse caso, ser divisível é ter o resto
da divisão inteira resultando em zero, ou seja, dividir um número sem gerar vírgula. Por exemplo, o número 5 pode
ser dividido apenas por 1 e por ele mesmo: 5 / 1 = 5, resto 0; e 5 / 5 = 1, resto 0. Faça um programa em Java que
imprima na tela os 15 primeiros números primos existentes.

*/

import java.util.ArrayList;

public class Exe7 {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=1;
        while (arr.size() < 15){
            i++;
            int multiplos =0;
            for (int j=1; j< i; j++){
                if (i % j == 0){
                    multiplos++;
                }
            }
            if (multiplos < 2) {
                arr.add(i);
            }
        }
        System.out.println(arr.toString());
     
    }
} 