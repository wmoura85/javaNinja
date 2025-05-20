package NivelIntermediario;

public class Hyuga extends Ninja{

    public Hyuga() {
    }

    public Hyuga(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void expelirChakra() {
        System.out.println("meu nome é " + nome + ". E eu ativei o Chakra, eu sou um Hyuga!");
    }
}
