package NivelIntermediario;

public class Hatake extends Ninja implements Sharinganinterface, AnbuInterface{

    public Hatake() {
    }

    public Hatake(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake!");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de Elite Anbu!");
    }

    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O sahringan Ativou!");
    }
}
