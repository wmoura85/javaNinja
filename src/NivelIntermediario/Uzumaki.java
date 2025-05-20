package NivelIntermediario;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    public void modoSabioAtivado() {
        System.out.println("Meu nome é " + nome + ". E eu ativei o modo sábio!");
    }


    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". esse é meu ataque Uchiha de fogo , e eu conclui: " + numeroDeMissoesConcluidas + " missões, " + "meu rank: " + rank);
    }
}
