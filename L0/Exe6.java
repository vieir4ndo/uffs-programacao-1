/*
6) Faça um programa em Java que calcule a idade de uma pessoa baseada no seu ano de nascimento. Você não
precisa ler os valores do teclado, pode apenas declarar e utilizar as variáveis.

*/
import java.util.Calendar;

public class Exe6 {
    public static void main(String args[]){
     Calendar cal = Calendar.getInstance();
     int anoNascimento = 2000;
    System.out.println(cal.get(Calendar.YEAR) - anoNascimento);
    }
} 