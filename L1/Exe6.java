/*
6) Implemente uma classe chamada Parser que contenha um método estático analize(). O método deve receber
como parâmetro um vetor de Strings
e retornar quantas vezes a palavra "token"ou qualquer outra palavra que
inicie pela letra 'h' aparecem no vetor.
*/

public class Exe6 {
    public static void main(String args[]){
     String[] myVector = {"homem", "meutoken","teste"};

     int ocurrences = Parser.analize(myVector);
     System.out.println(ocurrences);
    }
} 

public class Parser {
    public static int analize(String vetor[]){
        int cont = 0;
         for(String item : vetor){
            if (item.charAt(0) == 'h'){
                cont++;
            }
            if (item.contains("token")){
                cont++;
            }
        }
        return cont;
    }
}