package NivelIntermediario;

public class Haruno extends Ninja{

    public Haruno() {
    }

    public Haruno(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void ativarCura() {
        System.out.println("Meu nome é " + nome + ". E eu ativei a cura fora do comum!");
    }
}
