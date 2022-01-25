/*
8) Seguindo o enunciado da questão 7), faça um programa em Java que imprima na tela os números primeiros
existentes entre os números 100 e 200.

*/
import java.util.ArrayList;

public class Exe8 {
    public static void main(String args[]){
       ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i =100; i< 200; i++){
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