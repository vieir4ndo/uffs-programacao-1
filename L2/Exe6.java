/*
6) Modele um sistema que represente um PC. Um PC possui programas que rodam na CPU. Cada programa pode ler e
escrever de um espaço de memória. Os espaços de memória são limitados (ex.: existem 30 deles) e controlados pelo SO (Sistema Operacional. O SO é o único capaz de dar espaços de memória para uso (e receber eles de volta quando um programa decide não usá-los mais). Um programa pode usar N espaços de memória. Além da memória, um
programa pode ter acesso a um espaço de disco. Assim como um espaço de memória, um espaço no disco funciona na
forma endereço/valor: com um endereço (ex. 5), pode-se escrever ou ler um dado daquele espaço. Espaço de
memória e disco são exclusivos de um programa depois que esse os recebe do SO. A CPU possui uma lista de
programas em execução.
*/

import java.util.List;
import java.util.ArrayList;

public class Exe6 {
    public static void main(String args[]) {
        CPU cpu = new CPU();
        SO so = new SO(cpu);
        PC pc = new PC(cpu, so);

        Programa p1 = new Programa("Adobe");
        Programa p2 = new Programa("LogiSim");
        Programa p3 = new Programa("VSCode");

        pc.adicionarPrograma(p1);
        pc.adicionarPrograma(p2);

        pc.startPrograma(p1);
        pc.startPrograma(p2);

        pc.stopPrograma(p1);

        pc.removerPrograma(p1);
        pc.adicionarPrograma(p3);

        pc.startPrograma(p1);
        pc.startPrograma(p3);
    }
}

class PC {
    private List<Programa> todosOsProgramas;
    private CPU cpu;
    private SO so;

    public PC(CPU cpu, SO so) {
        this.todosOsProgramas = new ArrayList<Programa>();
        this.cpu = cpu;
        this.so = so;
    }

    public void adicionarPrograma(Programa p) {
        this.todosOsProgramas.add(p);
        this.so.atualizarProgramas(todosOsProgramas);
    }

    public void removerPrograma(Programa p) {
        this.todosOsProgramas.remove(p);
        this.so.atualizarProgramas(todosOsProgramas);
    }

    public void startPrograma(Programa p) {
        if (this.todosOsProgramas.contains(p)) {
            this.so.alocarEspacoMemoriaRAM(p);
            this.so.alocarEspacoMemoriaDisco(p);
        } else {
            System.out.println("Você não tem esse programa em seu pc.");
        }
    }

    public void stopPrograma(Programa p) {
        if (this.todosOsProgramas.contains(p)) {
            this.so.desalocarEspacosMemoriaRAM(p);
            this.so.desalocarEspacosMemoriaDisco(p);
        } else {
            System.out.println("Você não tem esse programa em seu pc.");
        }
    }
}

class SO {
    private List<EspacoMemoria> espacoMemoriaRAM;
    private List<EspacoMemoria> espacoMemoriaDisco;
    private List<Programa> todosOsProgramas;
    private CPU cpu;

    public SO(CPU cpu) {
        this.todosOsProgramas = new ArrayList<Programa>();
        this.cpu = cpu;
        this.espacoMemoriaRAM = new ArrayList<EspacoMemoria>(30);
        this.espacoMemoriaDisco = new ArrayList<EspacoMemoria>(30);
        for (EspacoMemoria item : this.espacoMemoriaRAM) {
            EspacoMemoria e = new EspacoMemoria();
            e.setEndereco("");
            e.setValor("");
            this.espacoMemoriaRAM.add(e);
            this.espacoMemoriaDisco.add(e);
        }
    }

    public void atualizarProgramas(List<Programa> programas) {
        this.todosOsProgramas = programas;
    }

    public void alocarEspacoMemoriaRAM(Programa p) {
        boolean alocou = false;
        if (!this.cpu.running(p))
            this.cpu.startPrograma(p);

        for (EspacoMemoria item : this.espacoMemoriaRAM) {
            if (item.getValor() == "" && this.espacoMemoriaRAM.size() < 30) {
                p.escreverEspacoMemoriaRAM(item);
                item.setValor(p.getNome());
                System.out.println("Mémória RAM alocada para " + p.getNome());
                alocou = true;
                break;
            } else {
                System.out.println("Mémoria RAM cheia");
                break;
            }
        }
        if (!alocou) {
            System.out.println("Não foi possível alocar espaço em memória RAM");
        }
    }

    public void desalocarEspacosMemoriaRAM(Programa p) {
        if (this.cpu.running(p)) {
            this.cpu.stopPrograma(p);
            for (EspacoMemoria item : this.espacoMemoriaRAM) {
                if (item.getValor() == p.getNome()) {
                    p.removerEspacoMemoriaRAM(item);
                    item.setValor("");
                    System.out.println("Mémoria RAM limpa de " + p.getNome());
                }
            }
        } else {
            System.out.println("O programa " + p.getNome() + " não está rodando.");
        }
    }

    public void alocarEspacoMemoriaDisco(Programa p) {
        if (this.cpu.running(p)) {
            boolean alocou = false;
            for (EspacoMemoria item : this.espacoMemoriaDisco) {
                if (item.getValor() == "" && this.espacoMemoriaRAM.size() < 30) {
                    p.escreverEspacoMemoriaDisco(item);
                    item.setValor(p.getNome());
                    System.out.println("Mémória em Disco alocada para " + p.getNome());
                    alocou = true;
                    break;
                } else {
                    System.out.println("Mémoria Disco cheia");
                    break;
                }
            }
            if (!alocou) {
                System.out.println("Não foi possível alocar espaço em memória Disco");
            }
        } else {
            System.out.println("O programa " + p.getNome() + " não está rodando.");
        }
    }

    public void desalocarEspacosMemoriaDisco(Programa p) {
        if (this.cpu.running(p)) {
            for (EspacoMemoria item : this.espacoMemoriaDisco) {
                if (item.getValor() == p.getNome()) {
                    p.removerEspacoMemoriaDisco(item);
                    item.setValor("");
                }
            }
            System.out.println("Mémoria limpa de " + p.getNome());
        } else {
            System.out.println("O programa " + p.getNome() + " não está rodando.");
        }
    }

    public List<Programa> getTodosProgramas() {
        return this.todosOsProgramas;
    }
}

class CPU {
    private List<Programa> programasRodando;

    public CPU() {
        this.programasRodando = new ArrayList<Programa>();
    }

    public void startPrograma(Programa p) {
        this.programasRodando.add(p);
    }

    public void stopPrograma(Programa p) {
        this.programasRodando.remove(p);
    }

    public boolean running(Programa p) {
        return this.programasRodando.contains(p);
    }
}

class Programa {

    private String nome;
    private List<EspacoMemoria> espacoMemoriaRam;
    private List<EspacoMemoria> espacoMemoriaDisco;

    public Programa(String nome) {
        this.espacoMemoriaRam = new ArrayList<EspacoMemoria>();
        this.espacoMemoriaDisco = new ArrayList<EspacoMemoria>();
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EspacoMemoria> lerEspacoMemoriaRAM() {
        return this.espacoMemoriaRam;
    }

    public void escreverEspacoMemoriaRAM(EspacoMemoria espacoMemoria) {
        this.espacoMemoriaRam.add(espacoMemoria);
    }

    public void removerEspacoMemoriaRAM(EspacoMemoria espacoMemoria) {
        this.espacoMemoriaRam.remove(espacoMemoria);
    }

    public void removerEspacoMemoriaDisco(EspacoMemoria espacoMemoria) {
        this.espacoMemoriaDisco.remove(espacoMemoria);
    }

    public List<EspacoMemoria> lerEspacoMemoriaDisco() {
        return this.espacoMemoriaDisco;
    }

    public void escreverEspacoMemoriaDisco(EspacoMemoria espacoMemoria) {
        this.espacoMemoriaDisco.add(espacoMemoria);
    }
}

class EspacoMemoria {
    private String endereco;
    private String valor;

    public EspacoMemoria() {
        this.endereco = "";
        this.valor = "";
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}