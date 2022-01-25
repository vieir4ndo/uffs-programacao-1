/*
8) Dado o código das classes abaixo, qual será a saída do programa na tela?
*/

public class Exe8 {
    public static void main(String args[]) {
        // ok
        // Father almost
        // Son done!
        Son s = new Son(5);

        // ok
        // Hommer almost
        Father f = new Father("Hommer");

        // Grandfather done
        Grandfather g = new Grandfather();

        // s.id = 5
        System.out.println("s.id = " + s.id);
    }
}

class Grandfather {
    private float avg;

    public Grandfather() {
        this("Grandfather done");
    }

    public Grandfather(String h) {
        System.out.println(h);
    }
}

class Father extends Grandfather {
    private String name;

    public Father(int i) {
        this("Father");
    }

    public Father(String h) {
        super("ok");
        name = h;
        System.out.println(h + " almost");
    }
}

class Son extends Father {
    public int id;

    public Son(int i) {
        this(3.14);
        id = i;
    }

    public Son(double t) {
        this();
    }

    public Son() {
        super(4);
        System.out.println("Son done!");
    }
}
