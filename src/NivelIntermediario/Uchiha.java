package NivelIntermediario;

public class Uchiha extends Ninja implements Sharinganinterface {

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". esse é meu ataque Uchiha de fogo , e eu conclui: " + numeroDeMissoesConcluidas + " missões.");
    }

    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O sahringan Ativou e eu sou Uchiha!");
    }

}

