/*
10) Resolva a questão 8) sem utilizar operadores de divisão ( / ) e multiplicação ( * ). Você pode utilizar apenas
soma e substração.
*/
import java.util.ArrayList;

public class Exe10 {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i =1; i< 200; i++){
            int multiplos =0;
            for (int k=1; k<= i; k++){
                int resto = i;
                while (resto >= k) {
                    resto = resto - k;
                }
                if (resto == 0){
                    multiplos++;
                }
            }
            if (multiplos==2){
                arr.add(i);
            }
        }
        System.out.println(arr.toString());
    }
} 