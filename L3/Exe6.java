/*
*/

public class Exe6 {
    public static void main(String args[]){
     Thread p = new Processo();
     p.fork();
    }
} 
interface Pausavel { public void pausa(); public void continua(); }

class Processo implements Pausavel {
    public void fork(){
System.out.println("teste");
    }
    public void pausa(){}
    public void continua(){}
}

class Thread extends Processo { 
    public boolean acao(){
        boolean teste = false;
        return false;
    }
 }