/*
4) Faça um programa em Java imprima na tela a tabuada do número 6 e do número 2, lado a lado, no seguinte
formato:
1 x 6 = 6 1 x 2 = 2
2 x 6 = 12 2 x 2 = 4
3 x 6 = 18 3 x 2 = 6
4 x 6 = 24 4 x 2 = 8
5 x 6 = 30 5 x 2 = 10
6 x 6 = 36 6 x 2 = 12
7 x 6 = 42 7 x 2 = 14
8 x 6 = 48 8 x 2 = 16
9 x 6 = 54 9 x 2 = 18
10 x 6 = 60 10 x 2 = 20
*/

public class Exe4 {
    public static void main(String args[]){
      for (int i =1; i< 11; i++){
          System.out.format("%3d %2s %3d %2s %3d %10d %2s %3d %2s %3d \n",
                    i, "x", 6, "=", i*6, i, "x", 2,"=", i*2);
     }
    }
} 